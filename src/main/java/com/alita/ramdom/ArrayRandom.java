package com.alita.ramdom;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * @Description: 数组
 * @Author: Luancx
 * @Date: 2022/02/25
 * @Version: 1.0.0
 */
public class ArrayRandom {
    private static int index = 1;

    /**
     * 随机从参数中选择一个元素
     *
     * @param list 集合
     * @param <T>  泛型
     * @return 元素
     */
    protected static <T extends Object & Comparable<? super T>> T randomOne(Collection<? extends T> list) {
        if (null == list || list.isEmpty()) {
            return null;
        }
        return getOne(list, Random.rInt(0, list.size()));
    }

    /**
     * 根据步长获取下一个元素
     *
     * @param list 集合
     * @param step 步长
     * @param <T>  泛型
     * @return 元素
     */
    protected static <T extends Object & Comparable<? super T>> T randomNext(Collection<? extends T> list, int step) {
        if (null == list || list.isEmpty()) {
            return null;
        }
        if (step <= 0) {
            step = 1;
        }
        while (index >= list.size()) {
            index = index % list.size();
        }
        T one = getOne(list, index);
        index += step;
        return one;
    }

    private static <T extends Object & Comparable<? super T>> T getOne(Collection<? extends T> list, int num) {
        Iterator<? extends T> iterator = list.stream().iterator();
        T next = iterator.next();
        for (int i = 0; i < list.size(); i++) {
            if (i == num) {
                return next;
            }
            next = iterator.next();
        }
        return next;
    }

    /**
     * 将集合复制多次
     *
     * @param list 集合
     * @param min  最小次数
     * @param max  最大次数
     * @param <T>  泛型
     * @return 集合
     */
    protected static <T> List<T> randomCopy(List<T> list, int min, int max) {
        if (min < 0 || max < 0) {
            return list;
        }
        int count;
        if (min > max || min == max) {
            count = max;
        } else {
            count = Random.rInt(min, max);
        }

        if (count <= 1) {
            return list;
        }
        List<T> newList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            Iterator<? extends T> iterator = list.stream().iterator();
            while (iterator.hasNext()) {
                newList.add(iterator.next());
            }
        }
        return newList;
    }
}
