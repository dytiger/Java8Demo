/**
 * Created by Administrator on 2016/7/5.
 */
public class Clothes2 {
    private int price;
    private String color;
    private Size size;

    public Clothes2(int price, String color, Size size) {
        this.price = price;
        this.color = color;
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Clothes2{" +
                "price=" + price +
                ", color='" + color + '\'' +
                ", size=" + size.getDesc() +
                '}';
    }
}
