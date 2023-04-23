package com.lixiang;

import java.util.HashSet;
import java.util.Set;

public class FlyWeightPattern {
    public static void main(String[] args) {
        Bike bike1 = MoBikeFactory.getInstance().getMoBike();
        bike1.ride("Zhangsan");

        Bike bike2 = MoBikeFactory.getInstance().getMoBike();
        bike2.ride("Wangwu");
        bike2.back();

        Bike bike3 = MoBikeFactory.getInstance().getMoBike();
        bike3.ride("Zhaosi");
        bike3.back();

        System.out.println(bike1 == bike2);
        System.out.println(bike2 == bike3);
    }
}

abstract class Bike {
    protected Integer state = 0; //0表示未使用、1表示使用

    //用户使用的状态
    abstract void ride(String userName);
    abstract void back();

    public Integer getState() {
        return state;
    }
}

class MoBike extends Bike {
    // 车架号
    private String bikeId;

    public MoBike(String bikeId) {
        this.bikeId = bikeId;
    }

    @Override
    void ride(String userName) {
        state = 1;
        System.out.println(userName + "骑第" + bikeId + "号自行车");
    }

    @Override
    void back() {
        state = 0;
    }
}

class MoBikeFactory {
    private static MoBikeFactory instance = new MoBikeFactory();
    private Set<Bike> pool = new HashSet<>();

    public static MoBikeFactory getInstance() {
        return instance;
    }

    private MoBikeFactory() {
        for (int i = 0; i < 2; i++) {
            pool.add(new MoBike(i + "号"));
        }
    }
    public Bike getMoBike() {
        for(Bike bike : pool){
            if (bike.getState() == 0){
                return bike;
            }
        }
        return null;
    }
}