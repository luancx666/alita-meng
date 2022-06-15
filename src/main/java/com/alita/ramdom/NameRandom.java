package com.alita.ramdom;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @Description: 名字
 * @Author: Luancx
 * @Date: 2022/02/17
 * @Version: 1.0.0
 */
public class NameRandom {
    /**
     * 英文姓
     *
     * @return 英文姓氏
     */
    protected static String randomFirst() {
        ThreadLocalRandom random = BaseRandom.getRandom();
        int i = random.nextInt(BaseRandom.FIRST_NAME.length);
        return BaseRandom.FIRST_NAME[i];
    }

    /**
     * 英文名
     *
     * @return 英文名
     */
    protected static String randomLast() {
        ThreadLocalRandom random = BaseRandom.getRandom();
        int i = random.nextInt(BaseRandom.LAST_NAME.length);
        return BaseRandom.LAST_NAME[i];
    }

    /**
     * 英文姓名
     *
     * @return 英文姓名
     */
    protected static String randomName() {
        return randomFirst() + " " + randomLast();
    }

    /**
     * 中文姓
     *
     * @return 中文姓
     */
    protected static String randomCFirst() {
        ThreadLocalRandom random = BaseRandom.getRandom();
        int i = random.nextInt(BaseRandom.C_SURNAME.length());
        return BaseRandom.C_SURNAME.charAt(i) + "";
    }

    /**
     * 中文名
     * 目前只支持 1 或 2 位名
     *
     * @return 中文名
     */
    protected static String randomCLast() {
        ThreadLocalRandom random = BaseRandom.getRandom();
        int i = random.nextInt(BaseRandom.C_NAME.length());
        char c = BaseRandom.C_NAME.charAt(i);
        if (random.nextBoolean()) {
            return String.valueOf(c);
        }
        i = random.nextInt(BaseRandom.C_NAME.length());
        return String.valueOf(c) + BaseRandom.C_NAME.charAt(i);
    }

    /**
     * 中文姓名
     *
     * @return 中文姓名
     */
    protected static String randomCName() {
        return randomCFirst() + randomCLast();
    }
}
