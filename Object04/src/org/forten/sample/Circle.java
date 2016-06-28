package org.forten.sample;

// Java5以后，可以使用import static语法进行静态变量和静态方法的引入
// 通常在大量使用静态变量和静态方法时才使用静态引入语法
// 在程序如果使用较少的静态成员，则还是推荐使用“类名.静态成员”的语法，以提高可读性
import static java.lang.Math.PI;
import static java.lang.Math.pow;

/**
 * Created by Administrator on 2016/6/28.
 */
public class Circle {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getArea() {
        return pow(r,2) * PI;
    }
}
