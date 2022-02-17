package com.alita;

import com.alita.base.BooleanRandom;
import com.alita.base.NumberRandom;
import com.alita.base.StringRandom;
import com.alita.complex.ColorRandom;
import com.alita.complex.DateRandom;
import com.alita.complex.IdRandom;
import com.alita.complex.NameRandom;

import java.util.Date;

/**
 * @Description: 模拟数据总入口
 * @Author: Luancx
 * @Date: 2022/02/15
 * @Version: 1.0.0
 */
public class Random {
    /**
     * 生成随机字符串,默认长度5
     *
     * @return 长度为5的字符串
     */
    public static String rString() {
        return rString(5);
    }

    /**
     * 生成指定长度的字符串
     *
     * @param length 字符串的长度
     * @return 指定长度的字符串
     */
    public static String rString(int length) {
        return StringRandom.str(length);
    }

    /**
     * 生成指定长度范围的字符串
     *
     * @param minLength 最小长度
     * @param maxLength 最大长度
     * @return 指定长度范围的字符串
     */
    public static String rString(int minLength, int maxLength) {
        return StringRandom.str(minLength, maxLength);
    }

    /**
     * 生成随机数
     *
     * @return 随机数
     */
    public static int rInt() {
        return NumberRandom.randomInt();
    }

    /**
     * 获得指定范围内的随机数 [0,limit)
     *
     * @param limit 限制随机数的范围，不包括这个数
     * @return 随机数
     */
    public static int rInt(int limit) {
        return NumberRandom.randomInt(limit);
    }

    /**
     * 获得指定范围内的随机数
     *
     * @param min 最小数（包含）
     * @param max 最大数（不包含）
     * @return 随机数
     */
    public static int rInt(int min, int max) {
        return NumberRandom.randomInt(min, max);
    }

    /**
     * 获得随机数
     *
     * @return 随机数
     */
    public static long rLong() {
        return NumberRandom.randomLong();
    }

    /**
     * 获得指定范围内的随机数 [0,limit)
     *
     * @param limit 限制随机数的范围，不包括这个数
     * @return 随机数
     */
    public static long rLong(long limit) {
        return NumberRandom.randomLong(limit);
    }

    /**
     * 获得指定范围内的随机数[min, max)
     *
     * @param min 最小数（包含）
     * @param max 最大数（不包含）
     * @return 随机数
     */
    public static long rLong(long min, long max) {
        return NumberRandom.randomLong(min, max);
    }

    /**
     * 获得随机数
     *
     * @return 随机数
     */
    public static double rDouble() {
        return NumberRandom.randomDouble();
    }

    /**
     * 获得指定范围内的随机数 [0,limit)
     *
     * @param limit 限制随机数的范围，不包括这个数
     * @return 随机数
     */
    public static double rDouble(double limit) {
        return NumberRandom.randomDouble(limit);
    }

    /**
     * 获得指定范围内的随机数[min, max)
     *
     * @param min 最小数（包含）
     * @param max 最大数（不包含）
     * @return 随机数
     */
    public static double rDouble(double min, double max) {
        return NumberRandom.randomDouble(min, max);
    }

    /**
     * 生成布尔值
     *
     * @return 随机布尔值
     */
    public static boolean rBoolean() {
        return BooleanRandom.randomBoolean();
    }

    //↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓  英文  ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    /**
     * 英文名
     *
     * @return 英文名
     */
    public static String rName() {
        return NameRandom.randomName();
    }

    /**
     * 姓
     *
     * @return 英文姓
     */
    public static String rFirst() {
        return NameRandom.randomFirst();
    }

    /**
     * 名
     *
     * @return 英文名
     */
    public static String rLast() {
        return NameRandom.randomLast();
    }

    //↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓  时间  ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    /**
     * 当前时间
     *
     * @return 当前时间
     */
    public static Date now() {
        return DateRandom.now();
    }

    /**
     * 当前时间
     *
     * @return 当前时间
     */
    public static String nowString() {
        return DateRandom.nowString();
    }

    /**
     * 格式化当前时间
     *
     * @param format 日期格式
     * @return 当前时间
     */
    public static String nowString(String format) {
        return DateRandom.nowString(format);
    }

    /**
     * 获取随机时间 (开始时间 2015-01-01 至 当前时间)
     *
     * @return 获取随机时间
     */
    public static Date rDate() {
        return DateRandom.randomDate();
    }

    /**
     * 获取随机时间 (开始时间 2015-01-01 至 当前时间)
     *
     * @return 获取随机时间
     */
    public static String rDateString() {
        return DateRandom.randomDateString();
    }

    /**
     * 随机格式化时间 (开始时间 2015-01-01 至 当前时间)
     *
     * @param format 日期格式
     * @return 随机格式化时间
     */
    public static String rDateString(String format) {
        return DateRandom.randomDateString(format);
    }

    /**
     * 获取指定时间范围内的随机时间
     *
     * @param start 开始时间
     * @param end   结束时间
     * @return 指定时间范围内的随机时间
     */
    public static Date rDate(long start, long end) {
        return DateRandom.randomDate(start, end);
    }

    /**
     * 获取指定时间范围内的随机时间
     *
     * @param start 开始时间
     * @param end   结束时间
     * @return 指定时间范围内的随机时间
     */
    public static String rDateString(long start, long end) {
        return DateRandom.randomDateString(start, end);
    }

    /**
     * 获取指定时间范围内的随机时间
     *
     * @param start  开始时间
     * @param end    结束时间
     * @param format 日期格式
     * @return 指定时间范围内的随机时间
     */
    public static String rDateString(long start, long end, String format) {
        return DateRandom.randomDateString(start, end, format);
    }

    //↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓  中文  ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    /**
     * 中文姓名
     *
     * @return 中文姓名
     */
    public static String rCName() {
        return NameRandom.randomCName();
    }

    /**
     * 中文姓
     *
     * @return 中文姓
     */
    public static String rCFirst() {
        return NameRandom.randomCFirst();
    }

    /**
     * 中文名
     *
     * @return 中文名
     */
    public static String rCLast() {
        return NameRandom.randomCLast();
    }


    //↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓  ID  ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    /**
     * 雪花算法生成的id
     *
     * @return 18位id
     */
    public static long rSnowflakeId() {
        return IdRandom.snowflakeId();
    }

    /**
     * 雪花算法生成的id
     *
     * @return 18位id
     */
    public static String rSnowflakeIdString() {
        return IdRandom.snowflakeIdString();
    }

    //↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓  颜色  ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    /**
     * 随机16进制颜色值  #79E0F2
     *
     * @return 16进制颜色值
     */
    public static String rColor() {
        return ColorRandom.randomColor();
    }
}
