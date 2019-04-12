package com.hadoop.linux;

/**
 * @author Ming
 * @描述 localYum
 * @注意:如果有网络还是别配置了,费死劲了,有时候还不好使
 */
public class localYum {
    /**
     * @1 cd /etc/yum.repos.d/
     *
     * vi CentOS-Media.repo
     */

    /**
     * @2挂载(在另一个连接窗口打开)
     */
    /*
     * 命令:mount -t iso9660 -o ro /dev/cdrom  /mnt/cdrom/
     *
     * 注意:如果出现 mount: no medium found on /dev/sr0 错误
     *
     * 请编辑虚拟机设置,在CD/DVD处 将已连接,启动时连接勾选上
     */
    /**
     * @3 继续第一步的vi命令
     */
    /* 1.  gpgcheck=0
     * 2.  enabled=1
     * 3.  baseurl=file:///mnt/cdrom
     */
    /**
     * @4确定yum源
     */
    /* 1.将 yum.repos.d 目录下的所有文件更改为以.repo.bak结尾
     *
     * 2.将CentOS-Media.repo.bak 更改为CentOS-Media.repo
     */
    /**
     * @5测试yum源
     */
    /*
     * 1.yum clean all
     *
     * 2.yum repolist
     */

}
