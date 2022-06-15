package com.alita.base;

import com.alita.ramdom.Random;
import org.junit.Test;

/**
 * @Description:
 * @Author: Luancx
 * @Date: 2022/02/15
 * @Version: 1.0.0
 */
public class NumberRandomTest {
    @Test
    public void integer() {
        int integer = Random.rInt();
    }

    @Test
    public void integerLimit() {
        int integer = Random.rInt(10);
    }

    @Test
    public void integerMinAndMax() {
        int integer = Random.rInt(10, 20);
    }

    @Test
    public void randomLong() {
        long l = Random.rLong();
    }

    @Test
    public void randomLongLimit() {
        long l = Random.rLong(50000);
    }

    @Test
    public void randomLongMixAndMax() {
        long l = Random.rLong(50000, 1000000);
    }

    @Test
    public void randomDouble() {
        double v = Random.rDouble();
    }

    @Test
    public void randomDoubleLimit() {
        double v = Random.rDouble(50000);
    }

    @Test
    public void randomDoubleMixAndMax() {
        double v = Random.rDouble(50000, 1000000);
    }
}
