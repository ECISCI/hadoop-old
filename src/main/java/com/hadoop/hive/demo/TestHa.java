package com.hadoop.hive.demo;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * @author Ming
 * @描述 操作高可用集群HDFS
 */
public class TestHa {

    // Hdfs地址
    private static String HDFS_URI = "hdfs://192.168.25.136:9000";

    // 用户名
    private static String USER = "root";

    public static void main(String[] args) throws IOException, URISyntaxException, InterruptedException {

        // 配置
        Configuration conf = new Configuration();

        conf.set("fs.defaultFs", HDFS_URI);

        FileSystem fileSystem = FileSystem.get(new URI(HDFS_URI), conf, USER);

        // 上传文件到Hdfs上
        fileSystem.copyFromLocalFile(new Path("D:/mumu.avi"), new Path("/"));

        // 关闭流
        fileSystem.close();
    }
}
