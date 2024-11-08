package com.principles.interface_segregation;/*
package com.principles.interface_segregation;

public class InterfaceSegregation1 {
    public static void main(String[] args) {

    }
}

// 接口1中有5个方法，类B和D分别实现接口
// 类A通过接口1会依赖（实现）B，但只会使用1,2,3三个方法
// 类C通过接口1会依赖（实现）D，但只会使用1,4,5三个方法
interface Interface1 {
    void operation1();

    void operation2();

    void operation3();

    void operation4();

    void operation5();
}

class B implements Interface1 {
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

    @Override
    public void operation4() {
        System.out.println("B 实现了 operation4");
    }

    @Override
    public void operation5() {
        System.out.println("B 实现了 operation5");
    }
}

class D implements Interface1 {
    @Override
    public void operation1() {
        System.out.println("D 实现了 operation1");
    }

    @Override
    public void operation2() {
        System.out.println("D 实现了 operation2");
    }

    @Override
    public void operation3() {
        System.out.println("D 实现了 operation3");
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
    public void depend1(Interface1 i){
        i.operation1();
    }
    public void depend2(Interface1 i){
        i.operation2();
    }
    public void depend3(Interface1 i){
        i.operation3();
    }
}

class C {  // C类通过接口Interface1 依赖(使用)D类，但只会使用到1,4,5方法
    public void depend1(Interface1 i){
        i.operation1();
    }
    public void depend4(Interface1 i){
        i.operation2();
    }
    public void depend5(Interface1 i){
        i.operation3();
    }
}
*/
