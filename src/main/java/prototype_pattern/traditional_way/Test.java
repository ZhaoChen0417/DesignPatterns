package prototype_pattern.traditional_way;

/*
 * 现在有一只羊tom，年龄1岁，颜色为白色，请编写程序创建和tom羊一模一样的5只羊
 *
 * 优点：比较好理解，操作简单
 * 缺点：在创建新对象时，总需要重新获取对象的属性，如果创建的对象比较负复杂，效率很低。如果原始羊没有提供get方法怎么办？
 * */
public class Test {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom", 1, "白色");

        //复制操作
        Sheep sheep1 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep2 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep3 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep4 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep5 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
    }
}
