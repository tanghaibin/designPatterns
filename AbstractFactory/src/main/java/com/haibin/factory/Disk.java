package com.haibin.factory;

/**
 * Created by haibin.tang on 2017/7/23.
 *
 * 抽象产品零件  磁盘
 */
public abstract class Disk {
    /**
     * 大小
     */
    private int size;
    /**
     * 品牌
     */
    private String brand;

    public abstract Disk createDisk();

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

}
