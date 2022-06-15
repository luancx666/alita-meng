package com.alita.address;

import com.alita.ramdom.Random;
import junit.framework.TestCase;
import org.junit.Assert;

/**
 * @Description:
 * @Author: Luancx
 * @Date: 2022/02/23
 * @Version: 1.0.0
 */
public class AddressRandomTest extends TestCase {

    public void testRandomProvince() {
        String s = Random.rProvince();
        Assert.assertNotNull(s);
    }

    public void testRandomCity() {
        String s = Random.rCity();
        Assert.assertNotNull(s);
    }

    public void testRandomCounty() {
        String s = Random.rCounty();
        Assert.assertNotNull(s);
    }

    public void testRandomArea() {
        String s = Random.rArea();
        Assert.assertNotNull(s);
    }

    public void testAssignArea() {
        String s = Random.assignArea("110100");
        Assert.assertNotNull(s);
    }
}