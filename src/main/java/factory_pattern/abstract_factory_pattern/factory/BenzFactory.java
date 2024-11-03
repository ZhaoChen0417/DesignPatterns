package factory_pattern.abstract_factory_pattern.factory;

import factory_pattern.abstract_factory_pattern.BClassCar;
import factory_pattern.abstract_factory_pattern.BenzB;
import factory_pattern.abstract_factory_pattern.BenzC;
import factory_pattern.abstract_factory_pattern.CClassCar;

public class BenzFactory implements factory_pattern.abstract_factory_pattern.factory.AbstractCarFactory {
    @Override
    public BClassCar build_B_ClassCar() {
        System.out.println("奔驰车厂，生产B级车");
        return new BenzB();
    }

    @Override
    public CClassCar build_C_ClassCar() {
        System.out.println("奔驰车厂，生产C级车");
        return new BenzC();
    }
}
