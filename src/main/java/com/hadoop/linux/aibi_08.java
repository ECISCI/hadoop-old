package com.hadoop.linux;

/**
 * @author Ming
 * @描述 Linux 下安装tomcat
 */
public class aibi_08 {
    /*
     * @1 tar -zxvf apache-tomcat-7.0.68.tar.gz -C apps/<安装tomcat>
     *
     * @2 进入 tomcat安装目录bin下 执行命令 ./startup.sh
     *
     * @3 netstat -nltp <查看网络监听端口,如果已监听8080端口证明tomcat配置启动成功>
     *
     * @4 srvice iptables stop <关闭 linux防火墙,既可以远程访问>
     */

    /**
     * 查看系统中安装的rpm包
     */
    /*
     * rpm -qa|grep mysql<查看mysql安装的rpm依赖包>
     *
     */

    /**
     * iptabls
     */
    /*
     * @1 常用的命令 service iptables status 防火墙运行状态
     *
     * service iptables start 开启防火墙
     *
     * service iptables stop 关闭防火墙
     *
     * chkconfig iptables on <开启启动防火墙>
     *
     * chkconfig iptables off <开机不启动防火墙>
     *
     * @2 iptables 原理介绍
     *
     * 在iptables 中有四张表,分别是 filter,nat mangle和 raw 每一个表中都包含了各自不同链
     *
     * 最常用的事filter表
     */

}
