package org.forten.sample;

/**
 * Created by Administrator on 2016/7/1.
 */
public class Demo01 {
    public static void main(String[] args) {
        System.out.println(Movable.desc);
        // 以下语句不会通过编译，因为接口中的变量都是final的
        // Movable.desc="";
        Movable m1 = new Person("Tom",20);
        Movable m2 = new Car("QQ",80);
        MoveAndFlyable m3 = new Plane("F22");
        m1.run();
        m2.run();
        m3.run();
        m3.fly();

        // 虽然m3引用的是一个Plane类型的实例对象
        // 但是声明时使用的是Movable接口类型，
        // 所以不可以访问到Movable接口之外的其它方法
        // m3.fly();

        // 从子类或实现类向抽象类或接口进行的类型转换叫向上转型，是安全的
        // 从抽象类或接口类型向子类型或实现类型进行的类型转换叫向下转型，是不安全的，要使用强制类型转换，
        // 如果更上层的类型与下层类型不匹配，则抛出转型异常(java.lang.ClassCastException)
        Plane plane = (Plane)m3;
        plane.fly();

        // 类型转换异常
        // Plane errPlane = (Plane)m1;
        // errPlane.fly();
    }
}
