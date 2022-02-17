package com.alita.complex;

import com.alita.Random;
import junit.framework.TestCase;

import java.util.Date;

/**
 * @Description:
 * @Author: Luancx
 * @Date: 2022/02/17
 * @Version: 1.0.0
 */
public class DateRandomTest extends TestCase {

    public void testNow() {
        Date now = Random.now();
        System.out.println(now);
    }

    public void testRandomDate() {
        Date date = Random.rDate();
        System.out.println(date);
    }

    public void testTestRandomDate() {
        Date date = Random.rDate(792998075000L, 919228475000L);
        System.out.println(date);
    }

    public void testNowString() {
        String date = Random.nowString();
        System.out.println(date);
    }

    public void testTestNowString() {
        String date = Random.nowString("yyyy年MM月dd日 HH:mm:ss");
        System.out.println(date);
    }

    public void testRandomDateString() {
        String date = Random.rDateString();
        System.out.println(date);
    }

    public void testTestRandomDateString() {
        String date = Random.rDateString("yyyy年MM月dd日 HH:mm:ss");
        System.out.println(date);
    }

    public void testTestRandomDateString1() {
        String date = Random.rDateString(792998075000L, 919228475000L);
        System.out.println(date);
    }

    public void testTestRandomDateString2() {
        String date = Random.rDateString(792998075000L, 919228475000L, "yyyy年MM月dd日 HH:mm:ss");
        System.out.println(date);
    }
}