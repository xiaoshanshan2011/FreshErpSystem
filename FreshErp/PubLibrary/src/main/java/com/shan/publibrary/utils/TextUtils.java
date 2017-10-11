package com.shan.publibrary.utils;

/**
 * 文本工具
 */
public class TextUtils {

    /**
     * 文本判空操作
     * @param text
     * @return
     */
    public static boolean isEmpty(String text) {
        if (text == null || text.length() <= 0)
            return true;
        else
            return false;
    }


}
