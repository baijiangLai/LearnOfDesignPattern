package com.lixiang;

import java.util.Random;

public class BridgePattern {
    public static void main(String[] args) {
        Milk milk = new Milk();
        RefinedCoffee largeCoffeeWithMilk = new LargeCoffee(milk);
        largeCoffeeWithMilk.orderCoffee(2);
        largeCoffeeWithMilk.checkQuality();

    }
}

/**
 * 微辣、中辣、特辣
 */
interface CoffeeAdditives {
    void addSomeAdditives();
}

/**
 * 定义火锅的接口
 */
abstract class Coffee {
    protected CoffeeAdditives additives;
    public Coffee(CoffeeAdditives additives) {
        this.additives = additives;
    }
    abstract void orderCoffee(int count);
}

abstract class RefinedCoffee extends Coffee {

    public RefinedCoffee(CoffeeAdditives additives) {
        super(additives);
    }

    public void checkQuality() {
        Random random = new Random();
        System.out.println(String.format("%s 添加%s",additives.getClass().getSimpleName(),random.nextBoolean()?"太多":"正常"));
    }
}

/**
 * 牛奶
 */
class Milk implements CoffeeAdditives {

    @Override
    public void addSomeAdditives() {
        System.out.println("加奶");
    }
}

/**
 * 糖精
 */
class  Sugar implements CoffeeAdditives {

    @Override
    public void addSomeAdditives() {
        System.out.println("加糖");
    }
}

class LargeCoffee extends RefinedCoffee {

    public LargeCoffee(CoffeeAdditives additives) {
        super(additives);
    }

    @Override
    void orderCoffee(int count) {
        additives.addSomeAdditives();
        System.out.println(String.format("大杯咖啡%d杯",count));
    }
}

class SmallCoffee extends RefinedCoffee {

    public SmallCoffee(CoffeeAdditives additives) {
        super(additives);
    }

    @Override
    void orderCoffee(int count) {
        additives.addSomeAdditives();
        System.out.println(String.format("小杯咖啡%d杯",count));
    }
}
