package com.haibin.factory;

/**
 * Created by haibin.tang on 2017/7/23.
 *
 * 抽象工厂
 */
public abstract class Factory {

    /**
     * 制作磁盘
     * @return
     */
    public abstract Disk makeDisk();

    /**
     * 制作主板
     * @return
     */
    public abstract Motherboard makeMotherboard();

    /**
     * 制作内存条
     * @return
     */
    public abstract Ram makeRam();

    /**
     * 制作外壳
     * @return
     */
    public abstract Shell makeShell();

    public Factory getInstance(Class clazz) throws IllegalAccessException, InstantiationException {
        return (Factory) clazz.newInstance();
    }

    public abstract Computer getComputer();
    /**
     * 组装电脑
     * @return
     */
    public Computer makeComputer() {
        Computer computer = getComputer();
        if(computer == null) {
            throw new RuntimeException("请选择具体的电脑品牌商");
        }
        System.out.println("开始制作电脑");
        Disk disk = this.makeDisk();
        Motherboard motherboard = this.makeMotherboard();
        Ram ram = this.makeRam();
        Shell shell = this.makeShell();
        System.out.println(String.format("磁盘信息:大小[%s], 品牌[%s]", disk.getSize(), disk.getBrand()));
        System.out.println(String.format("主板信息:重量[%s], 品牌[%s]", motherboard.getWeight(), motherboard.getBrand()));
        System.out.println(String.format("内存信息:大小[%s]", ram.getSize()));
        System.out.println(String.format("外壳信息:颜色[%s]", shell.getColor()));

        computer.setDisk(disk);
        computer.setMotherboard(motherboard);
        computer.setRam(ram);
        computer.setShell(shell);
        return computer;
    }
}
