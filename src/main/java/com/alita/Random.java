package com.alita;

import com.alita.base.BaseRandom;
import com.alita.lang.NumberRandom;
import com.alita.lang.StringRandom;

/**
 * @Description: 模拟数据总入口
 * @Author: Luancx
 * @Date: 2022/02/15
 * @Version: 1.0.0
 */
public class Random {
    /**
     * 生成随机字符串,默认长度5
     *
     * @return 长度为5的字符串
     */
    public static String string() {
        return string(5);
    }

    /**
     * 生成指定长度的字符串
     *
     * @param length 字符串的长度
     * @return 指定长度的字符串
     */
    public static String string(int length) {
        return StringRandom.str(length);
    }

    /**
     * 生成指定长度范围的字符串
     *
     * @param minLength 最小长度
     * @param maxLength 最大长度
     * @return 指定长度范围的字符串
     */
    public static String string(int minLength, int maxLength) {
        return StringRandom.str(minLength, maxLength);
    }

    /**
     * 生成随机数
     *
     * @return 随机数
     */
    public static int integer() {
        return NumberRandom.randomInt();
    }

    /**
     * 获得指定范围内的随机数 [0,limit)
     *
     * @param limit 限制随机数的范围，不包括这个数
     * @return 随机数
     */
    public static int integer(int limit) {
        return NumberRandom.randomInt(limit);
    }

    /**
     * 获得指定范围内的随机数
     *
     * @param min 最小数（包含）
     * @param max 最大数（不包含）
     * @return 随机数
     */
    public static int integer(int min, int max) {
        return NumberRandom.randomInt(min, max);
    }

    /**
     * 获得随机数
     *
     * @return 随机数
     */
    public static long randomLong() {
        return NumberRandom.randomLong();
    }
    /**
     * 获得指定范围内的随机数[min, max)
     *
     * @param min 最小数（包含）
     * @param max 最大数（不包含）
     * @return 随机数
     */
    public static long randomLong(long min, long max) {
        return NumberRandom.randomLong(min, max);
    }
}
