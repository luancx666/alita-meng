package com.alita;

/**
 * @Description: 颜色
 * @Author: Luancx
 * @Date: 2022/02/17
 * @Version: 1.0.0
 */
public class ColorRandom {
    /**
     * RGB颜色范围上限
     */
    private static final int RGB_COLOR_BOUND = 256;

    /**
     * 随机16进制颜色值
     *
     * @return 16进制颜色值
     */
    protected static String randomColor() {
        //红色
        String red = singleColor(NumberRandom.randomInt(RGB_COLOR_BOUND));
        //绿色
        String green = singleColor(NumberRandom.randomInt(RGB_COLOR_BOUND));
        //蓝色
        String blue = singleColor(NumberRandom.randomInt(RGB_COLOR_BOUND));
        return "#" + red + green + blue;
    }

    /**
     * 单个16进制
     *
     * @param num 值
     * @return 16进制值
     */
    private static String singleColor(int num) {
        String s = Integer.toHexString(num).toUpperCase();
        return s.length() == 1 ? "0" + s : s;
    }
}
