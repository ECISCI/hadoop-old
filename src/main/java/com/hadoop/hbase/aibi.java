package com.hadoop.hbase;

/**
 * @author Ming
 * @描述 Hbase
 */
public class aibi {

    /**
     * @1什么是Hbase
     */
    /* Hbase是一个高可靠,高性能,面向列,可伸缩的分布式存储系统,利用Hbase技术
     *
     * 可以在廉价的PC Server上搭建大规模接过话存储集群,
     *
     * Hbase的目标是存储并处理大型的数据,更具体你说是仅需使用普通的硬件配置
     *
     * 就能够处理由成千上万行和列所组成的大型数据
     *
     * hbase是google Bigdata的开源实现,但是也有很多不同之处
     *
     * 如:google Bigdata利用GFS作为其文件存储系统,Hbase利用hadoop hdfs
     *
     * 作为文件存储系统, google运行mapreduce 来处理Bigtable中海量数据
     *
     * hbase利用hadoop mapreduce来处理Hbase中海量数据,
     *
     * google bigTable用chubby作为协同服务,Hbase利用zookeeper作为对应
     */

    /**
     * @2与传统数据库的对比
     */
    /* 1. 传统数据库遇到的问题
     *
     *      1.1 数据量很大时无法存储
     *      1.2 没有很好的备份机制
     *      1.3 数据达到一定数量开始缓慢,很大的话基本无法支撑
     *
     * 2.Hbase优势
     *
     *      2.1 线性扩展,随着数据量增多,可以通过节点扩展进行支撑
     *      2.2 数据存储在hdfs上,备份机制健全
     *      2.3 通过zookeeper协协调查找数据,访问速度快
     */

    /**
     * @3hbase集群中的角色
     */
    /* 1.一个或者多个主节点,Hmaster
     *
     * 2.多个从节点,HreginoService
     */


}
