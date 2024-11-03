package factory_pattern.factory_method_pattern;

import factory_pattern.factory_method_pattern.factory.BMWFactory;


/*
* 注意点：在简单工厂的基础上，对简单工厂进行优化，让对应的工厂生产对应的车，而不是一个工厂生产所有类型的车
* 优点：相比简单工厂，利于扩展和维护。当新增一种车时，只需要创建对应的具体产品类和负责生产对应产品的工厂即可。符合“开闭原则”，便于扩展
* 缺点：具有一定的局限性，只能生产出一种产品（由接口内部方法决定），比如我要生成BMW品牌的某级别的车就不支持
*
* */
public class FactoryTest {
    public static void main(String[] args) {
        //只需要知道哪个工厂生产宝马汽车就行
        BMWFactory bmwFactory = new BMWFactory();
        Car myCar = bmwFactory.buildCar();
        myCar.showBrand();
    }
}
