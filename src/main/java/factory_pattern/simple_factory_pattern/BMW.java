package factory_pattern.simple_factory_pattern;

public class BMW implements Car {
    @Override
    public void showBrand() {
        System.out.println("这是一辆【宝马】汽车");
    }
}