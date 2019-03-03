package com.hadoop.linux;

public class aibi_05 {
    /**
     * 1. 克隆虚拟机
     */
    /*
     * 右键虚拟机 点击--管理--克隆
     */

    /**
     * 2. 克隆后的虚拟机要做的操作 解决克隆猴eth0不见的问题
     */
    /*
     *
     * @1 直接修改 /etc/sysconfig/network-script/ifcfg-eth0
     *
     * @2 删掉 UUID HWADDR
     *
     * @3 配置静态ip地址
     *
     * @4 rm -rf /etc/udev/rules.d/70-persistent-net.rules
     *
     * @5 重新启动客户机
     */

    /**
     * 3.命令补充
     */
    /*
     * @1 文件系统操作 cp somefile.1 /home/hadoop/ 拷贝命令
     *
     * @2 查看文件内容
     *
     * cat somefile 一次性将文件内容全部输出（控制台）
     *
     * more somefile 可以翻页查看,下翻一页（空格） 上翻一页（b） 退出（q）
     *
     * less somefile 可以翻页查看,下翻一页（空格） 上翻一页（b） 上翻一行（↑）下翻一行（↓） 可以搜索关键字（/）
     *
     * tail -10 install.log 查看文件尾部的10行
     *
     * tail -f install.log 小f跟踪文件的唯一inode号,就算文件改名后,还是跟踪原来这个indoe表示的文件
     *
     * tail -F install.log 大F按照文件名来跟踪
     *
     * head -10 install.log 查看文件头部的10行
     *
     */

    /**
     * 4.后台服务管理
     */
    /*
     * service --status-all 查看系统在后台正在运行的程序
     *
     * service network stop 停掉网络（这种命令最好别用）
     *
     * service network start 启动网络
     *
     * service network restart 重启网络
     *
     * service network status 查看指定服务的状态
     *
     * chkconfig 查看所有服务的自启配置
     *
     * chkconfig iptables off 关掉指定服务的自动启动
     *
     * chkconfig iptables on 开启指定服务的自动启动
     */

    /**
     * 5.系统启动级别管理
     */
    /*
     *
     * chkconfig
     *
     * 命令: vi /etc/inittab
     *
     * # Default runlevel. The runlevels used are:
     *
     * # 0 - halt (Do NOT set initdefault to this)
     *
     * # 1 - Single user mode
     *
     * # 2 - Multiuser, without NFS (The same as 3, if you do not have networking)
     *
     * # 3 - Full multiuser mode
     *
     * # 4 - unused
     *
     * # 5 - X11
     *
     * # 6 - reboot (Do NOT set initdefault to this)
     *
     * id:3:initdefault:
     */

}

