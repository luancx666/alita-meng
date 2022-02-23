package com.alita.complex;

import com.alita.Random;
import org.junit.Assert;
import org.junit.Test;

/**
 * @Description:
 * @Author: Luancx
 * @Date: 2022/02/17
 * @Version: 1.0.0
 */
public class IdRandomTest {
    @Test
    public void testUuid() {
        String s1 = Random.rUuid();
        Assert.assertEquals(36, s1.length());
        String s2 = Random.rUuid(true);
        Assert.assertEquals(36, s2.length());
        String s3 = Random.rUuid(false);
        Assert.assertTrue(32 == s3.length() && !s3.contains("-"));
    }

    @Test
    public void testIncrement() {
        int num10 = Random.increment();
        Assert.assertEquals(1, num10);
        int num11 = Random.increment();
        Assert.assertEquals(2, num11);

        int num20 = Random.increment(10);
        Assert.assertEquals(12, num20);

        int num21 = Random.increment();
        Assert.assertEquals(13, num21);

        int num30 = Random.increment(1000);
        Assert.assertEquals(1013, num30);

        int num31 = Random.increment();
        Assert.assertEquals(1014, num31);
    }
}
