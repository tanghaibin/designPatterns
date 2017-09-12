package com.haibin.adapter;

/**
 * Created by tanghaibin on 2017/9/12.
 *
 * 原始电压 充当 待适配对象角色
 */
public class Adaptee {

    /**
     * 返回240V电压
     * @return
     */
    public String getVoltage() {
        return "220V";
    }
}
