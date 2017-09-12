package com.haibin.adapter.extend;

import com.haibin.adapter.Adaptee;

/**
 * Created by tanghaibin on 2017/9/12.
 *
 * 转换电压为指定电压 充当适配器角色  继承方式实现
 */
public class Adapter extends Adaptee implements Target {

    private static final String unit = "V";

    public String getVoltage(int voltage) {
        String oldVoltage = super.getVoltage();
        System.out.println("原始电压:" + oldVoltage);
        System.out.println("转换电压....");
        System.out.println("转换后:" + voltage + unit);
        return voltage + unit;
    }
}
