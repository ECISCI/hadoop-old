package com.hadoop.hdfs;

public class Hdfs {
    /**
     * @1 Hdfs工作机制 概述
     */

    /*1. Hdfs分为两大角色,Namenode,Datanode(Secondary Namenode)
     *
     *2.Namenode负责管理整个文件系统的元数据
     *
     *3.Datanode负责管理用户的文件数据块
     *
     *4.文件会按照固定的大小(blockSize)切成若干后分布式存储在若干台datanode上
     *
     *5.每一个文件块可以有多个副本,并存放在不同的datanode上
     *
     *6.Datanode会定期向namenode汇报自身所保存的文件block信息,而namenode
     *
     * 则会负责保持文件副本数量
     *
     *7.Hdfs的内部工作机制对客户端保持透明,客户端请求访问Hdfs都是通过namenode申请来进行
     *
     */

    // @2 HDFS写数据流程

    /**
     * @3上传时,datanode的选择策略
     */

    /*1.第一个副本优先考虑client最近的(随机架)
     *
     *2.第二个副本在考虑跨机架挑选一个datanode,增加副本的可靠性
     *
     *3.第三个副本就在第一个副本同机架挑选一台datanode存放
     */
}
