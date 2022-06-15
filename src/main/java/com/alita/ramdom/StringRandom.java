package com.alita.ramdom;

import java.util.Collections;

/**
 * @Description: 随机字符串
 * @Author: Luancx
 * @Date: 2022/02/15
 * @Version: 1.0.0
 */
public class StringRandom {

    protected static String str(int length) {
        return str(BaseRandom.BASE_CHAR_NUMBER, length);
    }

    protected static String str(int minLength, int maxLength) {
        int anInt = BaseRandom.getRandom().nextInt(minLength, maxLength);
        return str(BaseRandom.BASE_CHAR_NUMBER, anInt);
    }

    /**
     * 根据指定字符串生成指定长度的随机字符串
     *
     * @param baseStr 指定字符串
     * @param length  指定长度
     * @return 随机字符串
     */
    protected static String str(String baseStr, int length) {
        if (length < 1) {
            length = 1;
        }
        StringBuilder sb = new StringBuilder();
        int baseLength = baseStr.length();

        for (int i = 0; i < length; i++) {
            sb.append(baseStr.charAt(NumberRandom.randomInt(baseLength)));
        }
        return sb.toString();
    }

    /**
     * 根传入参数重复随机次数
     *
     * @param baseStr   基础字符串
     * @param minLength 最小次数
     * @param maxLength 最大次数
     * @return 数值
     */
    public static String randomRepeat(String baseStr, int minLength, int maxLength) {
        return randomRepeat(baseStr, NumberRandom.randomInt(minLength, maxLength));
    }

    /**
     * 重复参数
     *
     * @param baseStr 字符串
     * @param num     重复次数
     * @return 重复数据
     */
    public static String randomRepeat(String baseStr, int num) {
        return repeat(String.valueOf(baseStr), (Math.max(0, num)));
    }

    /**
     * 将字符串重复 n 次
     *
     * @param baseStr 字符串
     * @param n       重复次数
     * @return 重复后字符串
     */
    private static String repeat(String baseStr, int n) {
        return String.join("", Collections.nCopies(n, baseStr));
    }
}
