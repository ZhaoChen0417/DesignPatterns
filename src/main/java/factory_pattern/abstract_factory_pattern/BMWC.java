package factory_pattern.abstract_factory_pattern;

import factory_pattern.abstract_factory_pattern.CClassCar;

public class BMWC implements CClassCar {
    @Override
    public void showClassC() {
        System.out.println("这是一辆【宝马】C系列车");
    }
}
