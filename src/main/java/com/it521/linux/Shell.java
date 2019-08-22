package com.it521.linux;

/**
 * @author Ming
 * @描述 linux下的Shell
 */
public class Shell {

    /*
     * Shell是用户与内核进行交互的操作的一种接口目前最流行的Shell称为bash Shell
     *
     * Shell 也是一门编程语言<解释型编程语言>即Shell脚本
     *
     * 一个系统可以存在多个shell
     *
     * cat /etc/shells 查看系统安装的shell
     */

    /**
     * Shell相关命令
     */
    /*
     * pstree <一个树型结构>
     *
     * @1 Shell中的变量
     *
     * Linux Shell中的变量分为"系统变量"和"用户自定义变量"
     *
     * 可以通过set命令查看系统变量
     *
     * 系统变量$HOME $PWD $SHELL $USER等等
     *
     * @2 set 显示当前Shell中所有变量
     */

    /**
     * 定义变量
     */
    /*
     * 变量=值 （例如STR=abc）
     *
     * 等号两侧不能有空格
     *
     * 变量名称一般习惯为大写
     *
     * 双引号和单引号有区别,双隐含仅将空格转义,单引号会将所有特殊字符转义
     *
     * STR="hello world"
     *
     * A=9 unsetA撤销变量A
     *
     * readonly B=2 声明静态变量B=2,不能用 unset
     *
     * export 变量名可把变量提升为全局环境变量,可提供其他shell程序使用
     */
}
