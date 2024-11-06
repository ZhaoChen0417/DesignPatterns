package decorator_pattern;

public abstract class Drink {
    public String des; //描述
    private float price = 0.0f; //价格

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    //计算价格的抽象方法
    public abstract float cost();
}
