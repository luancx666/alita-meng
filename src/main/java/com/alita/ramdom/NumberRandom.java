package com.alita.ramdom;

import java.math.BigDecimal;
import java.math.RoundingMode;

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
    protected static int randomInt() {
        return BaseRandom.getRandom().nextInt();
    }

    /**
     * 获得指定范围内的随机数 [0,limit)
     *
     * @param limit 限制随机数的范围，不包括这个数
     * @return 随机数
     */
    protected static int randomInt(int limit) {
        return BaseRandom.getRandom().nextInt(limit);
    }

    /**
     * 获得指定范围内的随机数
     *
     * @param min 最小数（包含）
     * @param max 最大数（不包含）
     * @return 随机数
     */
    protected static int randomInt(int min, int max) {
        if (min >= max) {
            return max;
        }
        return BaseRandom.getRandom().nextInt(min, max);
    }

    /**
     * 获得随机数
     *
     * @return 随机数
     */
    protected static long randomLong() {
        return BaseRandom.getRandom().nextLong();
    }

    /**
     * 获得指定范围内的随机数 [0,limit)
     *
     * @param limit 限制随机数的范围，不包括这个数
     * @return 随机数
     */
    protected static long randomLong(long limit) {
        return BaseRandom.getRandom().nextLong(limit);
    }

    /**
     * 获得指定范围内的随机数[min, max)
     *
     * @param min 最小数（包含）
     * @param max 最大数（不包含）
     * @return 随机数
     */
    protected static long randomLong(long min, long max) {
        return BaseRandom.getRandom().nextLong(min, max);
    }

    /**
     * 获得随机数[0, 1)
     *
     * @return 随机数
     */
    protected static double randomDouble() {
        return BaseRandom.getRandom().nextDouble();
    }

    /**
     * 指定小数位的随机数[0, 1)
     *
     * @param length 小数位长度
     * @return 随机数
     */
    protected static double randomDouble(int length) {
        return doubleLength(BaseRandom.getRandom().nextDouble(), length);
    }

    /**
     * 获得指定范围内的随机数 [0,limit)
     *
     * @param limit 限制随机数的范围，不包括这个数
     * @return 随机数
     */
    protected static double randomDouble(double limit) {
        return BaseRandom.getRandom().nextDouble(limit);
    }

    /**
     * 获得指定范围内的随机数 [0,limit)
     *
     * @param limit  限制随机数的范围，不包括这个数
     * @param length 指定小数位长度
     * @return 随机数
     */
    protected static double randomDouble(double limit, int length) {
        return doubleLength(BaseRandom.getRandom().nextDouble(limit), length);
    }

    /**
     * 获得指定范围内的随机数
     *
     * @param min 最小数（包含）
     * @param max 最大数（不包含）
     * @return 随机数
     */
    protected static double randomDouble(double min, double max) {
        return BaseRandom.getRandom().nextDouble(min, max);
    }

    /**
     * 获得指定范围内的随机数
     *
     * @param min    最小数（包含）
     * @param max    最大数（不包含）
     * @param length 指定小数位长度
     * @return 随机数
     */
    protected static double randomDouble(double min, double max, int length) {
        return doubleLength(BaseRandom.getRandom().nextDouble(min, max), length);
    }

    /**
     * 四舍五入指定小数位长度
     */
    private static double doubleLength(double d, int length) {
        return new BigDecimal(d).setScale(length, RoundingMode.HALF_UP).doubleValue();
    }
}
