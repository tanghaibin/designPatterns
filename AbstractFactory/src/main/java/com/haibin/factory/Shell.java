package com.haibin.factory;

/**
 * Created by haibin.tang on 2017/7/23.
 *
 * 抽象产品零件  外壳
 */
public abstract class Shell {
    /**
     * 颜色
     */
    private String color;

    public abstract Shell createShell();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
