package factory_pattern.abstract_factory_pattern;

import factory_pattern.abstract_factory_pattern.factory.BMWFactory;
import factory_pattern.abstract_factory_pattern.factory.BenzFactory;

/*
* 优点：
* 1. 抽象工厂模式隔离了具体类的生成，将创建和使用解耦，利用扩展和维护。所有的具体工厂都实现了抽象工厂中定义的那些公共接口，
*    只需要改变具体工厂的实例，就可以在某种程度上改变整个软件系统的行为
* 2. 当一个产品族中的多个对象被设计成一起工作时，它能够保证客户端始终只使用同一个产品族中的对象
* 3. 增加新的产品很方便，无需修改已有的系统，符合开闭原则
* 缺点：增加新的产品等级结构麻烦，需要对原有系统进行较大的修改，甚至需要修改抽象层代码，违背了“开闭原则”
*
* */

public class AbstractFactoryTest {
    public static void main(String[] args) {
        //生产宝马B级车，奔驰C级车，只需要知道对应工厂即可
        BMWFactory bmwFactory = new BMWFactory();
        BenzFactory benzFactory = new BenzFactory();

        bmwFactory.build_B_ClassCar().showClassB();
        benzFactory.build_C_ClassCar().showClassC();
    }
}