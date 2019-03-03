package com.hadoop.hdfs;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * @author Ming
 * @描述 JavaAPI操作Hdfs文件系统
 * @注意 配置windows Hadoop HADOOP_HOME
 */
public class HdfsClientDemo {

    private static FileSystem fileSystem;
    private static Configuration conf;
    private static String HDFS_URI = "hdfs://192.168.25.136:9000";
    private static String USER = "root";

    public static void main(String[] args) {


        try {
            init();
            testUpLoad();
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
}
