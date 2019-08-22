package com.it521.hbase;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.ConnectionFactory;
import org.apache.hadoop.hbase.client.Connection;

import java.io.IOException;

import org.apache.hadoop.hbase.client.Table;

public class Demo {

    public static void main(String[] args) {

    }

    /**
     * 初始化
     */
    public static void init() throws IOException {

        Configuration config = HBaseConfiguration.create();

        config.set("hbase.zookeeper.quorum", "master,work1,work2");// zookeeper地址

        config.set("hbase.zookeeper.property.clientPort", "2181");// zookeeper端口

        Connection connection = ConnectionFactory.createConnection(config);

        Table table = connection.getTable(TableName.valueOf("user"));

    }
}
