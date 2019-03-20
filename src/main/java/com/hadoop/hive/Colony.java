package com.hadoop.hive;

/**
 * @author Ming
 * @描述 集群搭建
 */
public class Colony {

    /**
     * @!!!!需要7台虚拟机并保证每台虚拟机上有hadoop环境
     */

    /* 主机名            ip            所需软件                    运行进程
     *
     * hadoop01  192.168.25.136      jdk,hadoop         namenode,DFSZKFailoverController(zkfc)
     *
     * hadoop02  192.168.25.133      jdk,hadoop         namenode,DFSZKFailoverController(zkfc)
     *
     * hadoop03  192.168.25.134      jdk,hadoop         ResourceManager
     *
     * hadoop04  192.168.25.135      jdk,hadoop         ResourceManager
     *
     * hadoop05  192.168.25.137      jdk,hadoop,zk      DataNode、NodeManager、JournalNode、QuorumPeerMain
     *
     * hadoop06  192.168.25.138      jdk,hadoop,zk      DataNode、NodeManager、JournalNode、QuorumPeerMain
     *
     * hadoop07  192.168.25.139      jdk,hadoop,zk      DataNode、NodeManager、JournalNode、QuorumPeerMain
     *
     */

    /**
     * @1 集群搭建, 首先需要7台干净的虚拟机
     */
    /*@1 首选需要7台干净的虚拟机(虚拟机中需要有Java环境)
     *
     *@2 配置ip映射,每台虚拟机都要配置 命令 vim /etc/hosts
     *
     * 192.168.25.136   hadoop01
     * 192.168.25.133   hadoop02
     * 192.168.25.134   hadoop03
     * 192.168.25.135   hadoop04
     * 192.168.25.137   hadoop05
     * 192.168.25.138   hadoop06
     * 192.168.25.139   hadoop07
     *
     *@3 重启客户器
     *
     *@4 将已编译好的hadoop源文件上传到hadoop01 /usr/local/apps目录下执行解压命令
     *
     *@5 进入cd /usr/local/apps/hadoop-2.6.4/etc/hadoop/
     *
     *@6 需要编辑的文件有 <hadoop-env.sh core-site.xml hdfs-site.xml mapred-site.xml yarn-site.xml salves>
     *
     *   6.1 hadoop-env.sh 配置本机Java环境 如下所示
     *   export JAVA_HOME=/usr/local/apps/jdk1.8.0_201
     *
     *   6.2 core-site.xml hdfs-site.xml mapred-site.xml yarn-site.xml 参照source文件夹下拷贝过去即可
     *   ###注意:拷贝过去之前请将域名更换为您配置好的域名,所有中文注释请删除
     *
     *   6.3 将salves中内容删除,添加如下内容
     *      hadoop05
     *      hadoop06
     *      hadoop07
     *
     *@7 配置ssh免密登录,在basic文件夹下 SSH即为ssh免密登录配置,每台机器都弄一遍吧,要不后续太费事
     *
     *@8 配置hadoop命令环境 /etc/profile 这个不做解释
     *
     *
     *@9 执行命令 scp -r hadoop-2.6.4/ hadoop02:/usr/local/apps
     *
     * #注意 从2-7都需要执行,拷贝6分到其他机器上
     */

    /**
     * @2 在 hadoop05 hadoop05 hadoop07上搭建zookeeper集群 搭建方法参照zoo目录下zookeeper.java
     */

    /**
     * @3 重点来了
     */

    /*
     *@1 启动zookeeper集群
     *
     *@2 进入 hadoop05 hadoop06 hadoop07 hadoop目录下sbin目录 执行命令
     *
     * ./hadoop-daemon.sh start journalnode (用jps查看进程,看看是否启动成功,一旦启动失败,全玩完)
     *
     *@3 格式化hadoop01  命令:hdfs namenode -format
     *
     *@4 进入 /home 目录下(我这里配置的是/home路径) 将hadoop文件夹拷贝到hadoop02 /home目录下
     *
     *@5 执行命令 hdfs zkfc -formatZK  在hadoop01上执行一次即可
     *
     *@6 进入hadoop01 hadoop-2.6.4/sbin目录下 执行命令 ./start-dfs.sh
     *
     *@7 进入hadoop03 hadoop04 同上目录执行 ./start-yarn.sh  jps 查看resourcemananger进程是否存在
     *
     *@8 访问http://192.168.25.136:50070/dfshealth.html#tab-overview  ...active表示执行成功
     *
     *@9 访问http://192.168.25.133:50070/dfshealth.html#tab-overview  ...standby表示待命
     */


}
