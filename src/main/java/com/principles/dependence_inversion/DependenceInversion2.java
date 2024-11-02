package com.principles.dependence_inversion;

public class DependenceInversion2 {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
        person.receive(new WeiXin());
    }
}

//定义一个接口
interface IReceiver {
    public String getInfo();
}

class Email implements IReceiver {
    public String getInfo() {
        return "电子邮件信息：Hello World";
    }
}

class WeiXin implements IReceiver {
    public String getInfo() {
        return "WeiXin信息：Hello World";
    }
}

class Person {
    public void receive(IReceiver iReceiver) {
        System.out.println(iReceiver.getInfo());
    }
}

