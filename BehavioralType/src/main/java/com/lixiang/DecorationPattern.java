package com.lixiang;

public class DecorationPattern {
    public static void main(String[] args) {
        new TwoRobot(new FirstRobot()).doTwoThing();
    }

}

interface Robot {
    void doOneThing();
    default void say(){
        System.out.println("我是第一代机器人");
    }
}

class FirstRobot implements Robot {
    @Override
    public void say() {
        Robot.super.say();
    }

    @Override
    public void doOneThing() {
        System.out.println("唱歌");
        System.out.println("跳舞");
    }
}

abstract class RobotDecorator implements Robot {
    private Robot robot;

    public RobotDecorator(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void doOneThing() {
        robot.doOneThing();
    }
}

class TwoRobot extends RobotDecorator {
    public TwoRobot(Robot robot) {
        super(robot);
    }

    public void doTwoThing(){
        super.doOneThing();
        System.out.println("rap");
        System.out.println("篮球");
    }
}