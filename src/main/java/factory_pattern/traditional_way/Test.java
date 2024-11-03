package factory_pattern.traditional_way;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入你要判断的类型：");
        String brand = scanner.next();
        Car car = null;
        switch (brand) {
            case "BMW":
                car = new BMW();
                break;
            case "Benz":
                car = new Benz( );
                break;
            case "Audi":
                car = new Audi();
                break;
            default:
                System.out.println("没有该类型车辆");
                break;
        }
        car.showBrand();
    }
}
