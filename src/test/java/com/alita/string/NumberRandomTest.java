package com.alita.string;

import com.alita.Random;
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
        int integer = Random.integer();
        System.out.println(integer);
    }

    @Test
    public void integerLimit() {
        int integer = Random.integer(10);
        System.out.println(integer);
    }

    @Test
    public void integerMinAndMax() {
        int integer = Random.integer(10, 20);
        System.out.println(integer);
    }

    @Test
    public void randomLong() {
        long l = Random.randomLong();
        System.out.println(l);
    }
}
