package com.haibin.adapter.extend;

/**
 * Created by tanghaibin on 2017/9/12.
 *
 * 目标接口，对外提供服务
 */
public interface Target {

    /**
     * 获取指定的电压
     * @param voltage
     * @return
     */
    String getVoltage(int voltage);
}
