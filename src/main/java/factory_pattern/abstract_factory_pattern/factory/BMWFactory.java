package factory_pattern.abstract_factory_pattern.factory;

import factory_pattern.abstract_factory_pattern.BClassCar;
import factory_pattern.abstract_factory_pattern.BMWB;
import factory_pattern.abstract_factory_pattern.BMWC;
import factory_pattern.abstract_factory_pattern.CClassCar;

public class BMWFactory implements AbstractCarFactory{
    @Override
    public BClassCar build_B_ClassCar() {
        System.out.println("宝马车厂，生产B级车");
        return new BMWB();
    }

    @Override
    public CClassCar build_C_ClassCar() {
        System.out.println("宝马车厂，生产C级车");
        return new BMWC();
    }
}
