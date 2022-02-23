package com.alita;

import com.alita.pojo.MArea;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description: 地址
 * @Author: Luancx
 * @Date: 2022/02/22
 * @Version: 1.0.0
 */
public class AddressRandom {
    protected static Map<String, List<MArea>> ALL_AREA = new HashMap<>();
    private static List<String> REGION_LIST;
    private static List<MArea> PROVINCE_LIST = new ArrayList<>();
    private static List<MArea> CITY_LIST = new ArrayList<>();
    private static List<MArea> COUNTY_LIST = new ArrayList<>();

    static {
        //初始化省市区
        generateAddress();
    }

    /**
     * 省
     *
     * @return 省份
     */
    protected static String randomProvince() {
        return getProvince().getName();
    }

    /**
     * 省
     *
     * @return 省
     */
    protected static MArea getProvince() {
        return PROVINCE_LIST.get(NumberRandom.randomInt(PROVINCE_LIST.size()));
    }

    /**
     * 市
     *
     * @param flag 是否添加省名
     * @return 市
     */
    protected static String randomCity(boolean flag) {
        if (flag) {
            MArea province = getProvince();
            return province.getName() + " " + province.getChild(true).getName();
        }
        return getCity().getName();
    }

    /**
     * 获取市信息
     *
     * @return 市
     */
    private static MArea getCity() {
        return CITY_LIST.get(NumberRandom.randomInt(CITY_LIST.size()));
    }

    /**
     * 区
     *
     * @param flag 是否添加市名
     * @return 市
     */
    protected static String randomCounty(boolean flag) {
        if (flag) {
            MArea city = getCity();
            return city.getName() + " " + city.getChild(true).getName();
        }
        return COUNTY_LIST.get(NumberRandom.randomInt(COUNTY_LIST.size())).getName();
    }

    /**
     * 随机地址
     *
     * @return 地址
     */
    protected static String randomArea() {
        MArea province = getProvince();
        MArea city = province.getChild(true);
        return province.getName() + " " + city.getName() + " " + city.getChild(true).getName();
    }

    /**
     * 指定 code 下地区
     *
     * @param code code
     * @return 地区
     */
    protected static String assignArea(String code) {
        MArea area = getArea(code);
        return null == area ? null : area.getName();
    }

    /**
     * 指定 code 下地址
     *
     * @param code code
     * @return 市或区
     */
    private static MArea getArea(String code) {
        List<MArea> areas = ALL_AREA.get(code);
        if (null == areas || areas.isEmpty()) {
            return null;
        }
        return areas.get(NumberRandom.randomInt(areas.size()));
    }

    /**
     * 从文件中读取数据
     */
    private static void generateAddress() {
        File file = new File("src/main/resources/add_data.txt");
        BufferedReader reader = null;
        String temp;
        try {
            reader = new BufferedReader(new FileReader(file));
            while ((temp = reader.readLine()) != null) {
                buildData(temp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        //省
        List<MArea> areas = ALL_AREA.get("86");
        PROVINCE_LIST.addAll(areas);
        for (MArea area : PROVINCE_LIST) {
            //市
            CITY_LIST.addAll(area.getChild());
        }
        //区
        for (MArea area : CITY_LIST) {
            if (null == area.getChild() || area.getChild().isEmpty()) {
                continue;
            }
            COUNTY_LIST.addAll(area.getChild());
        }
    }

    /**
     * 组装数据
     *
     * @param str 原始数据
     */
    private static void buildData(String str) {
        String[] split = str.split(":");
        String s0 = split[0];
        String s1 = split[1];
        String s2 = split[2];
        MArea area = new MArea(s1, s2);
        if (ALL_AREA.containsKey(s0)) {
            ALL_AREA.get(s0).add(area);
        } else {
            List<MArea> pAreas = new ArrayList<>();
            pAreas.add(area);
            ALL_AREA.put(s0, pAreas);
        }
        if ("00".equals(s1.substring(s1.length() - 2))) {
            List<MArea> childAreas = new ArrayList<>();
            ALL_AREA.put(s1, childAreas);
            area.setChild(childAreas);
        }
    }
}
