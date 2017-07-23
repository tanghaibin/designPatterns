package com.haibin.factory;

/**
 * Created by haibin.tang on 2017/7/23.
 * 抽象产品零件：主板
 */
public abstract class Motherboard {
    /**
     * 重量
     */
    private int weight;
    /**
     * 品牌
     */
    private String brand;

    public abstract Motherboard createMotherboard();

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
