package com.lixiang;

import java.util.ArrayList;
import java.util.List;

public class CompositePattern {
    public static void main(String[] args) {
        Composite china = new Composite();
        City shanghai = new City(10000);
        City beijing = new City(12000);

        china.add(shanghai);
        china.add(beijing);

        Composite shandong = new Composite();
        shandong.add(new City(3000));//淄博
        shandong.add(new City(1000));//曹县

        china.add(shandong);

        System.out.println(china.count());
    }
}

/**
 * 财政统计接口
 */
interface Counter {
   int count();
}

/**
 * 对应类图中的leaf
 */
class City implements Counter {
    private int sum = 0;
    public City(int sum) {
        this.sum = sum;
    }
    @Override
    public int count() {
        return sum;
    }
}


/**
 * 对应类图中的Composite
 */
class Composite implements Counter {
    private List<Counter> cities = new ArrayList<>();

    public void add(Counter counter) {
        cities.add(counter);
    }
    public void delete(City city) {
        cities.remove(city);
    }
    public List<Counter> showAll(){
        return cities;
    }

    @Override
    public int count() {
        int sum = 0;
        for (int i = 0; i < cities.size(); i++) {
            sum += cities.get(i).count();
        }
        return sum;
    }
}