package singleton_pattern.type4_懒汉式;

public class SingletonTest04 {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
    }
}

// 懒汉式（线程安全,同步方法）
class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    //提供一个静态公有方法，当使用该方法时，才会去创建instance
    //加入了同步代码，解决线程不安全问题
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}


