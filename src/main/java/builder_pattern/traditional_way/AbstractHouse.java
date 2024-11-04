package builder_pattern.traditional_way;

public abstract class AbstractHouse {
    //打地基
    public abstract void buildBasic();

    //砌墙
    public abstract void buildWalls();

    //封顶
    public abstract void roofed();

    //构建
    public void build() {
        buildBasic();
        buildWalls();
        roofed();
    }
}
