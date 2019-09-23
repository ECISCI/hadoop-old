package com.it521.hadoop.hdfs.test;

import com.it521.utils.L;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.*;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.Map;

/**
 * @author Ming
 * @描述 JavaAPI操作Hdfs文件系统
 * @注意 配置windows Hadoop HADOOP_HOME
 */
public class HdfsClientDemo {

    private static final String TAG =HdfsClientDemo.class.getSimpleName();

    private static FileSystem fileSystem;
    private static Configuration conf;
    /**
     * 远程Hadoop Namenode
     */
    private static String HDFS_URI = "hdfs://192.168.25.132:9000";
    /**
     * 这个参数具体作用有待考证
     */
    private static String USER = "root";

    public static void main(String[] args) {


        try {
            init();
//            testUpLoad();
            testList();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * @描述 初始化Hdfs参数
     */
    public static void init() throws URISyntaxException, IOException, InterruptedException {

        conf = new Configuration();

        conf.set("fs.defaultFs", HDFS_URI);

        /**
         * @解释 拿到一个文件系统操作的客户端实例对象
         *
         * @注意 客户端去操作hdfs时, 是有一个用户身份的
         *
         * @1 默认情况下 hdfs客户端api会从jvm中获取一个参数来作为自己的用户身份
         *
         * @2 也可以在构造客户端fileSystem对象时, 通过参数传递进去
         *
         * @提醒 那种方法都可以, 推荐使用第二种方法, 简单明了
         */
        fileSystem = FileSystem.get(new URI(HDFS_URI), conf, USER);

    }

    /**
     * @throws Exception 错误信息
     * @描述 将D盘下文件上传到hdfs的根目录
     */
    public static void testUpLoad() throws Exception {

        init();
        /**
         * 这段代码可有可无
         */
        Thread.sleep(2000);
        /**
         * @解释 : 将D盘下的access.log文件拷贝到hdfs根目录下
         */
        fileSystem.copyFromLocalFile(new Path("D:/access.log"), new Path("/access.log.copy"));
        fileSystem.close();
    }

    public static void testDownload() throws Exception {

        fileSystem.copyToLocalFile(new Path("/access.log.copy"), new Path("D:/"));
        fileSystem.close();
    }

    public static void testConf() {
        Iterator<Map.Entry<String, String>> iterator = conf.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
             //conf加载的内容
            L.i(TAG,entry.getValue() + "--" + entry.getValue());
        }
    }

    /**
     * @描述 创建目录
     */
    public static void testMakdir() throws Exception {
        boolean mkdirs = fileSystem.mkdirs(new Path("/aaa/bbb"));
        L.i(mkdirs);
    }

    /**
     * @描述 删除
     */
    public static void testDelete() throws Exception {
        boolean delete = fileSystem.delete(new Path("/aaa"), true);//true， 递归删除
        L.i(TAG,delete);
    }

    /**
     * @throws Exception
     * @描述
     */
    public static void testList() throws Exception {

        FileStatus[] listStatus = fileSystem.listStatus(new Path("/"));
        for (FileStatus fileStatus : listStatus) {

            L.e(TAG,fileStatus.getPath() + ":::::" + fileStatus.toString());
        }
        //会递归找到所有的文件
        RemoteIterator<LocatedFileStatus> listFiles = fileSystem.listFiles(new Path("/"), true);
        while (listFiles.hasNext()) {
            LocatedFileStatus next = listFiles.next();
            String name = next.getPath().getName();
            Path path = next.getPath();
            L.i(TAG,name + "::" + path.toString());
        }
    }

}
