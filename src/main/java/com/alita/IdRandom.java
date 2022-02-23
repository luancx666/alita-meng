package com.alita;

import com.alita.utils.SnowflakeIdWorker;

import java.util.UUID;

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
     * 雪花算法生成的id
     *
     * @return 18位id
     */
    protected static long snowflakeId() {
        return SN.nextId();
    }

    /**
     * 雪花算法生成的id
     *
     * @return 18位id
     */
    protected static String snowflakeIdString() {
        return SN.nextId() + "";
    }

    /**
     * 生成UUID
     *
     * @param flag 是否有分割符
     * @return uuid
     */
    protected static String uuid(boolean flag) {
        String uuid = UUID.randomUUID().toString();
        if (!flag) {
            return uuid;
        }
        return uuid.substring(0, 8) + uuid.substring(9, 13) +
                uuid.substring(14, 18) + uuid.substring(19, 23) +
                uuid.substring(24);
    }
}
