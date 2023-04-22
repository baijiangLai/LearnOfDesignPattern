package com.lixiang;

public class StrategyPattern {
    public static void main(String[] args) {
        Xiyiji xiyiji = new Xiyiji(new normal());
        xiyiji.execute();
    }
}

interface Strategy {
    void wash();
}

class normal implements Strategy {

    @Override
    public void wash() {
        System.out.println("正常洗衣服");
    }
}

class Piaoxi implements Strategy {

    @Override
    public void wash() {
        System.out.println("漂洗衣物");
    }
}


class Shuaigan implements Strategy {

    @Override
    public void wash() {
        System.out.println("甩干衣物");
    }
}

class Xiyiji {
    private Strategy strategy;

    public Xiyiji(Strategy strategy) {
        this.strategy = strategy;
    }
    public void execute() {
        strategy.wash();
    }
}