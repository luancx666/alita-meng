package com.alita.complex;

import com.alita.base.NumberRandom;
import com.alita.utils.SnowflakeIdWorker;

/**
 * @Description: 雪花算法生成id
 * @Author: Luancx
 * @Date: 2022/02/17
 * @Version: 1.0.0
 */
public class IdRandom {
    /**
     * 雪花算法类
     */
    private static final SnowflakeIdWorker SN = new SnowflakeIdWorker(0, 0);
    /**
     * 手机号前缀
     */
    private static String[] TEL_FIRST = "134,135,136,137,138,139,150,151,152,157,158,159,130,131,132,155,156,133,153".split(",");

    /**
     * 随机生成手机号码
     *
     * @return 手机号
     */
    public static String randomTelephone() {
        String first = TEL_FIRST[NumberRandom.randomInt(TEL_FIRST.length)];
        return first + (String.valueOf(NumberRandom.randomInt(100000000, 200000000)).substring(1));
    }

    /**
     * 雪花算法生成的id
     *
     * @return 18位id
     */
    public static long snowflakeId() {
        return SN.nextId();
    }

    /**
     * 雪花算法生成的id
     *
     * @return 18位id
     */
    public static String snowflakeIdString() {
        return SN.nextId() + "";
    }
}
