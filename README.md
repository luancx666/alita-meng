# alita-meng

#### 介绍

随机生成数据

#### 软件架构

maven项目

#### 安装教程

```
        <dependency>
            <groupId>com.gitee.luancx</groupId>
            <artifactId>alita-meng</artifactId>
            <version>1.1.0</version>
        </dependency>
```

#### 使用说明

Random.class

|        | 方法                                                  | 说明                             | 备注                            |
| ------ | ----------------------------------------------------- | -------------------------------- | ------------------------------- |
| 字符串 | rString()                                             | 生成随机字符串,默认长度5         |                                 |
|        | rString(int length)                                   | 生成指定长度的字符串             |                                 |
|        | rString(int minLength, int maxLength)                 | 生成指定长度范围的字符串         |                                 |
|        | rRepeat(String baseStr, int num)                      | 重复传入的字符串指定次数         |                                 |
|        | rRepeat(String baseStr, int minLength, int maxLength) | 重复传入的字符串在指定范围内次数 |                                 |
|        |                                                       |                                  |                                 |
| 数字   | rInt()                                                | 生成随机数                       |                                 |
|        | rInt(int limit)                                       | 获得指定范围内的随机数           | [0,limit)                       |
|        | rInt(int min, int max)                                | 获得指定范围内的随机数           | [min, max)                      |
|        | rLong()                                               | 获得随机数                       |                                 |
|        | rLong(long limit)                                     | 获得指定范围内的随机数           | [0,limit)                       |
|        | rLong(long min, long max)                             | 获得指定范围内的随机数           | [min, max)                      |
|        | rDouble()                                             | 获得随机数                       |                                 |
|        | rDouble(double limit)                                 | 获得指定范围内的随机数           | [0,limit)                       |
|        | rDouble(double min, double max)                       | 获得指定范围内的随机数           | [min, max)                      |
|        |                                                       |                                  |                                 |
| 布尔   | rBoolean()                                            | 生成布尔值                       |                                 |
|        |                                                       |                                  |                                 |
| 名称   | rName()                                               | 英文名                           |                                 |
|        | rFirst()                                              | 英文姓                           |                                 |
|        | rLast()                                               | 英文名                           |                                 |
|        | rCName()                                              | 中文名                           |                                 |
|        | rCFirst()                                             | 中文姓                           |                                 |
|        | rCLast()                                              | 中文名                           |                                 |
|        |                                                       |                                  |                                 |
| 时间   | now()                                                 | 当前时间                         |                                 |
|        | nowString()                                           | 字符串当前时间                   |                                 |
|        | nowString(String format)                              | 指定格式当前时间                 |                                 |
|        | rDate()                                               | 获取随机时间                     | 开始时间 2015-01-01 至 当前时间 |
|        | rDateString()                                         | 获取格式化随机时间               | 开始时间 2015-01-01 至 当前时间 |
|        | rDateString(String format)                            | 随机指定格式时间                 | 开始时间 2015-01-01 至 当前时间 |
|        | rDate(long start, long end)                           | 获取指定时间范围内的随机时间     |                                 |
|        | rDateString(long start, long end)                     | 获取指定时间范围内的随机时间     |                                 |
|        | rDateString(long start, long end, String format)      | 获取指定时间范围内的随机时间     |                                 |
|        |                                                       |                                  |                                 |
| 文本   | rWord()                                               | 生成单词                         |                                 |
|        | rWord(int minLength, int maxLength)                   | 生成单词                         |                                 |
|        | rTitle()                                              | 标题                             | 多个单词                        |
|        | rTitle(int minLength, int maxLength)                  | 标题                             |                                 |
|        | rSentence()                                           | 生成短句                         |                                 |
|        | rSentence(int minLength, int maxLength)               | 生成短句                         |                                 |
|        | rParagraph()                                          | 生成段落                         |                                 |
|        | rParagraph(int minLength, int maxLength)              | 生成段落                         |                                 |
|        | rCWord()                                              | 生成中文                         |                                 |
|        | rCWord(int minLength, int maxLength)                  | 生成中文                         |                                 |
|        | rCWord(String baseStr, int minLength, int maxLength)  | 生成中文                         |                                 |
|        | rCTitle()                                             | 标题                             |                                 |
|        | rCTitle(int minLength, int maxLength)                 | 标题                             |                                 |
|        | rCSentence()                                          | 生成短句                         |                                 |
|        | rCSentence(int minLength, int maxLength)              | 生成短句                         |                                 |
|        | rCParagraph()                                         | 生成段落                         |                                 |
|        | rCParagraph(int minLength, int maxLength)             | 生成段落                         |                                 |
|        |                                                       |                                  |                                 |
| 网络   | rUrl()                                                | url                              |                                 |
|        | rProtocol()                                           | 协议                             |                                 |
|        | rDomain()                                             | 域名                             |                                 |
|        | rDomain(int minLength, int maxLength)                 | 域名                             |                                 |
|        | rTld()                                                | 顶级域名                         |                                 |
|        | rPath()                                               | 路径                             |                                 |
|        | rPath(int minLength, int maxLength)                   | 路径                             |                                 |
|        | rEmail()                                              | 生成Email                        |                                 |
|        | rEmail(int minLength, int maxLength)                  | 生成Email                        |                                 |
|        | rIp()                                                 | ip                               |                                 |
|        |                                                       |                                  |                                 |
| 地址   | rProvince()                                           | 省份                             |                                 |
|        | rCity()                                               | 市                               |                                 |
|        | rCity(true)                                           | 市（含前缀)                      | 湖南省 长沙市                   |
|        | rCounty()                                             | 区                               |                                 |
|        | rCounty(true)                                         | 区(含前缀)                       | 长沙市 雨花区                   |
|        | rArea()                                               | 地址                             | 湖南省 长沙市 雨花区            |
|        |                                                       |                                  |                                 |
| 颜色   | rColor()                                              | 16进制颜色值                     | #79E0F2                         |

