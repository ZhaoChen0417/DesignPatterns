package factory_pattern.factory_method_pattern.factory;

import factory_pattern.factory_method_pattern.BMW;
import factory_pattern.factory_method_pattern.Car;

public class BMWFactory implements CarFactory {
    @Override
    public Car buildCar() {
        System.out.println("这里是【宝马】工厂，只生产宝马汽车");
        return new BMW();
    }
}
