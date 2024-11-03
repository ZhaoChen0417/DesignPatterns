package factory_pattern.factory_method_pattern.factory;

import factory_pattern.factory_method_pattern.Audi;
import factory_pattern.factory_method_pattern.Car;

public class AudiFactory implements CarFactory {
    @Override
    public Car buildCar() {
        System.out.println("这里是【奥迪】工厂，只生产奥迪汽车");
        return new Audi();
    }
}
