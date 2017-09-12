package com.tanghaibin.invok;

import com.tanghaibin.command.Command;

/**
 * Created by tanghaibin on 2017/8/17.
 */
public class Invoker {

    public void invoke(Command command) {
        command.execute();
    }
}
