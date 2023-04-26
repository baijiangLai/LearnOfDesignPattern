package com.lixiang;

public class PrototypePattern {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.toString());

        Car carClone = (Car) car.clone();
        System.out.println(carClone.toString());
    }
}


interface Prototype {
    Object clone();
}
class Car implements Prototype {
    private String name;
    private int price;

    public Car() {
        this.name = "这是" + Math.random() + "辆车";
        this.price = 1000;
    }

    public Car(Car car) {
        this.name = car.name;
        this.price = car.price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public Object clone() {
        return new Car(this);
    }
}
