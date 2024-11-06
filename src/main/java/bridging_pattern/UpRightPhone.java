package bridging_pattern;

public class UpRightPhone extends Phone {

    public UpRightPhone(Brand brand) {
        super(brand);
    }

    @Override
    protected void open() {
        System.out.print("直立式手机：");
        super.open();
    }

    @Override
    protected void close() {
        super.close();
        System.out.print("直立式手机：");
    }

    @Override
    protected void call() {
        System.out.print("直立式手机：");
        super.call();
    }
}
