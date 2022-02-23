package com.alita;

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
}
