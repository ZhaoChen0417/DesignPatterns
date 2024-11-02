package com.principles.single_responsibility;

public class SingleResponsibility2 {
    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("汽车");
        roadVehicle.run("摩托车");
        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");
    }
}

// 方案二的分析
// 1. 遵守单一职责原则
// 2. 但是这样做的改动很大，即将类分解，同时修改客户端
// 3. 改进：直接修改Vehicle类，这样改动的代码比较少
class RoadVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "：在公路上运行....");
    }
}

class AirVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "：在天空上运行");
    }
}

class WaterVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "：在水中运行");
    }
}
