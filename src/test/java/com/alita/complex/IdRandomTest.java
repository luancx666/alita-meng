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
        String s2 = Random.rUuid(false);
        Assert.assertEquals(36, s2.length());
        String s3 = Random.rUuid(true);
        Assert.assertTrue(32 == s3.length() && !s3.contains("-"));
    }
}
