package com.it521.linux;

/**
 * @author Ming
 * @描述 Linux网络配置
 */
public class NetConf {


    /**
     * @1.安装过程中会出现错误
     */
    /*
     * 有些同学的机器安装vmware时会出现一个错误: virtual XT 这需要重启电脑, 进入 BIOS开启这个虚拟机加速开关
     *
     * 有些windows8/10系统会报错,会出现虚拟网卡 安装失败, 这需要关闭windows的驱动程序安装签名验证
     */

    /**
     * @2.Linux目录结构
     */
    /*
     * etc 配置文件（程序的配置文件,系统的配置文件）,所有的配置文件都放在这个文件夹下面
     *
     * lib 就是一些库
     *
     * usr (unix shared resource, unix 共享资源)约定俗成,大家公用的软件都装在这里
     *
     * sbin 系统管理的程序,启动系统,关闭系统,增加用户减少用户,增加防火墙配置
     *
     * tmp 临时目录,临时数据通通放在这里
     */

    /**
     *@3.IPNETMASK(子网掩码),DNS
     */
    /*
     * IP 192.168.33.2
     *
     * NETMASK （子网掩码） 255.255.255.0
     *
     * 子网掩码用于判断自己属于哪个网段
     *
     * 网段的计算:将ip地址的二进制 & 子网掩码的二进制 = 网段地址
     *
     * 192.168.33.2 & 255.255.255.0 = 192.168.33.0
     *
     * GATEWAY 网关 192.168.33.1
     *
     * DNS 域名解析服务器
     *
     * www.baidu.com DNS服务器,www.baidu.com 115.98.79.22
     *
     */

    /**
     * @5.虚拟机配置IP的方法
     */
    /*
     * 1. 打开终端 执行命令 vi /etc/sysconfig/network-scripts/ifconfig-eth0
     *
     * 2. 进入vi编辑模式
     *
     * 3. 将ONBOOT = no 更改为 ONBOOT = yes
     *
     * 4. 增加 IPADDR= 192.168.194.80 这个就是远程访问的ip地址
     *
     * 5. BOOTPROTO 更改为 BOOTPROTO=static
     *
     * 6. 增加 NETMASK= 255.255.255.0
     *
     * 7. 增加GETWAY = 192.168.194.1
     */

}

