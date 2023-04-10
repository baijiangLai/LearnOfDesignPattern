package com.lixiang;

public class FactoryPattern {
    public static void main(String[] args) {

    }
}

interface PhoneProduct{
    void print();
}

class IPhone implements PhoneProduct{

    @Override
    public void print() {
        System.out.println("iphone");
    }
}

class HUAWEIPhone implements PhoneProduct{

    @Override
    public void print() {
        System.out.println("HUAWEI");
    }
}

interface Factory{
    PhoneProduct createPhone();
}

class IPhoneFactory implements Factory{

    @Override
    public PhoneProduct createPhone() {
        return new IPhone();
    }
}

class HUAWEIFactory implements Factory{

    @Override
    public PhoneProduct createPhone() {
        return new HUAWEIPhone();
    }
}

