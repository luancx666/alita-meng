package com.alita.base;

/**
 * @Description: 随机布尔值
 * @Author: Luancx
 * @Date: 2022/02/16
 * @Version: 1.0.0
 */
public class BooleanRandom {
    /**
     * 生成布尔值
     *
     * @return 随机布尔值
     */
    public static boolean randomBoolean() {
        return BaseRandom.getRandom().nextBoolean();
    }
}
