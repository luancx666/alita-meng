package com.alita;

import com.alita.ramdom.Random;
import junit.framework.TestCase;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: Luancx
 * @date: 2022/9/5
 */
public class MapRandomTest extends TestCase {
    private Map<String, String> getMap() {
        Map<String, String> map = new HashMap<>();
        map.put("a", "1");
        map.put("b", "2");
        map.put("c", "3");
        return map;
    }

    public void testRandomOne() {
        Map<String, String> map = getMap();
        for (int i = 0; i < 5; i++) {
            Map.Entry<String, String> one = Random.rMapEntryOne(map);
            Assert.assertNotNull(one.getKey());
            Assert.assertNotNull(one.getValue());
        }
    }
}
