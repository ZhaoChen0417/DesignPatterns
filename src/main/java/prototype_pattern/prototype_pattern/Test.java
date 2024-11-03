package prototype_pattern.prototype_pattern;

public class Test {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom", 1, "白色");
        Sheep cloneSheep = (Sheep) sheep.clone();
        System.out.println(sheep.toString());
        System.out.println(cloneSheep.toString());
        System.out.println("sleep ?= cloneSheep：" + cloneSheep == cloneSheep.getColor());
    }
}
