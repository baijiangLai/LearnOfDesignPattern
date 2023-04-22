package com.lixiang;

/**
 * 静态代理模式
 */
public class ProxyPattern {
    public static void main(String[] args) {
        new RealSubjectProxy().doWork();
    }
}

interface Subject {
    void doWork();
}

class RealSubject implements Subject {

    @Override
    public void doWork() {
        System.out.println("我是房东");
    }
}


class RealSubjectProxy implements Subject {
    private RealSubject realSubject;

    //装饰器模式
//    public RealSubjectProxy(RealSubject realSubject) {
//        this.realSubject = realSubject;
//    }

    public RealSubjectProxy() {
        try {
            this.realSubject = (RealSubject) this.getClass().getClassLoader().loadClass("com.lixiang.RealSubject").newInstance();
        } catch (Exception e) {

        }
    }

    @Override
    public void doWork() {
        findHouseOwner();
        demand();
        realSubject.doWork();
        rent();
    }

    public void findHouseOwner() {
        System.out.println("找房东");
    }

    public void demand() {
        System.out.println("这是用户的需求");
    }

    public void rent() {
        System.out.println("这是房租");
    }
}