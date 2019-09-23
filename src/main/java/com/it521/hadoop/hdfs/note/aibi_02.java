package com.it521.hadoop.hdfs.note;

/**
 * @author Ming
 * @描述 HDFS原理
 * @解释 一条元数据 15Byte 一亿条数据大概为15GB
 */
public class aibi_02 {

    /**
     * @1.hdfs是什么
     */
    /*
     *  Hadoop分布式文件系统(HDFS) 被设计成适合运行在通用硬件上的分布式文件系统
     *
     *  1.HDFS 是一个高容错性的系统,适合部署在廉价的机器上
     *
     *  2.HDFS 提供高吞吐量的数据访问,非常适合大规模数据集上的应用
     *
     *  3.HDFS放宽了一部分 posix约束,来实现流式读取文件系统数据的目的
     *
     *  4.HDFS在最开始是作为apache Nutch搜索引擎项目的基础框架而开发的
     *
     *  5.HDFS 是apache hadoop core项目的一部分
     */
    /**
     * @2.hdfs三个重要组件 NameNode DataNode SecondaryNameNode
     */

    /**
     * @2.1Namenode
     */
    /* NameNode上保存着HDFS的名字空间
     *
     * 对任何文件系统元数据产生修改的操作,NameNode都会使用一种称为EditLog的是我日志记录下来
     *
     * Namenode在本地操作系统的文件系统中存储这个EditLog
     *
     * #### 整个文件系统的名字空间,包括数据块到文件的映射,文件属性等 都存储在一个称为fsimage的文件中
     *
     * 这个文件也放在Namenode所在的本地文件系统上
     *
     * NameNode在内存中保存着整个文件系统的名字空间和文件数据块映射(blockmap)的映像(一个4G的内存足够支撑大量的文件和目录)
     *
     * ######
     *
     *  NameNode启动时 从硬盘中读取EditLog和fsimage将所有EditLog中的事务作用在内存中的fsimage上
     *
     *  并将这个新版本的fsimage从内存中保存到本地磁盘
     *
     *  然后删除旧的EditLog
     *
     *  这个过程称为 检点(checkpoint)
     *
     *  在当前实现中,检点只发生在NameNode启动时
     *
     * ######
     *
     * NameNode负责维护文件系统命名空间,任何文件系统名字空间属性的修改,都将被Namenode记录下来
     *
     * 应用程序可以设置HDFS保存的文件的副本数目,文件副本数目成为文件副本系数,这个信息是由Namenode来保存
     */

    /**
     * @3.hdfs DataNode
     */

    /*
     * DataNode 将hdfs数据以文件的形式存储在本地文件系统中,它并不知道有关hdfs文件的信息
     *
     * 它把每个HDFS数据块存储在本地文件系统的一个单独的文件中
     *
     * DataNode并不在同一个目录创建所有的文件,实际上它用试探的方法来确定每个目录的最佳文件数目,并且在适当的时候创建子目录
     *
     * 在同一个目录中创建所有的本地文件并不是最优的选择,这是因为本地文件系统可能无法高校地在单个目录中支持大量的文件
     *
     * 当一个Datanode启动时,它会扫描本地文件系统,产生一个这些本地文件对应的所有HDFS数据块的列表
     *
     * 然后作为报告发送到NameNode这个报告就是块状态
     */

    /**
     * @4.hdfs SecondNamenode
     */
    /*
     * 1.NameNode响应SecondNamenode请求,将editLog推送给SecondNameNode,开始冲洗写一个新的EditLog
     *
     * 2.SecondaryNameNode收到来自NameNode的 fsimage文件和editLog
     *
     * 3.SNode 将fsimage加载到内存中,应用EditLog,并生成一个新的fsimage文件
     *
     * 4.SNode将新的fsimage 推送给Namenode
     *
     * 5.NameNode 用新的fsimage取代旧的fsimage并在fstime文件中几下检点发生时间
     */

    /**
     * @5.HDFS通信协议
     */
    /* 所有HDFS通信协议都是构建在TCP/IP协议上
     *
     * 客户端通过一个可配置的端口连接到Namenode通过ClientProtocol与NameNode交互
     *
     * 而DataNode是使用DataNodeProtocol与Namenode交互
     *
     * 在设计上Dnode通过周期性的向Nnode发送心跳和数据块来保持和Namenode的通信
     *
     * 数据块报告的信息包括数据块的属性(既数据块属于哪个文件)
     *
     * 数据块ID 数据块修改时间 Nnode的Dnode和数据块的映射关系就是通过系统启动时Dnode的数据块报告建立的
     *
     * 从clientProtocol和DataNodeProtocol抽象出一个远程过程调用(RPC)
     *
     * ######
     *
     * 在设计上,Nnode不会主动发起RPC,而是响应来自客户端和Dnode的RPC请求
     */
}
