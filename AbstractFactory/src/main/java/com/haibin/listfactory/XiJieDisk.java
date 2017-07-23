package com.haibin.listfactory;

import com.haibin.factory.Disk;

/**
 * Created by haibin.tang on 2017/7/23.
 */
public class XiJieDisk extends Disk {

    public Disk createDisk() {
        this.setBrand("希捷");
        this.setSize(1024 * 1000);
        return this;
    }
}
