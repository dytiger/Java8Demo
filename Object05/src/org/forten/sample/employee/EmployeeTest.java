package org.forten.sample.employee;

/**
 * Created by Administrator on 2016/6/28.
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Manager m1 = new Manager();
        m1.setName("Tom");
        m1.setSalary(5000);
        m1.setBonus(100000);

        Coder c1 = new Coder();
        c1.setName("Mike");
        c1.setSalary(8000);
        c1.setExtraDay(8);

        m1.work();
        c1.work();
        System.out.println(m1.getFinalSalary());
        System.out.println(c1.getFinalSalary());

//        Employee m2 = new Manager();
//        m2.setName("Tom");
//        m2.setSalary(5000);
        // 因为setBonus方法不是在Employee类中声明的，所以在使用Employee声明对象引用时，不会找到此方法
//        m2.setBonus(100000);

        // 使用父类声明引用变量，使用子类类型来实例化对象的方式是推荐的对象声明方式
        // 即面向接口编程（面向抽象编程）
        Employee e1 = new Manager("Mary",4000,50000);
        e1.work();
        System.out.println(e1.getFinalSalary());

        e1 = c1;
        e1.work();
    }
}
