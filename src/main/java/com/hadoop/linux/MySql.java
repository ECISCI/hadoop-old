package com.hadoop.linux;

/**
 * @author Ming
 * @描述 Linux安装 mySql数据库
 * @描述 yum源安装mysql
 */
public class MySql {

    /**
     * @1检查本地是否已安装MySql
     */
    /* 1. yum list installed | grep mysql
     *
     *      1.1 如果已安装卸载已安装的mysql
     *
     *      1.2 卸载命令 yum -y remove mysql-libs.x86_64
     */

    /**
     * @2安装mysql,并做相关配置
     */
    /*
     * 1.wget http://repo.mysql.com/mysql-community-release-el6-5.noarch.rpm
     *
     * 2. 安装用来配置mysql的yum源的rpm包
     *
     * rpm -Uvh mysql57-community-release-el6-9.noarch.rpm
     *
     * 3. 成功后进入 /etc/yum.repos.d/ 查看是否多出几个mysql的yum源
     *
     * mysql-community-source.repo
     *
     * mysql-community.repo
     *
     * 4. 安装mysql (这个过程说快也快说慢也慢,网速好就快,网速慢就慢)
     *
     * yum install mysql-community-server -y
     *
     * 5.启动mySql
     *
     * service mysqld start
     *
     * 6.查看mysql生成的临时root密码
     *
     * grep 'temporary password' /var/log/mysqld.log
     *
     * 7.修改root密码
     *
     *  (命令)mysql_secure_installation
     *
     *  将上一步生成的临时密码复制过来登录然后修改密码即可
     */

    /**
     * @3查看编码
     */
    /*
     * show variables like 'character%';
     */

    /**
     * @4开放 3306端口 vim /etc/sysconfig/iptables
     */
}
