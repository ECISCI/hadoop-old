package com.hadoop.utils;

/**
 * @author Ming
 * @描述 日志打印工具类
 */
public class L {

    public static boolean isDebug = true;


    public static void i(Object log) {

        if (isDebug)

            System.out.println(log);

    }
    public static void e(Object log) {

        if (isDebug)

            System.err.println(log);

    }

    public static void i(String TAG, Object log) {

        if (isDebug)

            System.out.println(TAG + "::" + log);

    }
    public static void e(String TAG, Object log) {

        if (isDebug)

            System.err.println(TAG + "::" + log);

    }
}
