package org.forten.sample.shape;

/**
 * Created by Administrator on 2016/6/28.
 */
public class Circle extends Shape{
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public String getName() {
        return "圆形";
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(r,2);
    }
}
