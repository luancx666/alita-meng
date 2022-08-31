package com.alita.ramdom;

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
        return randomPhone(first);
    }

    /**
     * 指定前缀的手机号
     *
     * @param first 前缀
     * @return 手机号
     */
    protected static String randomPhone(String first) {
        if (null == first || "".equals(first)) {
            first = TEL_FIRST[NumberRandom.randomInt(TEL_FIRST.length)];
        } else if (first.length() >= 13) {
            return first.substring(0, 13);
        }
        int length = 13 - first.length();
        StringBuilder z = new StringBuilder();
        for (int i = 0; i < length; i++) {
            z.append("0");
        }

        return first + (String.valueOf(NumberRandom.randomLong(Long.parseLong("1" + z), Long.parseLong("2" + z)))
                .substring(1));
    }
}
