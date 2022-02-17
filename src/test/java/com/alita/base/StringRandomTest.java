package com.alita.base;

import com.alita.Random;
import org.junit.Assert;
import org.junit.Test;

/**
 * @Description:
 * @Author: Luancx
 * @Date: 2022/02/15
 * @Version: 1.0.0
 */
public class StringRandomTest {

    @Test
    public void randomStr() {
        String str = Random.rString();
        Assert.assertEquals(str.length(), 5);
    }

    @Test
    public void randomStrSize() {
        int size = 10;
        String str = Random.rString(size);
        Assert.assertEquals(str.length(), size);
    }

    @Test
    public void randomStrMinAndMaxSize() {
        int min = 5;
        int max = 10;
        String str = Random.rString(min, max);
        Assert.assertTrue(min <= str.length() && str.length() <= max);
    }
}
