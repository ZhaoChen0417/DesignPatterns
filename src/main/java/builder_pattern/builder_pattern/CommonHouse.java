package builder_pattern.builder_pattern;

public class CommonHouse extends HouseBuilder{
    @Override
    public void buildBasic() {
        System.out.println("普通的房子打地基5米");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通的房子砌墙10cm");
    }

    @Override
    public void roofed() {
        System.out.println("普通的房子屋顶");
    }
}
