package com.hadoop.linux;

/**
 * @Linux 常见的用户管理
 */
public class aibi_04 {
    /**
     * 1. 添加用户
     */
    /*
     * useradd angle<添加用户命令> 需要修改密码才能登陆
     *
     * passwd angle <修改密码命令> 按提示输入密码即可
     *
     * chown angle:angle aaa/ <只有root能执行>
     *
     * rm -rf /* 将Linux系统删掉<只有root用户有此权限>
     */

    /**
     * 2.为用户配置sudo权限
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
     * 3.系统管理操作
     */
    /*
     * @3.1 hostname 查看主机名
     *
     * @3.2 hostname hadoop <将主机名更改为hadoop（重启后无效） 必须是root用户>
     *
     * @3.3 vi /etc/sysconfig/network <修改主机名,永久生效>
     *
     * @3.4 uname -a 查看当前系统的版本
     *
     * @3.5 date 查看当前系统时间
     *
     * @3.6 date --help 查询系统时间匹配格式
     *
     * @3.7 cal 2018 查看2018年日历
     *
     * @3.8 shutdown -h now/init0 关机
     *
     * @3.9 mount  umount
     */
}
