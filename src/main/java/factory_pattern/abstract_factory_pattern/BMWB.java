package factory_pattern.abstract_factory_pattern;

import factory_pattern.abstract_factory_pattern.BClassCar;

public class BMWB implements BClassCar {
    @Override
    public void showClassB() {
        System.out.println("这是一辆【宝马】B系列车");
    }
}
