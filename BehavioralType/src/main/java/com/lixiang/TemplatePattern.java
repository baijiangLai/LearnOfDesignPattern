package com.lixiang;

public class TemplatePattern {
    public static void main(String[] args) {
        My my = new My();
        my.template();
    }
}

abstract class ReduceFatAndIncreaseMuscle {
    abstract void aerobicExercise();

    abstract void healthyDiet();

    abstract void strengthTraining();

    public final void template() {
        System.out.println("---减脂增肌开始---");
        aerobicExercise();
        healthyDiet();
        strengthTraining();
        System.out.println("---减脂增肌结束---");
    }
}

class My extends ReduceFatAndIncreaseMuscle {

    @Override
    void aerobicExercise() {
        System.out.println("多做有氧运动");
    }

    @Override
    void healthyDiet() {
        System.out.println("正确饮食");
    }

    @Override
    void strengthTraining() {
        System.out.println("力量训练");
    }
}
