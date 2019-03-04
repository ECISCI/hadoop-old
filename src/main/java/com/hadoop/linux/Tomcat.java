package com.hadoop.linux;

/**
 * @author Ming
 * @描述 Linux 下安装tomcat
 */
public class Tomcat {

    /**
     * @1安装tomcat
     */
    /*
     * 1.安装tomcat,解压缩Tomcat压缩包
     * tar -zxvf apache-tomcat-7.0.68.tar.gz -C apps/
     *
     * 2. 启动tomcat cd apache-tomcat-7.0.68.tar.gz/bin
     * 命令 ./startup.sh
     *
     * 3.查看网络监听端口,如果已监听8080端口证明tomcat配置启动成功
     * netstat -nltp
     *
     * 4.关闭 linux防火墙,既可以远程访问
     * srvice iptables stop
     */


    /**
     * @2iptabls相关命令
     */
    /*
     * 1.防火墙运行状态
     * service iptables status
     *
     * 2.开启防火墙
     * service iptables start
     *
     * 3.关闭防火墙
     * service iptables stop
     *
     * 4.开启启动防火墙
     * chkconfig iptables on
     *
     * 5.开机不启动防火墙
     * chkconfig iptables off
     *
     * 6.iptables原理介绍
     *
     * 在iptables 中有四张表,分别是 filter,nat mangle和 raw 每一个表中都包含了各自不同链
     *
     * 最常用的事filter表
     */

}
