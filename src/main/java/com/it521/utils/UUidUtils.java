package com.it521.utils;

import java.util.UUID;

/**
 * @author Ming
 * @描述 生成数据库主键ID
 */
public class UUidUtils {

    public static String uuid() {

        return UUID.randomUUID().toString().replaceAll("-", "");
    }
}
