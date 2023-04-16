package com.lixiang;

import java.security.PublicKey;

public class SimpleFactory {
    public static void main(String[] args) {
        Product product = SimpleFactory.createProduct("A");
        product.print();
    }

    public static Product createProduct(String type) {
        if ("A".equals(type)){
            return new ProductA();
        }else {
            return new ProductB();
        }
    }
}

abstract class Product{
    public abstract void print();
}

class ProductA extends Product{

    @Override
    public void print() {
        System.out.println("产品A");
    }
}

class ProductB extends Product{

    @Override
    public void print() {
        System.out.println("产品B");
    }
}
