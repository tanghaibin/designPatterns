package com.tanghaibin.command;

import com.tanghaibin.receive.Receive;

/**
 * Created by tanghaibin on 2017/8/17.
 */
public class ConcretCommand implements Command {

    private Receive receive;

    public ConcretCommand(Receive receive) {
        this.receive = receive;
    }

    public void execute() {
        receive.doJob();
    }
}
