package com.lixiang;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class VisitorPattern {
    public static void main(String[] args) {
        BusinessReport report = new BusinessReport();
        System.out.println("=========== CEO看报表 ===========");
        report.showReport(new CEOVisitor());

        System.out.println("=========== CTO看报表 ===========");
        report.showReport(new CTOVisitor());
    }
}

abstract class Staff {
    String name;
    int kpi;

    public Staff(String name) {
        this.name = name;
        this.kpi = new Random().nextInt(10);
    }

    //所有的员工都需要接收访问者的访问
    abstract void accept(Visitor visitor);
}

class Engineer extends Staff {

    public Engineer(String name) {
        super(name);
    }

    @Override
    void accept(Visitor visitor) {
        visitor.visitEngineer(this);
    }

    // codeLines
    public int getCodeLines() {
        return new Random().nextInt(10 * 100000);
    }
}

class Manager extends Staff {
    public Manager(String name) {
        super(name);
    }

    @Override
    void accept(Visitor visitor) {
        visitor.visitManager(this);
    }

    //product number
    public int getProducts() {
        return new Random().nextInt(10);
    }
}


class BusinessReport {
    private List<Staff> staffList = new LinkedList<>();

    public BusinessReport() {
        staffList.add(new Manager("经理-A"));
        staffList.add(new Engineer("工程师-A"));
        staffList.add(new Engineer("工程师-B"));
        staffList.add(new Engineer("工程师-C"));
        staffList.add(new Manager("经理-B"));
        staffList.add(new Engineer("工程师-D"));
    }

    //对访问者展示报表
    public void showReport(Visitor visitor) {
        for (Staff staff : staffList) {
            staff.accept(visitor);
        }
    }
}



interface Visitor {
    void visitEngineer(Engineer engineer);

    void visitManager(Manager manager);
}

class CEOVisitor implements Visitor {

    @Override
    public void visitEngineer(Engineer engineer) {
        System.out.println("工程师: " + engineer.name + ", KPI: " + engineer.kpi);
    }

    @Override
    public void visitManager(Manager manager) {
        System.out.println("经理: " + manager.name + ", KPI: " + manager.kpi +
                ", 新产品数量: " + manager.getProducts());
    }
}

class CTOVisitor implements Visitor {

    @Override
    public void visitEngineer(Engineer engineer) {
        System.out.println("工程师: " + engineer.name + ", 代码行数: " + engineer.getCodeLines());
    }

    @Override
    public void visitManager(Manager manager) {
        System.out.println("经理: " + manager.name + ", 产品数量: " + manager.getProducts());
    }
}