package builder_pattern.traditional_way;

public class CommonHouse extends AbstractHouse {
    @Override
    public void buildBasic() {
        System.out.println("普通的房子打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通的房子砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("普通的房子封顶");
    }
}
