package com.lixiang;


public class ChainResPattern {
    public static void main(String[] args) {
        Handler sichuan = new Sichuan();
        Handler gansu = new Gansu();
        Handler xizang = new Xizang();

        sichuan.setNextHandler(gansu);
        gansu.setNextHandler(xizang);

        sichuan.process(10);
        gansu.process(11);
        xizang.process(21);
    }
}

abstract class Handler {
    protected Handler nextHandler;
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void process(Integer info);
}

/**
 * 四川只能提供1-10级别的风景
 */
class Sichuan extends Handler {
    @Override
    public void process(Integer info) {
        if (info > 0 && info < 11) {
            System.out.println("欢迎来到四川");
        } else {
            nextHandler.process(info);
        }
    }
}

class Gansu extends Handler {

    @Override
    public void process(Integer info) {
        if (info > 10 && info < 21) {
            System.out.println("欢迎来到甘肃");
        }
    }
}

/**
 * 因为西藏是所有旅途的最终点，那么最终在西藏结束旅途
 */
class Xizang extends Handler {

    @Override
    public void process(Integer info) {
        System.out.println("欢迎来到西藏");
        System.out.println("整个旅途结束");
    }
}