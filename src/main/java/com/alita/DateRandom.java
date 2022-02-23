package com.alita;

import com.alita.utils.MUtils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 时间
 * @Author: Luancx
 * @Date: 2022/02/17
 * @Version: 1.0.0
 */
public class DateRandom {
    /**
     * 开始时间截 (2015-01-01)
     */
    private static final long TIME_CUT = 1420041600000L;

    private static final String TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";

    /**
     * 日期格式化
     */
    private static Map<String, SimpleDateFormat> DATEFORMAT_MAP = new HashMap<>();

    /**
     * 当前时间
     *
     * @return 当前时间
     */
    protected static Date now() {
        return new Date();
    }

    /**
     * 获取随机时间 (开始时间 2015-01-01 至 当前时间)
     *
     * @return 获取随机时间
     */
    protected static Date randomDate() {
        return randomDate(TIME_CUT, System.currentTimeMillis());
    }

    /**
     * 获取指定时间范围内的随机时间
     *
     * @param startTime 开始时间
     * @param endTime   结束时间
     * @return 指定时间范围内的随机时间
     */
    protected static Date randomDate(long startTime, long endTime) {
        if (startTime >= endTime) {
            return null;
        }
        return new Date(NumberRandom.randomLong(startTime, endTime));
    }

    /**
     * 当前时间
     *
     * @return 字符串当前时间
     */
    protected static String nowString() {
        return nowString(null);
    }

    /**
     * 指定格式的日期
     *
     * @param format 日期格式
     * @return 格式化后当前日期
     */
    protected static String nowString(String format) {
        return formatDate(now(), format);
    }

    /**
     * 获取随机时间 (开始时间 2015-01-01 至 当前时间)
     *
     * @return 获取随机时间
     */
    protected static String randomDateString() {
        return formatDate(randomDate(), null);
    }

    /**
     * 获取格式化后随机时间 (开始时间 2015-01-01 至 当前时间)
     *
     * @return 格式化后随机时间
     */
    protected static String randomDateString(String format) {
        return formatDate(randomDate(), format);
    }

    /**
     * 获取指定时间范围内的随机时间
     *
     * @param startTime 开始时间
     * @param endTime   结束时间
     * @return 指定时间范围内的随机时间
     */
    protected static String randomDateString(long startTime, long endTime) {
        return randomDateString(startTime, endTime, null);
    }

    /**
     * 获取指定时间范围内的格式化随机时间
     *
     * @param startTime 开始时间
     * @param endTime   结束时间
     * @param format    日期格式
     * @return 格式化随机时间
     */
    protected static String randomDateString(long startTime, long endTime, String format) {
        return formatDate(randomDate(startTime, endTime), format);
    }

    /**
     * 根据字符串格式化日期参数
     *
     * @param date   日期
     * @param format 格式
     * @return 格式化后日期
     */
    private static String formatDate(Date date, String format) {
        return getDateFormat(format).format(date);
    }

    /**
     * 获取日期格式化类
     *
     * @param format 日期格式
     * @return 日期格式类
     */
    private static SimpleDateFormat getDateFormat(String format) {
        if (MUtils.isEmpty(format)) {
            format = TIME_FORMAT;
        }
        if (DATEFORMAT_MAP.containsKey(format)) {
            return DATEFORMAT_MAP.get(format);
        }

        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        DATEFORMAT_MAP.put(format, dateFormat);
        return dateFormat;
    }
}
