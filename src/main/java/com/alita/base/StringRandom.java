package com.alita.base;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @Description: 随机字符串
 * @Author: Luancx
 * @Date: 2022/02/15
 * @Version: 1.0.0
 */
public class StringRandom {

    public static String str(int length) {
        return str(BaseRandom.BASE_CHAR_NUMBER, length);
    }

    public static String str(int minLength, int maxLength) {
        if (minLength == 0 || maxLength == 0 || minLength >= maxLength) {
            return str(5);
        }
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
    public static String str(String baseStr, int length) {
        if (length < 1) {
            length = 1;
        }
        StringBuilder sb = new StringBuilder();
        ThreadLocalRandom random = BaseRandom.getRandom();
        int baseLength = baseStr.length();

        for (int i = 0; i < length; i++) {
            sb.append(baseStr.charAt(random.nextInt(baseLength)));
        }
        return sb.toString();
    }
}
