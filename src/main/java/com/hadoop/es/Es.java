package com.hadoop.es;

/**
 * @author Ming
 * @描述 elasticsearch安装和使用
 * @描述 Centos7
 */
public class Es {

    /**
     * @1 es解压缩
     */
    /*
     * 1.将 elasticsearch-7.0.0-linux-x86_64.tar 上传到指定目录
     *
     * 执行解压命令  tar -zxvf  elasticsearch-7.0.0-linux-x86_64.tar
     */

    /**
     * @2 Centos下的必要配置
     */
    /*
     * 1. 创建启动es的用户 useradd ela
     *
     * 2. 给用户赋予权限 chown -R ela:ela /usr/local/apps/elasticsearch-7.0.0
     */

    /**
     * @3 更改相关配置
     */

    /*
     * 1. 针对 max virtual memory areas vm.max_map_count [65530] is too low, increase to at least [262144]
     *
     *  在/etc/sysctl.conf最后一行加上 vm.max_map_count=262144
     *
     *  然后用root用户执行以下命令 sysctl -p\
     *
     * 2. 针对 max file descriptors [4096] for elasticsearch process is too low, increase to at least [65535]
     *
     *  编辑 /etc/security/limits.conf
     *
     *  在最后加上  ela  -  nofile  65536
     *
     */

    /**
     * @4 es配置文件修改参照 elasticsearch.yml文件,每个节点都要配置
     */

    /**
     * @5 启动elasticsearch
     */
    /*
     * 使用新建用户ela登录
     *
     * 进入elasticsearch安装目录的bin目录
     *
     * 执行命令 ./elasticsearch
     *
     * 关闭防火墙,外网访问 192.168.196.25:9200
     *
     */
}
