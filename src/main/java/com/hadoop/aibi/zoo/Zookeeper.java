package com.hadoop.aibi.zoo;

/**
 * @author Ming
 * @描述 Linux Zookeeper集群搭建
 */
public class Zookeeper {
    /**
     * @1 文件上传
     */

    /*
     *通过FTP方式将zookeeper-3.4.5.tar.gz上传到Linux系统
     *
     * 我这边上传的目录是 /usr/local/apps
     *
     * 不做解释
     */

    /**
     * @2 解压缩文件
     */
    /*
     *@1 执行解压命令 tar -zxvf zookeeper-3.4.5.tar.gz
     *
     *@2 为文件重命名
     *
     * 命令 mv zookeeper-3.4.5.tar.gz zookeeper
     */
    /**
     * @3 修改/etc/profile文件将zookeeper的加入环境变量
     */

    /*@1 添加 export ZOOKEEPER_HOME=/usr/local/apps/zookeeper
     *
     *@2 export PATH=${JAVA_HOME}/bin:${MAVEN_HOME}/bin:${ANT_HOME}/bin:${FINDBUGS_HOME}/bin:${ZOOKEEPER_HOME}/bin:$PATH
     *
     *@3 注意！修改完之后要source 一下使配置文件件生效 source /etc/profile
     */

    /**
     * @4 创建data目录
     * */
    /*@1 注意:这个data目录最好放在根目录下,我也不知道为什么,放在zookeeper目录下启动会失败
     *
     *@2 在根目录下创建一个文件夹 zkdata
     *
     *@3 进入zkdata文件夹 执行命令 vim myid,在myid文件中输入1然后保存退出即可
     *
     */

    /***
     * @5 修改zookeeper配置文件
     */
    /*
     *@1 进入zookeeper文件夹下的conf文件
     *
     *@2 拷贝一份 cp zoo_sample.cfg zoo.cfg
     *
     *@3 编辑zoo.cfg 主要修改 dataDir映射的本地文件目录 （查看文件夹下的zoo.cfg）
     *
     *@4 增加server.节点,节点后面的数据与配置myid中的数字要保持一致
     */

    /**
     * @6 集群
     */
    /*
     *@1 其他linux服务器都按照以上步骤执行即可
     *
     *@2 启动之前一定要关闭防火墙
     *
     *@3 查看zookeeper是否启动成功 命令jps
     *
     *@4 查看zookeeper日志 进入zookeeper目录下 执行命令
     *
     * cat zookeeper.out
     * */
}

