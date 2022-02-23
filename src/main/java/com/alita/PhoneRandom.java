package com.alita;

/**
 * @Description: 电话号码
 * @Author: Luancx
 * @Date: 2022/02/21
 * @Version: 1.0.0
 */
public class PhoneRandom {
    /**
     * 手机号前缀
     */
    private static final String[] TEL_FIRST = "134,135,136,137,138,139,150,151,152,157,158,159,130,131,132,155,156,133,153".split(",");

    /**
     * 随机生成手机号码
     *
     * @return 手机号
     */
    protected static String randomPhone() {
        String first = TEL_FIRST[NumberRandom.randomInt(TEL_FIRST.length)];
        return first + (String.valueOf(NumberRandom.randomInt(100000000, 200000000)).substring(1));
    }
}
