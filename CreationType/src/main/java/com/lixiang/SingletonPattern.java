package com.lixiang;

/**
 * 成员变量加volatile作用：
 * 可以避免重排序。
 * singleton = new Singleton();可以分为三步：1. 分配内存；2. 初始化对象；3. 指向刚分配的地址。
 * 但是cpu会将指令进行一个重排序，如果此时有两个线程A、B，那么如果A执行了1、3，此时B判断为null，那么创建出来的两个对象就并非是同一个对象。
 *
 * 使用了懒汉式
 * 使用了双重检查锁：
 * 1. 减小同步的范围
 * 2. 确保了并发的正确性
 */
public class SingletonPattern {
    public static void main(String[] args) {

    }
}

class Singleton {
    private volatile static Singleton singleton;
    private Singleton(){

    }

    public static Singleton getSingleton(){
        if (singleton == null){
            synchronized (Singleton.class){
                if (singleton == null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
