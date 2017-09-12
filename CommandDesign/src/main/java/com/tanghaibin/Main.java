package com.tanghaibin;

import com.tanghaibin.command.Command;
import com.tanghaibin.command.ConcretCommand;
import com.tanghaibin.invok.Invoker;
import com.tanghaibin.receive.PaintingReceive;
import com.tanghaibin.receive.SingingReceive;

/**
 * Created by tanghaibin on 2017/8/17.
 */
public class Main {

    public static void main(String[] args) {

        Command paintingCommand = new ConcretCommand(new PaintingReceive());

        Command singingCommand = new ConcretCommand(new SingingReceive());

        Invoker invoker = new Invoker();
        invoker.invoke(paintingCommand);
        invoker.invoke(singingCommand);
    }
}
