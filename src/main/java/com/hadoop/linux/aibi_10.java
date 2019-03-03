package com.hadoop.linux;

/**
 * @author Ming
 * @描述 本地yum源
 */
public class aibi_10 {
    /*
     * 两种方式,
     *
     * @1 每一台机器都配置一个本地文件系统上的yum仓库 file:///packages/path/
     *
     * @2 在局域网内部配置一台节点（service-base）的本地文件系统yum仓库,然后将其发布到web服务器中,
     *
     * 其他节点就可以通过 http://service-base/packages/path/
     */

    /**
     * 挂载
     */
    /*
     * 无论哪种配置都需要将光盘挂载到本地文件目录中
     *
     * mount -t iso9660 -o ro /dev/cdrom /mnt/cdrom/
     *
     * <ro:read only 只读>
     *
     * 自动挂载 vi /etc/fstab<请看image文件夹下的自动挂载>
     */

    /**
     * 仓库制作流程
     */
    /*
     * @1 先挑选一台机器, 挂载一个系统光盘到本地目录/mnt/cdrom
     *
     * @2 然后启动一个httpd服务器, 将/mnt/cdrom 软链接到httpd服务器的 /var/html目录中
     *
     * <命令> （cd /var/www/html;ln -s /mnt/cdrom ./cnetos）
     *
     * @3 然后通过网页访问测试一下, http://192.168.194.88/centos 会看到光盘的目录内容
     *
     * @4 至此, 网络版yum私有仓库已经建立完成, 剩下就去yum的客户端配置这个http地址到repo配置文件
     */

    /**
     * minimal 安装的系统出现问题:缺各种命令,安装软件时缺各种依赖
     */
    /*
     * scp命令没有:yum install -y openssh-clients
     */

}
