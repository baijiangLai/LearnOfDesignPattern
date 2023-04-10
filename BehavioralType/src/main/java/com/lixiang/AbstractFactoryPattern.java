package com.lixiang;

public class AbstractFactoryPattern {
    public static void main(String[] args) {

    }
}

interface AbstractFactory{
    Phone createPhone(String type);
    Mask createMask(String type);
}

class SuperFactory implements AbstractFactory {

    @Override
    public Phone createPhone(String type) {
        return new XiaoMi();
    }

    @Override
    public Mask createMask(String type) {
        return new N95();
    }
}

interface Phone{
    void print();
}

class Xiaomi implements Phone{

    @Override
    public void print() {
        System.out.println("谁tm买小米");
    }
}

interface Mask{
    void print();
}

class N95 implements Mask{

    @Override
    public void print() {
        System.out.println("这是N95口罩");
    }
}
