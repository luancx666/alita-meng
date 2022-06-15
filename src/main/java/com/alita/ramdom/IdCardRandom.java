package com.alita.ramdom;

import com.alita.utils.MUtils;

/**
 * @Description: 身份证
 * @Author: Luancx
 * @Date: 2022/02/21
 * @Version: 1.0.0
 */
public class IdCardRandom {
    private static final int[] COEFFICIENT = {7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2};
    private static final char[] RESULT_CHAR = {'1', '0', 'X', '9', '8', '7', '6', '5', '4', '3', '2'};

    /**
     * 随机身份证号
     *
     * @return 身份证号
     */
    protected static String randomIdCard() {
        return randomIdCard(null);
    }

    /**
     * 指定生日随机身份证号
     *
     * @param birthday 生日日期
     * @return 身份证号
     */
    protected static String randomIdCard(String birthday) {
        StringBuilder cardNo = new StringBuilder();
        //设置区号
        cardNo.append(AddressRandom.randomCounty().getCode());

        if (MUtils.isNotEmpty(birthday)) {
            cardNo.append(birthday);
        } else {
            //1970-01-01 08:00:00 ~ 当前
            cardNo.append(Random.rDateString(0, System.currentTimeMillis(), "yyyyMMdd"));
        }

        //随机三位数
        String num = Random.rInt(1000, 2000) + "";
        cardNo.append(num.substring(1));

        //设置最后一位
        cardNo.append(getLastBit(cardNo.toString()));

        return cardNo.toString();
    }

    /**
     * 获取最后一位
     *
     * @param str 前17位
     */
    private static String getLastBit(String str) {
        char[] chars = str.toCharArray();
        if (chars.length < 17) {
            return " ";
        }
        int[] numberArr = new int[17];
        int result = 0;
        for (int i = 0; i < numberArr.length; i++) {
            numberArr[i] = Integer.parseInt(chars[i] + "");
        }
        for (int i = 0; i < numberArr.length; i++) {
            result += COEFFICIENT[i] * numberArr[i];
        }
        return String.valueOf(RESULT_CHAR[result % 11]);
    }
}
