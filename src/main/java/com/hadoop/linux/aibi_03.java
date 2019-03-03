package com.hadoop.linux;

/**
 * @author Ming
 * @描述 Linux文件权限操作常用命令
 */
public class aibi_03 {
    /**
     * 1.Linux文件操作权限初识
     */
    /*
     * @1 drwxr-xr-x
     *
     * d: 标识节点类型（d:文件夹, -：文件 1：链接）
     *
     * r:可读 w:可写 x:可执行
     *
     *
     * 第一组 rws 表示这个文件拥有者对它的权限 :可读可写可执行
     *
     * 第二组 r-x 表示这个文件所属组对它的权限: 可读,不可写,可执行
     *
     * 第三组 r-x 表示这个文件的其他用户（相对于上面两类用户）对它的权限:可读,不可写,可执行
     */

    /**
     * 2.chmod 修改文件权限 d(rwx)(r-x)(r-x)
     */

    /*
     * chmod g-rw haha.bat 表示将haha.bat对所属组的 rw权限取消
     *
     * chmod o-rw haha.bat 表示对haha.bat对其他人的rw权限取消
     *
     * chmod u+x haha.bat 表示将haha.bat对所属用户的权限增加x
     *
     * chmod 700 haha.bat
     *
     * chmod 777 haha.bat 增加全部权限
     *
     * chmod 664 haha.bat 会修改成 rw-rw--
     *
     * chmod -R 770 mingaa/ 如果要将一个文件夹所有内容权限统一修改(递归修改)
     */

}
