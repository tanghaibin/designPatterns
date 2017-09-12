package com.tanghaibin.receive;

/**
 * Created by tanghaibin on 2017/8/17.
 */
public class PaintingReceive implements Receive {

    public void doJob() {
        System.out.println("ConcretCommand: execute painting...");
    }
}
