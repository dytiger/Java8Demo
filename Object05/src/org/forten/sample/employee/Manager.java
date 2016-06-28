package org.forten.sample.employee;

/**
 * Created by Administrator on 2016/6/28.
 */
// 使用extends关键字可以让本类成为一个类的子类
// 在Java中，类是单继承结构的，也就是说一个类只能有一个直接父类
public class Manager extends Employee {
    private int bonus;

    public Manager() {
        super();
    }

    public Manager(String name, int salary, int bonus) {
        // 调用父类的某个构造方法
        super(name, salary);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public int getFinalSalary() {
        return salary+bonus;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "bonus=" + bonus +
                '}';
    }
}
