package com.haibin.listfactory;

import com.haibin.factory.Ram;

/**
 * Created by haibin.tang on 2017/7/23.
 */
public class SanXingRam extends Ram {

    public Ram createRam() {
        this.setSize(8);
        return this;
    }
}
