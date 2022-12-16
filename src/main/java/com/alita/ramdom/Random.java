package com.alita.ramdom;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;

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
     * 根据传入参数重复指定次数
     *
     * @param baseStr 基础参数
     * @param num     重复次数
     * @return 重复数据
     */
    public static String rRepeat(String baseStr, int num) {
        return StringRandom.randomRepeat(baseStr, num);
    }

    /**
     * 根据传入数据,随机重复
     *
     * @return 随机重复数据
     */
    public static String rRepeat(String baseStr, int minLength, int maxLength) {
        return StringRandom.randomRepeat(baseStr, minLength, maxLength);
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
     * 指定小数位的随机数
     *
     * @param length 长度
     * @return 随机数
     */
    public static double rDouble(int length) {
        return NumberRandom.randomDouble(length);
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
     * 获得指定范围内的随机数 [0,limit)
     *
     * @param limit  限制随机数的范围，不包括这个数
     * @param length 指定长度
     * @return 随机数
     */
    public static double rDouble(double limit, int length) {
        return NumberRandom.randomDouble(limit, length);
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
     * 获得指定范围内的随机数[min, max)
     *
     * @param min    最小数（包含）
     * @param max    最大数（不包含）
     * @param length 指定长度
     * @return 随机数
     */
    public static double rDouble(double min, double max, int length) {
        return NumberRandom.randomDouble(min, max, length);
    }

    /**
     * 生成布尔值
     *
     * @return 随机布尔值
     */
    public static boolean rBoolean() {
        return BooleanRandom.randomBoolean();
    }

    //↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓  名称  ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

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
     * 字符串当前时间
     *
     * @return 当前时间
     */
    public static String nowString() {
        return DateRandom.nowString();
    }

    /**
     * 指定格式当前时间
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

    //↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓  TEXT  ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    /**
     * 随机生成单词 （长度:3-7）
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
     * 生成随机短文
     * 3-5句 8-20词的短文
     *
     * @return 随机短句
     */
    public static String rCSentence() {
        return TextRandom.randomCSentence();
    }

    /**
     * 生成随机短句
     * 指定范围内的条数 8-20词的短文
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

    //↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓  WEB  ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    /**
     * url
     *
     * @return url
     */
    public static String rUrl() {
        return WebRandom.randomUrl();
    }

    /**
     * 协议
     *
     * @return 协议
     */
    public static String rProtocol() {
        return WebRandom.randomProtocol();
    }

    /**
     * 域名
     *
     * @return 域名
     */
    public static String rDomain() {
        return WebRandom.randomDomain();
    }

    /**
     * 域名
     *
     * @return 域名
     */
    public static String rDomain(int minLength, int maxLength) {
        return WebRandom.randomDomain(minLength, maxLength);
    }

    /**
     * 顶级域名
     *
     * @return 顶级域名
     */
    public static String rTld() {
        return WebRandom.randomTld();
    }

    /**
     * 路径
     *
     * @return 路径
     */
    public static String rPath() {
        return WebRandom.randomPath();
    }

    /**
     * 路径
     *
     * @return 路径
     */
    public static String rPath(int minLength, int maxLength) {
        return WebRandom.randomPath(minLength, maxLength);
    }

    /**
     * 随机生成Email
     *
     * @return 随机生成Email
     */
    public static String rEmail() {
        return WebRandom.randomEmail();
    }

    /**
     * 随机生成Email
     *
     * @return 随机生成Email
     */
    public static String rEmail(int minLength, int maxLength) {
        return WebRandom.randomEmail(minLength, maxLength);
    }

    /**
     * 随机ip
     *
     * @return 随机ip
     */
    public static String rIp() {
        return WebRandom.randomIp();
    }


    //↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓  地址  ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    /**
     * 省
     *
     * @return 省
     */
    public static String rProvince() {
        return AddressRandom.randomProvince();
    }

    /**
     * 市
     *
     * @return 市
     */
    public static String rCity() {
        return AddressRandom.randomCity(false);
    }

    /**
     * 市
     *
     * @param flag 是否添加前缀
     * @return 市
     */
    public static String rCity(boolean flag) {
        return AddressRandom.randomCity(flag);
    }

    /**
     * 区
     *
     * @return 区
     */
    public static String rCounty() {
        return AddressRandom.randomCounty(false);
    }

    /**
     * 区
     *
     * @param flag 是否添加前缀
     * @return 区
     */
    public static String rCounty(boolean flag) {
        return AddressRandom.randomCounty(flag);
    }

    /**
     * 随机地址
     *
     * @return 地址
     */
    public static String rArea() {
        return AddressRandom.randomArea();
    }

    /**
     * 指定code 下地区
     *
     * @param code code
     * @return 地区
     */
    public static String assignArea(String code) {
        return AddressRandom.assignArea(code);
    }

    //↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓  手机号  ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    /**
     * 随机手机号
     *
     * @return 手机号
     */
    public static String rPhone() {
        return PhoneRandom.randomPhone();
    }

    /**
     * 随机手机号
     *
     * @return 手机号
     */
    public static String rPhone(String first) {
        return PhoneRandom.randomPhone(first);
    }

    //↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓  ID  ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    /**
     * uuid
     *
     * @return uuid
     */
    public static String rUuid() {
        return IdRandom.uuid(true);
    }

    /**
     * 生成UUID
     *
     * @param flag 是否有分割符
     * @return uuid
     */
    public static String rUuid(boolean flag) {
        return IdRandom.uuid(flag);
    }

    /**
     * 递增 1
     *
     * @return 递增数字
     */
    public static int increment() {
        return IdRandom.increment(1);
    }

    /**
     * 递增
     *
     * @param step 步长
     * @return 递增数字
     */
    public static int increment(int step) {
        return IdRandom.increment(step);
    }

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

    /**
     * 随机 RGB 颜色
     *
     * @return RGB 颜色
     */
    public static String rRGB() {
        return ColorRandom.randomRGB();
    }

    //↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓  身份证号码  ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    /**
     * 身份证号
     *
     * @return 身份证号
     */
    public static String idCard() {
        return IdCardRandom.randomIdCard();
    }

    /**
     * 指定生日的身份证号
     *
     * @param birthday 生日 - 19901010
     * @return 身份证号
     */
    public static String idCard(String birthday) {
        return IdCardRandom.randomIdCard(birthday);
    }


    //↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓  集合  ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    /**
     * 随机从参数中选择一个元素
     *
     * @param list 集合
     * @param <T>  泛型
     * @return 元素
     */
    public static <T> T rArrayOne(Collection<T> list) {
        return ArrayRandom.randomOne(list);
    }

    /**
     * 从列表中随机组合指定数量的不重复元素
     *
     * @param list 集合
     * @param size 指定数量
     * @param <T>  泛型
     * @return 新集合
     */
    public static <T> List<T> rArrayList(List<T> list, int size) {
        return ArrayRandom.rArrayList(list, size);
    }

    /**
     * 获取下一个元素
     *
     * @param list 集合
     * @param <T>  泛型
     * @return 元素
     */
    public static <T> T rArrayNext(Collection<T> list) {
        return ArrayRandom.randomNext(list, 1);
    }

    /**
     * 根据步长获取下一个元素
     *
     * @param list 集合
     * @param step 步长
     * @param <T>  泛型
     * @return 元素
     */
    public static <T extends Object & Comparable<? super T>> T rArrayNext(Collection<? extends T> list, int step) {
        return ArrayRandom.randomNext(list, step);
    }

    /**
     * 将集合复制指定次数
     *
     * @param list  集合
     * @param count 次数
     * @param <T>   泛型
     * @return 复制指定次数的集合
     */
    public static <T> List<T> rArrayCopy(List<T> list, int count) {
        return ArrayRandom.randomCopy(list, count, count);
    }

    /**
     * 将集合复制多次
     *
     * @param list 集合
     * @param min  最小次数
     * @param max  最大次数
     * @param <T>  泛型
     * @return 集合
     */
    public static <T> List<T> rArrayCopy(List<T> list, int min, int max) {
        return ArrayRandom.randomCopy(list, min, max);
    }

    /**
     * 随机从参数中选择一个元素
     *
     * @param map map
     * @return 元素
     */
    public static <K, V> Map.Entry<K, V> rMapEntryOne(Map<K, V> map) {
        return MapRandom.randomEntryOne(map);
    }
}
