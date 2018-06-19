package com.example.demo.helper;

import org.apache.commons.lang3.BooleanUtils;
import org.springframework.util.ObjectUtils;

/**
 * Created by Zeke on 2017/7/27.
 */
public class BooleanHelper {
    public static final String TRUE_STR = "true";
    public static final String FALSE_STR = "false";
    public static final int TRUE_INT = 1;
    public static final int FALSE_INT = 0;

    public static boolean isTrue(Boolean bool) {
        return ObjectUtils.isEmpty(bool) ? false : BooleanUtils.isTrue(bool);
    }

    public static boolean isFalse(Boolean bool) {
        return ObjectUtils.isEmpty(bool) ? true : BooleanUtils.isFalse(bool);
    }

    public static boolean isTrue(String bool) {
        return ObjectUtils.isEmpty(bool) ? false : TRUE_STR.equalsIgnoreCase(bool);
    }

    public static boolean isFalse(String bool) {
        return ObjectUtils.isEmpty(bool) ? true : FALSE_STR.equalsIgnoreCase(bool);
    }

    public static boolean isTrue(Integer bool) {
        return ObjectUtils.isEmpty(bool) ? false : TRUE_INT == bool.intValue();
    }

    public static boolean isFalse(Integer bool) {
        return ObjectUtils.isEmpty(bool) ? true : FALSE_INT == bool.intValue();
    }
}
