package com.hadoop.linux;

public class Java环境 {
    /**
     * @1.如何上传安装包到服务器
     */
    /*
     * @1 可以使用图形化工具 如:filezilla
     *
     * @2 可以使用sftp工具:alt+p 调出后用put命令上传
     */

    /**
     * @2.打包解包
     */
    /*
     * @2.1 压缩解压缩的相关命令
     *
     * gzip access.log <将access.long文件压缩>
     *
     * gzip -d access.log.gz <将access.log.gz解压缩>
     *
     * @2.2 打包解包
     *
     * tar -cvf firstball.tar mingaaa/ <将mingaaa文件夹打包>
     *
     * tar -zxvf firstball.tar <解包>
     *
     * @2.3 一次性完成打包和压缩的操作
     *
     * tar -zcvf my.tar.gz mingaaa/ <将mingaaa文件打包并压缩成my.tar.gz>
     */

    /**
     * @3.Linux下安装Java
     */
    /*
     * 1.解压安装包
     *
     * 命令 tar -zxvf jdk-7u65-linux-i586.tar.gz
     *
     * 2.编辑 etc下profile
     *
     * 命令 vim /etc/profile
     *
     * export JAVA_HOME=/root/apps/jdk1.7.0_65 (/root/apps/jdk1.7.0_65 是解压缩路径)
     *
     * export JRE_HOME=${JAVA_HOME}/jre
     *
     * export CLASSPATH=.:${JAVA_HOME}/lib:${JRE_HOME}/lib
     *
     * export PATH=${JAVA_HOME}/bin:$PATH
     *
     * 将以上配置写在profile文件的最后面
     *
     * 3.执行source命令让文件生效
     *
     * 命令 source /etc/profile
     *
     * < vim ~/.bashrc，最后加一句 source /etc/profile> 这个命令不知道怎么用
     */

}
