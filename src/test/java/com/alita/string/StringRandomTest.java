package com.alita.string;

import com.alita.Random;
import com.alita.base.BaseRandom;
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
        String str = Random.string();
        System.out.println(str);
    }

    @Test
    public void randomStrSize() {
        int size = 10;
        String str = Random.string(size);
        System.out.println(str);
        Assert.assertEquals(str.length(), size);
    }

    @Test
    public void randomStrMinAndMaxSize() {
        for (int i = 0; i < 10; i++) {
            String str = Random.string(5, 10);
            System.out.println(str);
        }
    }
}
