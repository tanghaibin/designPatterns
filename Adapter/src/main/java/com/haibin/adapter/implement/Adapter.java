package com.haibin.adapter.implement;

import com.haibin.adapter.Adaptee;

/**
 * Created by tanghaibin on 2017/9/12.
 * 转换电压为指定电压 充当适配器角色  委托方式实现
 */
public class Adapter extends Target{

    private static final String unit = "V";

    private Adaptee adaptee;

    public Adapter() {
        adaptee = new Adaptee();
    }

    String getVoltage(int voltage) {
        String oldVoltage = adaptee.getVoltage();
        System.out.println("原始电压:" + oldVoltage);
        System.out.println("转换电压....");
        System.out.println("转换后:" + voltage + unit);
        return voltage + unit;
    }
}
