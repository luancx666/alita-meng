package com.alita.complex;

import com.alita.Random;
import junit.framework.TestCase;
import org.junit.Assert;

/**
 * @Description:
 * @Author: Luancx
 * @Date: 2022/02/18
 * @Version: 1.0.0
 */
public class TextRandomTest extends TestCase {

    public void testRandomWord() {
        String s = Random.rWord();
        Assert.assertNotNull(s);
    }

    public void testTestRandomWord() {
        String s = Random.rWord(13, 15);
        Assert.assertNotNull(s);
    }

    public void testRandomTitle() {
        String s = Random.rTitle();
        Assert.assertNotNull(s);
    }

    public void testTestRandomTitle() {
        String s = Random.rTitle(10, 20);
        Assert.assertNotNull(s);
    }

    public void testRandomSentence() {
        String s = Random.rSentence();
        Assert.assertNotNull(s);
    }

    public void testTestRandomSentence() {
        String s = Random.rSentence(10, 20);
        Assert.assertNotNull(s);
    }

    public void testRandomParagraph() {
        String s = Random.rParagraph();
        Assert.assertNotNull(s);
    }

    public void testTestRandomParagraph() {
        String s = Random.rParagraph(3, 5);
        Assert.assertNotNull(s);
    }

    public void testRandomCWord() {
        String s = Random.rCWord();
        Assert.assertNotNull(s);
    }

    public void testTestRandomCWord() {
        String s = Random.rCWord(10, 20);
        Assert.assertNotNull(s);
    }

    public void testTestRandomCWord1() {
        String s = Random.rCWord("中华人民共和国万岁", 10, 20);
        Assert.assertNotNull(s);
    }

    public void testRandomCTitle() {
        String s = Random.rCTitle();
        Assert.assertNotNull(s);
    }

    public void testTestRandomCTitle() {
        String s = Random.rCTitle(10, 20);
        Assert.assertNotNull(s);
    }

    public void testRandomCSentence() {
        String s = Random.rCSentence();
        Assert.assertNotNull(s);
    }

    public void testTestRandomCSentence() {
        String s = Random.rCSentence(5, 6);
        Assert.assertNotNull(s);
    }

    public void testRandomCParagraph() {
        String s = Random.rCParagraph();
        Assert.assertNotNull(s);
    }

    public void testTestRandomCParagraph() {
        String s = Random.rCParagraph(3, 5);
        Assert.assertNotNull(s);
    }
}