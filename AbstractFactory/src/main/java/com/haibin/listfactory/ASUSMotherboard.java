package com.haibin.listfactory;

import com.haibin.factory.Motherboard;

/**
 * Created by haibin.tang on 2017/7/23.
 */
public class ASUSMotherboard extends Motherboard {

    public Motherboard createMotherboard() {
        this.setBrand("华硕");
        this.setWeight(1);
        return this;
    }
}
