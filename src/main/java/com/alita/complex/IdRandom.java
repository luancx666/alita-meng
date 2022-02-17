package com.alita.complex;

import com.alita.utils.SnowflakeIdWorker;

/**
 * @Description: 雪花算法生成id
 * @Author: Luancx
 * @Date: 2022/02/17
 * @Version: 1.0.0
 */
public class IdRandom {
    private static final SnowflakeIdWorker SN = new SnowflakeIdWorker(0, 0);

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
