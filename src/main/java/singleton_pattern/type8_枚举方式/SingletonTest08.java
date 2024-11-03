package singleton_pattern.type8_枚举方式;

public class SingletonTest08 {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance1 == instance2);

        instance1.sayOK();
    }
}

// 枚举方式（强推）
enum Singleton {
    INSTANCE;

    public void sayOK() {
        System.out.println("OK");
    }
}


