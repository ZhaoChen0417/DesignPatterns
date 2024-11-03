package factory_pattern.simple_factory_pattern;

public class SimpleFactory {
    // 工厂方法获取对应汽车
    public static Car GetCar(String brandName) {
        switch (brandName) {
            case "BMW":
                return new BMW();
            case "Benz":
                return new Benz();
            case "Audi":
                return new Audi();
            default:
                return null;
        }
    }
}
