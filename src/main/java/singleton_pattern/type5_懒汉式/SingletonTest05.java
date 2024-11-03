package singleton_pattern.type5_懒汉式;

public class SingletonTest05 {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
    }
}

// 懒汉式（线程安全, 同步代码块：没啥用有人这样写）
class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    //提供一个静态公有方法，当使用该方法时，才会去创建instance
    //加入了同步代码块，没啥用(想法是好的，但是连安全问题都解决不了)
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                instance = new Singleton();
            }
        }
        return instance;
    }
}


