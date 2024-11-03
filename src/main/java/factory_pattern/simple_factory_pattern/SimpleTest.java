package factory_pattern.simple_factory_pattern;

/*
* 注意点：目光放在对象的创建和使用解耦上
* 优点：逻辑简单，封装了创建逻辑，将创建和使用解耦
* 缺点：维护成本高，需要不断修改工厂内部实现，不符合开闭原则
* */

public class SimpleTest {
    public static void main(String[] args) {
        Car myCar = SimpleFactory.GetCar("BMW");
        if (myCar != null) {
            myCar.showBrand();
        } else {
            System.out.println("没有该类型车辆");
        }
    }
}
