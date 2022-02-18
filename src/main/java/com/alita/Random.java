package com.alita;

import com.alita.base.BooleanRandom;
import com.alita.base.NumberRandom;
import com.alita.base.StringRandom;
import com.alita.complex.*;

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


    //↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓  TEXT  ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    /**
     * 随机生成单词
     *
     * @return 随机单词
     */
    public static String rWord() {
        return TextRandom.randomWord();
    }

    /**
     * 随机生成单词
     *
     * @return 随机单词
     */
    public static String rWord(int minLength, int maxLength) {
        return TextRandom.randomWord(minLength, maxLength);
    }

    /**
     * 随机标题
     *
     * @return 随机标题
     */
    public static String rTitle() {
        return TextRandom.randomTitle();
    }

    /**
     * 随机标题
     *
     * @return 随机标题
     */
    public static String rTitle(int minLength, int maxLength) {
        return TextRandom.randomTitle(minLength, maxLength);
    }

    /**
     * 生成随机短句
     *
     * @return 随机短句
     */
    public static String rSentence() {
        return TextRandom.randomSentence();
    }

    /**
     * 生成随机短句
     *
     * @return 随机短句
     */
    public static String rSentence(int minLength, int maxLength) {
        return TextRandom.randomSentence(minLength, maxLength);
    }

    /**
     * 随机生成段落
     *
     * @return 随机段落
     */
    public static String rParagraph() {
        return TextRandom.randomParagraph();
    }

    /**
     * 随机生成段落
     *
     * @return 随机段落
     */
    public static String rParagraph(int minLength, int maxLength) {
        return TextRandom.randomParagraph(minLength, maxLength);
    }

    /**
     * 随机生成中文
     *
     * @return 随机中文
     */
    public static String rCWord() {
        return TextRandom.randomCWord();
    }

    /**
     * 随机生成中文
     *
     * @return 随机中文
     */
    public static String rCWord(int minLength, int maxLength) {
        return TextRandom.randomCWord(minLength, maxLength);
    }

    /**
     * 随机生成中文
     *
     * @return 随机中文
     */
    public static String rCWord(String baseStr, int minLength, int maxLength) {
        return TextRandom.randomCWord(baseStr, minLength, maxLength);
    }

    /**
     * 随机标题
     *
     * @return 随机标题
     */
    public static String rCTitle() {
        return TextRandom.randomCTitle();
    }

    /**
     * 随机标题
     *
     * @return 随机标题
     */
    public static String rCTitle(int minLength, int maxLength) {
        return TextRandom.randomCTitle(minLength, maxLength);
    }

    /**
     * 生成随机短句
     *
     * @return 随机短句
     */
    public static String rCSentence() {
        return TextRandom.randomCSentence();
    }

    /**
     * 生成随机短句
     *
     * @return 随机短句
     */
    public static String rCSentence(int minLength, int maxLength) {
        return TextRandom.randomCSentence(minLength, maxLength);
    }

    /**
     * 随机生成段落
     *
     * @return 随机段落
     */
    public static String rCParagraph() {
        return TextRandom.randomCParagraph();
    }

    /**
     * 随机生成段落
     *
     * @return 随机段落
     */
    public static String rCParagraph(int minLength, int maxLength) {
        return TextRandom.randomCParagraph(minLength, maxLength);
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
