package com.hadoop.linux;

/**
 * @Linux 常见的用户管理
 */
public class 用户管理 {
    /**
     * @1.添加用户
     */
    /*
     * 1.添加用户命令 ###需要修改密码才能登陆
     *  useradd angle
     *
     * 2.修改密码命令 ###按提示输入密码即可
     * passwd angle
     *
     * 3.只有root能执行
     * chown angle:angle aaa/
     *
     * 4.将Linux系统删掉 ###只有root用户有此权限
     * rm -rf /*
     */

    /**
     * @2.为用户配置sudo权限
     */
    /*
     * 用root编辑 vi/etc/sudoers
     *
     * 在文件的如下位置为angle添加一行即可
     *
     * root ALL=(ALL) ALL
     *
     * angle ALL=(ALL) ALL
     *
     * angle用户就可以用sodu来执行系统级别的指令了
     *
     * [angle@bigdata ~]$ sudo useradd huangxiaoming
     */

    /**
     * @3.系统管理操作
     */
    /*
     * 1.hostname 查看主机名
     *
     * 2.将主机名更改为hadoop（重启后无效） 必须是root用户
     * hostname hadoop
     *
     * 3.修改主机名,永久生效
     * vim /etc/sysconfig/network
     *
     * 4.查看当前系统的版本
     * uname -a
     *
     * 5.查看当前系统时间
     * date
     *
     * 6.查询系统时间匹配格式
     * date --help
     *
     * 7.查看2018年日历
     * cal 2018
     *
     * 8.关机
     * shutdown -h now/init0
     *
     * 9. mount  umount
     */
}
