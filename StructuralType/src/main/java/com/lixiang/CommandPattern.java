package com.lixiang;

import java.util.ArrayList;
import java.util.List;

public class CommandPattern {
    public static void main(String[] args) {
        //通过声音进行控制
        SoundInvoker soundInvoker = new SoundInvoker();
        //生成要笔命令
        BingBiReceiver bingBiReceiver = new BingBiReceiver();
        BiCommand biCommand = new BiCommand(bingBiReceiver);
        soundInvoker.addCommands(biCommand);

        //生成要玉玺的命令

        ZhangYinReceiver zhangYinReceiver = new ZhangYinReceiver();
        YuXiCommand yuXiCommand = new YuXiCommand(zhangYinReceiver);
        soundInvoker.addCommands(yuXiCommand);

        //执行命令
        soundInvoker.executeCommand();

    }
}

interface Command {
    void execute();
}

class BingBiReceiver {
    public void givePen() {
        System.out.println("给皇帝递笔....");
    }
}


class ZhangYinReceiver {
    public void giveImperialJadeSeal() {
        System.out.println("给皇帝递玉玺...");
    }
}

class BiCommand implements Command{
    private BingBiReceiver bingBiReceiver;

    public BiCommand(BingBiReceiver bingBiReceiver) {
        this.bingBiReceiver = bingBiReceiver;
    }

    @Override
    public void execute() {
        bingBiReceiver.givePen();
    }
}


class YuXiCommand implements Command {
    private ZhangYinReceiver zhangYinReceiver;

    public YuXiCommand(ZhangYinReceiver zhangYinReceiver) {
        this.zhangYinReceiver = zhangYinReceiver;
    }

    @Override
    public void execute() {
        zhangYinReceiver.giveImperialJadeSeal();
    }
}

class SoundInvoker {
    private final List<Command> commands = new ArrayList<>();
    //清除下发的命令
    public void clearCommand() {
        commands.clear();
    }

    //添加命令
    public void addCommands(Command command) {
        commands.add(command);
    }
    //执行命令
    public void executeCommand() {
        for(Command command : commands) {
            command.execute();
        }
    }
}

