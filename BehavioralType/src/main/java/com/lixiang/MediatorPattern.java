package com.lixiang;


import java.util.ArrayList;
import java.util.List;

public class MediatorPattern {
    public static void main(String[] args) {
        //创建聊天室
        ConcreteChatRoom chatRoom = new ConcreteChatRoom();
        //创建群成员
        ConcretePerson zhangSan = new ConcretePerson("zhangsan", chatRoom);
        ConcretePerson liSi = new ConcretePerson("lisi", chatRoom);
        ConcretePerson wangWu = new ConcretePerson("wangwu", chatRoom);

        chatRoom.addPerson(zhangSan);
        chatRoom.addPerson(liSi);
        chatRoom.addPerson(wangWu);

        zhangSan.sendMessage("李四还钱");
        liSi.sendMessage("王五还钱");

        wangWu.sendMessage("我真没钱");

    }
}

interface ChatRoomMediator {
    void sendMessage(String message, Person person);
}

abstract class Person {
    protected String name;
    protected ChatRoomMediator mediator;

    public Person(String name, ChatRoomMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    abstract void sendMessage(String message);
    abstract void getMessage(String message);
}

class ConcretePerson extends Person {

    public ConcretePerson(String name, ChatRoomMediator mediator) {
        super(name, mediator);
    }

    @Override
    void sendMessage(String message) {
        System.out.println("User " + name + " sends message: " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    void getMessage(String message) {
        System.out.println("User " + name + " receives message: " + message);
    }
}

class ConcreteChatRoom implements ChatRoomMediator {
    private List<Person> personList = new ArrayList<>();

    @Override
    public void sendMessage(String message, Person sender) {
        //对自己不发消息，其他人要接收消息
        for (Person person : personList) {
            if (person != sender) {
                person.getMessage(message);
            }
        }
    }
    public void addPerson(Person person) {
        personList.add(person);
    }
}


