package com.alita;

import com.alita.ramdom.Random;
import junit.framework.TestCase;
import org.junit.Assert;

import java.util.Arrays;
import java.util.List;

/**
 * @Description:
 * @Author: Luancx
 * @Date: 2022/02/25
 * @Version: 1.0.0
 */
public class ArrayRandomTest extends TestCase {
    private static List<String> list = Arrays.asList("1", "2", "a", "b", "c");

    public void testRandomOne() {
        for (int i = 0; i < 10; i++) {
            String s = Random.rArrayOne(list);
            Assert.assertTrue(list.contains(s));
        }
    }

    public void testRandomList() {
        List<String> arrayList = Random.rArrayList(list, 3);
        System.out.println(arrayList);
        Assert.assertTrue(arrayList.size() == 3 || arrayList.size() == list.size());
    }

    public void testRandomNext() {
        for (int i = 0; i < 10; i++) {
            String s = Random.rArrayNext(list);
            Assert.assertTrue(list.contains(s));
        }
    }

    public void testTestRandomNext() {
        for (int i = 0; i < 10; i++) {
            String s = Random.rArrayNext(list, 2);
            Assert.assertTrue(list.contains(s));
        }
    }

    public void testRandomCopy() {
        List<String> newList = Random.rArrayCopy(list, 3);
        Assert.assertEquals(list.size() * 3, newList.size());
    }

    public void testTestRandomCopy() {
        List<String> newList = Random.rArrayCopy(list, 3, 10);
        Assert.assertTrue(newList.size() >= list.size() * 3 && newList.size() <= list.size() * 10);
    }
}