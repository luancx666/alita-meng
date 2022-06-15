package com.alita.base;

import com.alita.ramdom.Random;
import org.junit.Assert;
import org.junit.Test;

/**
 * @Description:
 * @Author: Luancx
 * @Date: 2022/02/16
 * @Version: 1.0.0
 */
public class BooleanRandomTest {
    @Test
    public void randomBoolean() {
        boolean b = Random.rBoolean();
        Assert.assertTrue(b || !b);
    }
}
