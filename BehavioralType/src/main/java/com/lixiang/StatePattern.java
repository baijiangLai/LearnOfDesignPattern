package com.lixiang;

public class StatePattern {
    public static void main(String[] args) {
        Zhangsan zhangsan = new Zhangsan();
        zhangsan.changeState(new Happy());
        zhangsan.doSomeThing();
    }
}


abstract class State {
    abstract void doWork();

}

class Happy extends State {


    @Override
    void doWork() {
        System.out.println("去上班");
    }
}


class Normal extends State {

    @Override
    void doWork() {
        System.out.println("在家睡觉");
    }
}


class Sad extends State {

    @Override
    void doWork() {
        System.out.println("选择休假");
    }
}


class Zhangsan {
    private State state;

    public void changeState(State state) {
        this.state = state;
    }

    public void doSomeThing() {
        state.doWork();
    }
}