package com.alita.lang;

import com.alita.base.BaseRandom;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @Description: 随机数字
 * @Author: Luancx
 * @Date: 2022/02/15
 * @Version: 1.0.0
 */
public class NumberRandom {
    /**
     * 生成随机数
     *
     * @return 随机数
     */
    public static int randomInt() {
        return BaseRandom.getRandom().nextInt();
    }

    /**
     * 获得指定范围内的随机数 [0,limit)
     *
     * @param limit 限制随机数的范围，不包括这个数
     * @return 随机数
     */
    public static int randomInt(int limit) {
        return BaseRandom.getRandom().nextInt(limit);
    }

    /**
     * 获得指定范围内的随机数
     *
     * @param min 最小数（包含）
     * @param max 最大数（不包含）
     * @return 随机数
     */
    public static int randomInt(int min, int max) {
        return BaseRandom.getRandom().nextInt(min, max);
    }

    /**
     * 获得随机数
     *
     * @return 随机数
     */
    public static long randomLong() {
        return BaseRandom.getRandom().nextLong();
    }

    /**
     * 获得指定范围内的随机数 [0,limit)
     *
     * @param limit 限制随机数的范围，不包括这个数
     * @return 随机数
     */
    public static long randomLong(long limit) {
        return BaseRandom.getRandom().nextLong(limit);
    }

    /**
     * 获得指定范围内的随机数[min, max)
     *
     * @param min 最小数（包含）
     * @param max 最大数（不包含）
     * @return 随机数
     */
    public static long randomLong(long min, long max) {
        return BaseRandom.getRandom().nextLong(min, max);
    }

    /**
     * 获得指定范围内的随机数
     *
     * @param min 最小数（包含）
     * @param max 最大数（不包含）
     * @return 随机数
     */
    public static double randomDouble(double min, double max) {
        return BaseRandom.getRandom().nextDouble(min, max);
    }

    /**
     * 获得随机数[0, 1)
     *
     * @return 随机数
     * @see ThreadLocalRandom#nextDouble()
     * @since 3.3.0
     */
    public static double randomDouble() {
        return BaseRandom.getRandom().nextDouble();
    }

    /**
     * 获得指定范围内的随机数 [0,limit)
     *
     * @param limit 限制随机数的范围，不包括这个数
     * @return 随机数
     * @see ThreadLocalRandom#nextDouble(double)
     * @since 3.3.0
     */
    public static double randomDouble(double limit) {
        return BaseRandom.getRandom().nextDouble(limit);
    }
}
