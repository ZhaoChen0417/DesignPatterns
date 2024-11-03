package singleton_pattern.type3_懒汉式;

public class SingletonTest03 {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
    }
}

// 懒汉式（线程不安全）
class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    //提供一个静态公有方法，当使用该方法时，才会去创建instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}


