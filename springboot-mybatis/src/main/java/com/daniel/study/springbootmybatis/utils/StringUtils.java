package com.daniel.study.springbootmybatis.utils;

public class StringUtils {
    public static boolean isEmpty(String str) {
        if (null == str || "".equals(str)) {
            return true;
        }
        return false;
    }

    public static boolean isNotEmpty(String str){
        return !isEmpty(str);
    }
}
