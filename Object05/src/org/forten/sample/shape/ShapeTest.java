package org.forten.sample.shape;

/**
 * Created by Administrator on 2016/6/28.
 */
public class ShapeTest {
    public static void main(String[] args) {
        Shape s1 = new Rectagle(5,10);
        s1.printInfo();
        Shape s2 = new Circle(10.0);
        s2.printInfo();

        // 抽象类不能被直接实例化
        // Shape s3 = new Shape();
    }

}
