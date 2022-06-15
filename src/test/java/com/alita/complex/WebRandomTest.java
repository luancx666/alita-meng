package com.alita.complex;

import com.alita.ramdom.Random;
import junit.framework.TestCase;
import org.junit.Assert;

/**
 * @Description:
 * @Author: Luancx
 * @Date: 2022/02/18
 * @Version: 1.0.0
 */
public class WebRandomTest extends TestCase {

    public void testRandomProtocol() {
        String s = Random.rProtocol();
        Assert.assertNotNull(s);
    }

    public void testRandomDomain() {
        String s = Random.rDomain();
        Assert.assertNotNull(s);
    }

    public void testTestRandomDomain() {
        String s = Random.rDomain(10, 20);
        Assert.assertNotNull(s);
    }

    public void testRandomTld() {
        String s = Random.rTld();
        Assert.assertNotNull(s);
    }

    public void testRandomPath() {
        String s = Random.rPath();
        Assert.assertNotNull(s);
    }

    public void testTestRandomPath() {
        String s = Random.rPath(10, 20);
        Assert.assertNotNull(s);
    }

    public void testRandomUrl() {
        String s = Random.rUrl();
        Assert.assertNotNull(s);
    }

    public void testRandomEmail() {
        String s = Random.rEmail();
        Assert.assertNotNull(s);
    }

    public void testTestRandomEmail() {
        String s = Random.rEmail(10, 20);
        Assert.assertNotNull(s);
    }

    public void testRandomIp() {
        String s = Random.rIp();
        Assert.assertNotNull(s);
    }
}