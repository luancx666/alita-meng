package com.alita;

import junit.framework.TestCase;
import org.junit.Assert;

/**
 * @Description:
 * @Author: Luancx
 * @Date: 2022/02/23
 * @Version: 1.0.0
 */
public class IdCardRandomTest extends TestCase {

    public void testRandomIdCard() {
        String s = Random.idCard();
        Assert.assertEquals(s.length(), 18);
    }

    public void testTestRandomIdCard() {
        String s = Random.idCard("19960202");
        Assert.assertEquals(s.length(), 18);
    }
}