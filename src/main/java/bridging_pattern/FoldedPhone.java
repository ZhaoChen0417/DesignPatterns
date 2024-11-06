package bridging_pattern;

//折叠式手机，继承抽象类Phone
public class FoldedPhone extends Phone {

    //构造器
    public FoldedPhone(Brand brand) {
        super(brand);
    }

    @Override
    protected void open() {
        System.out.print("折叠样式手机：");
        super.open();
    }

    @Override
    protected void close() {
        System.out.print("折叠样式手机：");
        super.close();
    }

    @Override
    protected void call() {
        System.out.print("折叠样式手机：");
        super.call();
    }
}
