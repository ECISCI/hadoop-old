package com.hadoop.hdfs;

public class error {
    /**
     * @1 查看输出日志有如下错误
     *
     * All specified directories are failed to load.
     *
     * 解决办法
     *
     * 1.1 进入tmp/dfs，修改VERSION文件即可，将nameNode里version文件夹里面的内容修改成和master一致的
     *
     * 1.2 直接删除tmp/dfs，然后格式化hdfs即可（./hdfs namenode -format）重新在tmp目录下生成一个dfs文件
     *
     */
    /**
     * @2 使用 hadoop fs -put xxx / 上传文件出现错误
     *
     * java.net.NoRouteToHostException: No route to host
     *
     * 将namenode datanode各个节点的防火墙都关闭即可
     */
}
