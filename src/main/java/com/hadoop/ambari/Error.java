package com.hadoop.ambari;

/**
 * @author Ming
 * @描述 ambari安装及使用过程中出现的错误及相关解决方案
 */
public class Error {

    /**
     * 1. ambari启动 Hive 2.0 View出现
     *
     * failed: java.io.FileNotFoundException: File does not exist: /user/admin
     */
    /*
     * 解决办法: 在ambari服务机器上使用如下命名
     *
     * 1. ambari-server stop (停掉服务)
     *
     * 2. su hdfs
     *
     * 3. hdfs dfs  -mkdir /user/admin
     *
     * 4. hdfs dfs  -chown admin:hdfs /user/admin
     *
     * 5. ambari-server start
     *
     *
     */
}
