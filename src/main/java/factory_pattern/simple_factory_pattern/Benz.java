package factory_pattern.simple_factory_pattern;

public class Benz implements Car {
    @Override
    public void showBrand() {
        System.out.println("这是一辆【奔驰】汽车");
    }
}
