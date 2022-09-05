package com.alita.ramdom;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @Description: map
 * @Author: Luancx
 * @Date: 2022/9/5
 */
public class MapRandom {
    /**
     * 随机从参数中选择一个元素
     *
     * @param map 参数
     * @return 元素
     */
    protected static <V, K> Map.Entry<K, V> randomEntryOne(Map<K, V> map) {
        if (null == map || map.isEmpty()) {
            return null;
        }
        int size = map.size();
        return getOne(map, Random.rInt(0, size));
    }

    private static <V, K> Map.Entry<K, V> getOne(Map<K, V> map, int num) {
        Set<Map.Entry<K, V>> entries = map.entrySet();
        Iterator<Map.Entry<K, V>> iterator = entries.iterator();
        Map.Entry<K, V> next = iterator.next();
        for (int i = 0; i < entries.size(); i++) {
            if (i == num) {
                return next;
            }
            next = iterator.next();
        }
        return next;
    }
}
