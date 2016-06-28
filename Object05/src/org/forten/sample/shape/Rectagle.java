package org.forten.sample.shape;

/**
 * Created by Administrator on 2016/6/28.
 */
public class Rectagle extends Shape {
    private double x;
    private double y;

    public Rectagle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String getName() {
        return "矩形";
    }

    @Override
    public double getArea() {
        return x * y;
    }
}
