package org.forten.sample.shape;

/**
 * Created by Administrator on 2016/6/28.
 */
// 抽象类中可以没有抽象方法
// 但有抽象方法的类一定要被声明为抽象类
public abstract class Shape {
    // 抽象方法没有方法体
    public abstract String getName();

    public abstract double getArea();

    // 模板方法模式
    // 把稳定的逻辑组织在父类中的一个具体方法中
    // 把不稳定的逻辑（不同的）搬移到各个子类中实现
    // 在模板方法中调用这些抽象方法
    // 此模式是对“开-闭原则”的实现，即对扩展开放，对修改关闭
    public void printInfo(){
        System.out.println(getName()+"的面积是"+getArea());
    }
}
