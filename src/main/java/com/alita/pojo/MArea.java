package com.alita.pojo;

import com.alita.Random;

import java.util.List;

/**
 * @Description: 地区
 * @Author: Luancx
 * @Date: 2022/02/22
 * @Version: 1.0.0
 */
public class MArea {
    /**
     * 编号
     */
    private String code;
    /**
     * 地区
     */
    private String name;
    /**
     * 下级
     */
    private List<MArea> child;

    public MArea(String code, String name) {
        this.code = code;
        this.name = name;
    }

    protected String getCode() {
        return code;
    }

    protected void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public List<MArea> getChild() {
        return child;
    }

    public void setChild(List<MArea> child) {
        this.child = child;
    }

    public MArea getChild(boolean flag) {
        if (null == child || !flag) {
            return null;
        }
        return child.get(Random.rInt(child.size()));
    }
}
