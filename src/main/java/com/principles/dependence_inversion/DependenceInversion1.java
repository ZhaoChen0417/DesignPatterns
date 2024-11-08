package com.principles.dependence_inversion;/*
package com.principles.dependence_inversion;

public class DependenceInversion1 {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}

class Email {
    public String getInfo() {
        return "电子邮件信息：Hello World";
    }
}

//完成Person接受消息的功能
//方式一完成
//1. 简单，比较容易想到
//2. 如果我们获取的对象是微信、短信等，则新增类，同时Person也要增加相应的接受方法
//3. 解决思路：引入一个抽象的接口IReceiver，表示接收者，这样Person类与接口发生依赖
//4. 因为Email、WeiXin 等都属于接受的范围，他们各自实现IReceiver接口就ok，这样就符合依赖倒转原则
class Person {
    public void receive(Email email) {
        System.out.println(email.getInfo());
    }
}

*/
