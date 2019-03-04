package com.hadoop.basic;

public class error {
    /**
     * @1查看输出日志有如下错误
     */
    /*
     * All specified directories are failed to load.
     * 解决办法
     *
     * 1.1 进入tmp/dfs，修改VERSION文件即可，将nameNode里version文件夹里面的内容修改成和master一致的
     *
     * 1.2 直接删除tmp/dfs，然后格式化hdfs即可（./hdfs namenode -format）重新在tmp目录下生成一个dfs文件
     *
     */
    /**
     * @2使用 hadoop fs -put xxx / 上传文件出现错误
     */
    /*
     * java.net.NoRouteToHostException: No route to host
     *
     * 将namenode datanode各个节点的防火墙都关闭即可
     */

    /**
     * @3执行mr程序出错
     */
    /*
     *connecting to resourcemanager
     *
     *retrying ...
     *
     *retrying ...
     *
     * 原因没有启动yarn或者启动失败
     */
    /**
     * @4初始化工作目录结构
     */
    /*hdfs namenode -format 只是初始化了namenode的工作目录
     *
     *而datanode的工作目录是在datanode启动后自己初始化的
     */

    /**
     * @5datanode不被namenode识别
     */
    /*
     * namenode在format初始化的时候回形成两个标识
     *
     * blockPoolId
     *
     * clusterId
     *
     * 新datanode加入时会获取这两个标识,作为自己工作目录中的标识
     *
     * 一旦namenode重新format后,namenode的身份标识已变
     *
     * 而datanode如果依然持有原来的id,就不会被namenode识别
     */
    /**
     * @6datanode下线多久能看到效果
     */
    /*
     * datanode只要下线就会被namenode认为下线了,有一个超时时间
     */
    /**
     * @7关于副本数量的问题
     */
    /* 副本数是由客户端的参数dfs.replication决定的(优先级conf.set>自定义配置文件>jar包中hdfs-default.xml)
     */

}
