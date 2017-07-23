package com.haibin.factory;

/**
 * Created by haibin.tang on 2017/7/23.
 *
 * 抽象产品  电脑
 */
public abstract class Computer {

    private Disk disk;

    private Motherboard motherboard;

    private Ram ram;

    private Shell shell;

    public Disk getDisk() {
        return disk;
    }

    public void setDisk(Disk disk) {
        this.disk = disk;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public Shell getShell() {
        return shell;
    }

    public void setShell(Shell shell) {
        this.shell = shell;
    }
}
