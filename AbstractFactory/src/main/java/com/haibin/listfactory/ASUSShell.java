package com.haibin.listfactory;

import com.haibin.factory.Shell;

/**
 * Created by haibin.tang on 2017/7/23.
 */
public class ASUSShell extends Shell {

    public Shell createShell() {
        this.setColor("灰色");
        return this;
    }
}
