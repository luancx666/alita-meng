package com.alita.complex;

import com.alita.Random;
import org.junit.Test;

/**
 * @Description:
 * @Author: Luancx
 * @Date: 2022/02/17
 * @Version: 1.0.0
 */
public class NameRandomTest {

    @Test
    public void testRandomFirst() {
        String s = Random.rFirst();
        System.out.println(s);
    }

    @Test
    public void testRandomLast() {
        String s = Random.rLast();
        System.out.println(s);
    }

    @Test
    public void testRandomName() {
        String s = Random.rName();
        System.out.println(s);
    }

    @Test
    public void testRandomCFirst() {
        String s = Random.rCFirst();
        System.out.println(s);
    }

    @Test
    public void testRandomCLast() {
        String s = Random.rCLast();
        System.out.println(s);
    }

    @Test
    public void testRandomCName() {
        String s = Random.rCName();
        System.out.println(s);
    }
}
