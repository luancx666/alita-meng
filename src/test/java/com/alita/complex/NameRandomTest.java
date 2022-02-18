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
public class NameRandomTest {

    @Test
    public void testRandomFirst() {
        String s = Random.rFirst();
        Assert.assertNotNull(s);
    }

    @Test
    public void testRandomLast() {
        String s = Random.rLast();
        Assert.assertNotNull(s);
    }

    @Test
    public void testRandomName() {
        String s = Random.rName();
        Assert.assertNotNull(s);
    }

    @Test
    public void testRandomCFirst() {
        String s = Random.rCFirst();
        Assert.assertNotNull(s);
    }

    @Test
    public void testRandomCLast() {
        String s = Random.rCLast();
        Assert.assertNotNull(s);
    }

    @Test
    public void testRandomCName() {
        String s = Random.rCName();
        Assert.assertNotNull(s);
    }
}
