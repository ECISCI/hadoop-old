package com.hadoop.linux;

/**
 * @author Ming
 * @描述 Linux安装 mySql数据库
 */
public class MySql {


    /*
     * @1 <如果需要>rpm -qa | grep -i mysql <检查本地是否有mysql数据库>
     *
     *
     * @2 <如果需要>rpm -e --nodeps mysql-libs-5.1.71-1.el6.i686<卸载当前mysql>
     *
     * @@****CentOS6.5 32/64 安装mysql
     *
     *
     *
     * 1.安装mysql
     * rpm -ivh MySQL-server-5.1.73-1.glibc23.i386.rpm
     *
     * 2.遇到冲突的解决办法
     * rpm -e mysql-libs-5.1.71-1.el6.i686 --nodes
     *
     * 3.查看网络端口如果mysql启动它会监听3306端口
     * netstat -nltp
     *
     * 4.安装客户端
     * rpm -ivh MySQL-client-5.1.73-1.glibc23.i386.rpm
     *
     * 5.启动mysql服务
     * service mysql start <>
     *
     * 6.客户端安装完成后通过此去设置mysqlroot账户密码
     * @6 /usr/bin/mysql_secure_installation
     *
     *
     * @@**** 遇到的错误
     *
     * <如果需要>ps aux |grep mysq* <找到mysql进程然后杀死>
     *
     * kill 2139
     *
     * <如果需要>service mysql start 重启mysql
     *
     * @@*** 解决socket连接问题
     *
     * vim /etc/my.cnf <vi打开my.cnf文件并添加以下配置>
     *
     * @@*** MySQLCouldn't find MySQL manager错误
     *
     * <执行命令>mv /etc/mysql/my.cnf /etc/mysql/my.cnf.old
     *
     * 把/etc/mysql/my.cnf重命名成my.cnf.old
     *
     * <执行命令>/etc/init.d/mysql start
     */

    /**
     * 配置本地yum源
     */
    /*
     * @1 cd /etc/yum.repos.d/ <yum位置>
     *
     * @2 mv CentOS-Media.repo CentOS-Media.repo.bak
     *
     * @3 rename .repo.bak .repo
     *
     * @4 rename .repo.bak .repo *
     *
     * @@**** 终端一  umount /dev/cdrom
     *
     * @5 mkdir /mnt/cdrom
     *
     * @6 ll /mnt/cdrom
     *
     * @7 mount -t iso9660 -o -ro /dev/cdrom /mnt/cdrom/
     *
     * @@****终端二
     *
     * @8 cd /etc/yum.repos.d/
     *
     * @9 vi CentOS-Media.repo
     *
     * @10 更改 baseurl=file:///mnt/cdrom
     *
     * @11 更改gpgcheck=0
     *
     * @12 更改enabled=1
     *
     * @13 rename .repo .repo.bak *
     *
     * @14 mv CentOS-Media.repo.bak CentOS-Media.repo
     *
     * @15 yum clean all
     */

    /**
     * yum命令
     */
    /*
     * @1 yum list |  mysql 查看库中是否有mysql
     *
     * @2 yum -y install gcc 安装gcc 并且一路确定
     */

    /**
     * 查找文件
     */
    /*
     * find / -name mysql 查找mysql的所有安装路径
     */

}
