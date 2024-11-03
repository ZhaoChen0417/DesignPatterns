package factory_pattern.abstract_factory_pattern.factory;

import factory_pattern.abstract_factory_pattern.BClassCar;
import factory_pattern.abstract_factory_pattern.CClassCar;

public interface AbstractCarFactory {
    BClassCar build_B_ClassCar();

    CClassCar build_C_ClassCar();
}
