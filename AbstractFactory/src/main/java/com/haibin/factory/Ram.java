package com.haibin.factory;

/**
 * Created by haibin.tang on 2017/7/23.
 *
 * 抽象产品零件：内存条
 */
public abstract class Ram {
    /**
     * 大小
     */
    private int size;

    public abstract Ram createRam();

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
