package com.hadoop.hdfs;

/**
 * @author Ming
 * @描述 NameNode管理元素机制
 */
public class NamenodeManagerElement {

    /**
     * @1namenode对数据的管理采用三种存储形式
     */
    /*
     * 内存元数据(NameSystem)
     *
     * 磁盘元数据镜像文件
     *
     * 数据操作日志文件(可通过日志运算出元数据)
     */

    /**
     * @2 元数据存储机制
     */
    /* 1.内存中有一份完整的元数据(内存 meta data)
     *
     * 2.磁盘有一个准完整的元数据镜像(fsimage)文件(在namenode的工作目录中)
     *
     * 3.用于衔接内存metadata和持久化元数据镜像fsimage之间的操作日志(edits文件)
     *
     * 注:当客户端对hdfs中的文件进行新增或者修改操作,操作记录首先被计入edits日志文件中
     *
     * 当客户端操作成功后,相应的元数据会更新到内存meta.data中
     * */
    /**
     * @3分析
     */
    /* 1.当客户端向namenode发出更新元数据请求时,namenode会根据更新的数据内容存放位置等
     *
     * 从而来更新好元数据,而每次做的更新操作都会被记录在操作日志文件(edits)
     *
     * 2.为了防止namenode挂掉数据丢失从而准备一个secondaryNamenode,从而可以将namenode
     *
     * 上的数据备份,它会每隔一段时间(默认30分钟)去询问一次namenode，看看是否需要合并,checkpoint
     *
     * 当namenode上的操作日志文件大到一定的时候回告诉secondaryNamenode需要合并
     *
     * 3.此时namenode会滚动到当前在操作的日志文件edits.inprogress(目的是多下载一些到secondaryNamenode)
     *
     * 4.secondaryNamenode会将edits文件和镜像文件fsimage下载下来，接着会根据操作日志文件根据一些算法计算出元数据从而来和镜像文件（保存了namenode的元素据）进行合并存到内存中
     *
     * 5.secondaryNamenode会将内存中合并后的的元数据存到硬盘，序列化上传到namenode，
     *
     * 最后namenode会将secondaryNamenode上传的元数据存到镜像文件中，这样镜像文件就达到了备份的效果，
     *
     * 同时secondaryNamenode上也有对应的元数据，即使namenode挂掉我们也可以复制secondaryNamenode上的数据到namenode
     *
     */
    /**
     * @4注
     */
    /*
     * 如果namenode的硬盘损坏（或者说是工作目录没了）那么元数据还能恢复吗？
     *
     * 答案是能恢复大部分数据，上面第五步已经给出了解释，我们可以将secondaryNamenode的目录复制粘贴给它，
     *
     * 因为两者的结构数据是一样的。但是如果操作过快，比如我刚创建了一个文件夹。
     *
     * 然后删掉了目录，这个时候secondaryNamenode都没来得及下载备份，所以这条数据不能回复。
     *
     *
     *  配置namenode工作目录参数的时候，最后将namenode的工作目录配在多块磁盘上，同时往2块磁盘上写日志，内容是一样的
     *
     *  <property>
     *      <name>dfs.name.name.dir</name>
     *      <value>/root/hadoop/hdf1,/root/hadoop/hdf2</value>
     *  </property>
     * */
}

