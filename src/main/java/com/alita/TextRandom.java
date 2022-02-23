package com.alita;

/**
 * @Description: 文本
 * @Author: Luancx
 * @Date: 2022/02/18
 * @Version: 1.0.0
 */
public class TextRandom {

    /**
     * 随机生成单词
     *
     * @return 随机单词
     */
    protected static String randomWord() {
        return randomWord(3, 7);
    }

    /**
     * 随机生成单词
     *
     * @return 随机单词
     */
    protected static String randomWord(int minLength, int maxLength) {
        return StringRandom.str(BaseRandom.BASE_CHAR_LOWER, NumberRandom.randomInt(minLength, maxLength));
    }

    /**
     * 随机标题
     *
     * @return 随机标题
     */
    protected static String randomTitle() {
        return randomTitle(3, 5);
    }

    /**
     * 随机标题
     *
     * @param minLength 最小长度
     * @param maxLength 最大长度
     * @return 随机标题
     */
    protected static String randomTitle(int minLength, int maxLength) {
        int anInt = NumberRandom.randomInt(minLength, maxLength);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < anInt; i++) {
            sb.append(randomWord());
            if (i < anInt - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    /**
     * 生成随机短句
     *
     * @return 随机短句
     */
    protected static String randomSentence() {
        return randomSentence(3, 5);
    }

    /**
     * 生成随机短句
     *
     * @return 随机短句
     */
    protected static String randomSentence(int minLength, int maxLength) {
        int anInt = NumberRandom.randomInt(minLength, maxLength);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < anInt; i++) {
            sb.append(randomTitle(8, 20)).append(".");
            if (i < anInt - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }


    /**
     * 随机生成段落
     *
     * @return 随机段落
     */
    protected static String randomParagraph() {
        return randomParagraph(2, 5);
    }

    /**
     * 随机生成段落
     *
     * @return 随机段落
     */
    protected static String randomParagraph(int minLength, int maxLength) {
        int anInt = NumberRandom.randomInt(minLength, maxLength);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < anInt; i++) {
            sb.append(randomSentence());
            if (i < anInt - 1) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    /**
     * 随机生成中文
     *
     * @return 中文
     */
    protected static String randomCWord() {
        return randomCWord(2, 5);
    }

    /**
     * 随机生成中文
     *
     * @return 中文
     */
    protected static String randomCWord(int minLength, int maxLength) {
        return randomCWord(BaseRandom.CHINESE_CHARACTER, minLength, maxLength);
    }

    /**
     * 随机生成中文
     *
     * @return 中文
     */
    protected static String randomCWord(String baseStr, int minLength, int maxLength) {
        return StringRandom.str(baseStr, NumberRandom.randomInt(minLength, maxLength));
    }

    /**
     * 随机标题
     *
     * @return 随机标题
     */
    protected static String randomCTitle() {
        return randomCTitle(3, 5);
    }

    /**
     * 随机标题
     *
     * @param minLength 最小长度
     * @param maxLength 最大长度
     * @return 随机标题
     */
    protected static String randomCTitle(int minLength, int maxLength) {
        int anInt = NumberRandom.randomInt(minLength, maxLength);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < anInt; i++) {
            sb.append(randomCWord());
            if (i < anInt - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    /**
     * 生成随机短句
     *
     * @return 随机短句
     */
    protected static String randomCSentence() {
        return randomCSentence(3, 5);
    }

    /**
     * 生成随机短句
     *
     * @return 随机短句
     */
    protected static String randomCSentence(int minLength, int maxLength) {
        int anInt = NumberRandom.randomInt(minLength, maxLength);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < anInt; i++) {
            sb.append(randomCTitle(8, 20)).append("。");
            if (i < anInt - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }


    /**
     * 随机生成段落
     *
     * @return 随机段落
     */
    protected static String randomCParagraph() {
        return randomCParagraph(2, 5);
    }

    /**
     * 随机生成段落
     *
     * @return 随机段落
     */
    protected static String randomCParagraph(int minLength, int maxLength) {
        int anInt = NumberRandom.randomInt(minLength, maxLength);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < anInt; i++) {
            sb.append(randomCSentence());
            if (i < anInt - 1) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
