package factory_pattern.factory_method_pattern.factory;

import factory_pattern.factory_method_pattern.Benz;
import factory_pattern.factory_method_pattern.Car;

public class BenzFactory implements CarFactory {
    @Override
    public Car buildCar() {
        System.out.println("这里是【奔驰】工厂，只生产奔驰汽车");
        return new Benz();
    }
}
