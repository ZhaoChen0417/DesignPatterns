package decorator_pattern;

public class Coffeebar {
    public static void main(String[] args) {
        //1.点一份LongBlack
        Drink order = new LongBlack();
        System.out.println("费用1 = " + order.cost());
        System.out.println("描述：" + order.getDes());

        //2.加入一份牛奶
        order = new Milk(order);
        System.out.println("费用2 = " + order.cost());
        System.out.println("描述：" + order.getDes());

        //3.加入2份巧克力
        order = new Chocolate(order);
        System.out.println("费用3 = " + order.cost());
        System.out.println("描述：" + order.getDes());

        order = new Chocolate(order);
        System.out.println("费用4 = " + order.cost());
        System.out.println("描述：" + order.getDes());
    }
}
