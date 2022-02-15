package com.alita.base;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @Description:
 * @Author: Luancx
 * @Date: 2022/02/15
 * @Version: 1.0.0
 */
public class BaseRandom {
    /**
     * 字符串常量：空字符串 {@code ""}
     */
    public static final String EMPTY = "";
    /**
     * 字符串常量：空格 {@code " "}
     */
    public static final String SPACE = " ";
    public static final String LF = "\n";
    public static final String CR = "\r";
    /**
     * 用于随机选的数字
     */
    public static final String BASE_NUMBER = "0123456789";
    /**
     * 用于随机选的字符_小写
     */
    public static final String BASE_CHAR_LOWER = "abcdefghijklmnopqrstuvwxyz";
    /**
     * 用于随机选的字符_大写
     */
    public static final String BASE_CHAR_UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    /**
     * 用于随机选的字符和数字
     */
    public static final String BASE_CHAR_NUMBER = BASE_CHAR_LOWER + BASE_CHAR_UPPER + BASE_NUMBER;

    /**
     * 获取随机数生成器对象<br>
     * ThreadLocalRandom是JDK 7之后提供并发产生随机数，能够解决多个线程发生的竞争争夺。
     *
     * <p>
     * 注意：此方法返回的{@link ThreadLocalRandom}不可以在多线程环境下共享对象，否则有重复随机数问题。
     * 见：https://www.jianshu.com/p/89dfe990295c
     * </p>
     *
     * @return {@link ThreadLocalRandom}
     * @since 3.1.2
     */
    public static ThreadLocalRandom getRandom() {
        return ThreadLocalRandom.current();
    }
}
