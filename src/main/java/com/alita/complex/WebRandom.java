package com.alita.complex;

import com.alita.base.NumberRandom;
import com.alita.base.StringRandom;

/**
 * @Description: 网站
 * @Author: Luancx
 * @Date: 2022/02/18
 * @Version: 1.0.0
 */
public class WebRandom {
    /**
     * 邮箱域名
     */
    public static final String[] EMAIL_SUFFIX = ("@gmail.com,@yahoo.com,@msn.com,@hotmail.com,@aol.com,@ask.com," +
            "@live.com,@qq.com,@0355.net,@163.com,@163.net,@263.net,@3721.net,@yeah.net,@googlemail.com,@126.com," +
            "@sina.com,@sohu.com,@yahoo.com.cn").split(",");
    /**
     * 协议
     */
    private static final String[] PROTOCOL_LIST = "http,https".split(",");
    /**
     * 顶级域名
     */
    private static final String[] TLD_LIST = (".com,.cn,.top,.net,.shop,.vip,.xyz,.cloud,.online,.cc,.website,.press," +
            ".space,.beer,.edu,.info").split(",");
    /**
     * ip范围
     */
    private static final int[][] IP_RANGE = {{607649792, 608174079},//36.56.0.0-36.63.255.255
            {1038614528, 1039007743},//61.232.0.0-61.237.255.255
            {1783627776, 1784676351},//106.80.0.0-106.95.255.255
            {2035023872, 2035154943},//121.76.0.0-121.77.255.255
            {2078801920, 2079064063},//123.232.0.0-123.235.255.255
            {-1950089216, -1948778497},//139.196.0.0-139.215.255.255
            {-1425539072, -1425014785},//171.8.0.0-171.15.255.255
            {-1236271104, -1235419137},//182.80.0.0-182.92.255.255
            {-770113536, -768606209},//210.25.0.0-210.47.255.255
            {-569376768, -564133889} //222.16.0.0-222.95.255.255
    };

    /**
     * 协议
     *
     * @return 协议
     */
    public static String randomProtocol() {
        return PROTOCOL_LIST[NumberRandom.randomInt(PROTOCOL_LIST.length)];
    }

    /**
     * 域名
     *
     * @return 域名
     */
    public static String randomDomain() {
        return randomDomain(5, 12);
    }

    /**
     * 域名
     *
     * @return 域名
     */
    public static String randomDomain(int minLength, int maxLength) {
        return StringRandom.str(minLength, maxLength);
    }

    /**
     * 顶级域名
     *
     * @return 顶级域名
     */
    public static String randomTld() {
        return TLD_LIST[NumberRandom.randomInt(TLD_LIST.length)];
    }

    /**
     * 路径
     *
     * @return 路径
     */
    public static String randomPath() {
        return randomPath(1, 4);
    }

    /**
     * 路径
     *
     * @return 路径
     */
    public static String randomPath(int minLength, int maxLength) {
        int num = NumberRandom.randomInt(minLength, maxLength);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num; i++) {
            sb.append("/").append(StringRandom.str(4, 12));
        }
        return sb.toString();
    }

    /**
     * url
     *
     * @return url
     */
    public static String randomUrl() {
        return randomProtocol() + "://www." + randomDomain() + randomTld() + randomPath();
    }

    /**
     * 随机生成Email
     *
     * @return 随机生成Email
     */
    public static String randomEmail() {
        return randomEmail(5, 12);
    }

    /**
     * 随机生成Email
     *
     * @return 随机生成Email
     */
    public static String randomEmail(int minLength, int maxLength) {
        return StringRandom.str(minLength, maxLength) + EMAIL_SUFFIX[NumberRandom.randomInt(EMAIL_SUFFIX.length)];
    }

    /**
     * 随机ip
     *
     * @return 随机ip
     */
    public static String randomIp() {
        int i = NumberRandom.randomInt(IP_RANGE.length);
        int ip = NumberRandom.randomInt(IP_RANGE[i][0], IP_RANGE[i][1]);
        return ((ip >> 24) & 0xff) + "." + ((ip >> 16) & 0xff) + "." + ((ip >> 8) & 0xff) + "." + (ip & 0xff);
    }
}
