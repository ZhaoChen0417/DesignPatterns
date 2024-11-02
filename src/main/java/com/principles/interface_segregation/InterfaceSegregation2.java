package com.principles.interface_segregation;

public class InterfaceSegregation2 {
    public static void main(String[] args) {

        // 通过多态和接口隔离，可以让A不直接依赖于B，而是依赖任何实现了B接口的类，从而实现解耦
        // 而接口可以多实现，就可以对接口一致进行拆分，一直到最小为止

        A a = new A();
        a.depend1(new B()); //A类通过接口去依赖B类
        a.depend2(new B());
        a.depend3(new B());

        C c = new C();
        c.depend1(new D()); //C类通过接口去依赖(使用)D
        c.depend4(new D());
        c.depend5(new D());
    }
}

// 接口1
interface Interface1 {
    void operation1();
}

// 接口2
interface Interface2 {
    void operation2();

    void operation3();
}

// 接口3
interface Interface3 {
    void operation4();

    void operation5();
}

class B implements Interface1, Interface2 {
    @Override
    public void operation1() {
        System.out.println("B 实现了 operation1");
    }

    @Override
    public void operation2() {
        System.out.println("B 实现了 operation2");
    }

    @Override
    public void operation3() {
        System.out.println("B 实现了 operation3");
    }
}

class D implements Interface1, Interface3 {
    @Override
    public void operation1() {
        System.out.println("D 实现了 operation1");
    }

    @Override
    public void operation4() {
        System.out.println("D 实现了 operation4");
    }

    @Override
    public void operation5() {
        System.out.println("D 实现了 operation5");
    }
}

class A { // A类通过接口Interface1 依赖(使用)B类，但只会使用到1,2,3方法
    public void depend1(B i) {
        i.operation1();
    }

    public void depend2(Interface2 i) {
        i.operation2();
    }

    public void depend3(Interface2 i) {
        i.operation3();
    }
}

class C {  // C类通过接口Interface1 依赖(使用)D类，但只会使用到1,4,5方法
    public void depend1(Interface1 i) {
        i.operation1();
    }

    public void depend4(Interface3 i) {
        i.operation4();
    }

    public void depend5(Interface3 i) {
        i.operation5();
    }
}