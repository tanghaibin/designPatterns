package com.haibin.listfactory;

import com.haibin.factory.*;

/**
 * Created by haibin.tang on 2017/7/23.
 */
public class ASUSFactory extends Factory {

    public Disk makeDisk() {
        return new XiJieDisk().createDisk();
    }

    public Motherboard makeMotherboard() {
        return new ASUSMotherboard().createMotherboard();
    }

    public Ram makeRam() {
        return new SanXingRam().createRam();
    }

    public Shell makeShell() {
        return new ASUSShell().createShell();
    }

    public Computer getComputer() {
        return new ASUSComputer();
    }
}
