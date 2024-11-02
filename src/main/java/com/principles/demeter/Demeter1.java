/*
package com.principles.demeter;

import java.util.ArrayList;
import java.util.List;

//客户端
public class Demeter1 {
    public static void main(String[] args) {
        //创建一个SchoolManager对象
        SchoolManager schoolManager = new SchoolManager();
        //输出学院和学校总部的员工信息
        schoolManager.printAllEmployee(new CollegeManager());
    }
}

//学校总部员工
class Employee {
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}

//学院员工
class CollegeEmployee {
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}

//管理学院员工的类
class CollegeManager {
    //返回学院的所有员工
    public List<CollegeEmployee> getAllEmployee() {
        ArrayList<CollegeEmployee> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            CollegeEmployee emp = new CollegeEmployee();
            emp.setId("学院员工id= " + i);
            list.add(emp);
        }
        return list;
    }
}

//学校管理类

//分析 SchoolManager 类的直接朋友类 Employee、CollegeManager
//CollegeEmployee 不是直接朋友，他是以局部变量方式出现在SchoolManager中，这样就违背了迪米特法则。
class SchoolManager {
    //返回学校总部的员工
    public List<Employee> getAllEmployee() {
        List<Employee> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Employee emp = new Employee();
            emp.setId("学校总部员工id= " + i);
            list.add(emp);
        }
        return list;
    }

    //输出学校总部和学院员工信息的方法
    void printAllEmployee(CollegeManager sub) {
        //获取学院员工
        List<CollegeEmployee> list1 = sub.getAllEmployee();
        System.out.println("----------学院员工----------");
        for (CollegeEmployee e : list1) {
            System.out.println(e.getId());
        }
        //获取学校总部员工
        List<Employee> list2 = this.getAllEmployee();
        System.out.println("----------学校总部员工----------");
        for (Employee e : list2) {
            System.out.println(e.getId());
        }
    }
}
*/
