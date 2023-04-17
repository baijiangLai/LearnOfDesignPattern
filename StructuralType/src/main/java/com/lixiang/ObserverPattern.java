package com.lixiang;

import java.util.ArrayList;
import java.util.List;

public class ObserverPattern {
    public static void main(String[] args) {
        Debit zhangsan = new Zhangsan();
        zhangsan.borrow(new Wangwu());
        zhangsan.borrow(new Lisi());

        //当张三有钱的时候就通知借钱的自己有钱，可以开始还钱了
        zhangsan.notifyRepay(1);
    }
}


/**
 * 借钱的接口
 */
interface Debit {
    //找人借钱
    void borrow(Credit credit);

    void notifyRepay(int money);

}

/**
 * 具体借钱的人
 */
class Zhangsan implements Debit {
    private List<Credit> allCredits = new ArrayList<>();
    @Override
    public void borrow(Credit credit) {
        allCredits.add(credit);
    }

    @Override
    public void notifyRepay(int money) {
        allCredits.forEach(credit -> credit.takeMoney());
    }
}

interface Credit {
    void takeMoney();
}

class Lisi implements Credit {

    @Override
    public void takeMoney() {
        System.out.println("李四要钱");
    }
}

class Wangwu implements Credit {

    @Override
    public void takeMoney() {
        System.out.println("王五要钱");
    }
}