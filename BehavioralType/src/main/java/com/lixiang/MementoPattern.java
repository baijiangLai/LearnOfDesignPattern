package com.lixiang;

import java.util.LinkedList;

public class MementoPattern {
    public static void main(String[] args) {
        History history = new History();
        Document document = new Document();
        document.change("123");
        history.add(document.save());

        document.change("456");
        history.add(document.save());

        document.change("123214124324");

        document.resume(history.getLastVersion());
        document.print();

        document.resume(history.getLastVersion());
        document.print();
    }
}

class Document {
    private String content;

    //备份
    public BackUp save(){
        return new BackUp(content);
    }

    //恢复
    public void resume(BackUp backUp) {
        content = backUp.content;
    }

    public void change(String content) {
        this.content = content;
    }

    public void print() {
        System.out.println(content);
    }
}

/**
 * 备忘录接口: 用来定义元数据方法
 */
interface Memento {
}

class BackUp implements Memento {
    String content;
    public BackUp(String content) {
        this.content = content;
    }
}

/**
 * 备忘录栈
 */

class History {
    LinkedList<BackUp> backUpStack = new LinkedList<>();
    public void add(BackUp backUp) {
        backUpStack.push(backUp);
    }
    public BackUp getLastVersion() {
        return backUpStack.pop();
    }
}
