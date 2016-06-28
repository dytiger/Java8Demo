package org.forten.sample.employee;

/**
 * Created by Administrator on 2016/6/28.
 */
public class Coder extends Employee {
    private int extraDay;

    public Coder() {
        super();
    }

    public Coder(String name, int salary, int extraDay) {
        super(name, salary);
        this.extraDay = extraDay;
    }

    public int getExtraDay() {
        return extraDay;
    }

    public void setExtraDay(int extraDay) {
        this.extraDay = extraDay;
    }

    @Override
    public void work() {
        System.out.println(name + "在写程序。");
    }

    @Override
    public int getFinalSalary() {
        return salary + extraDay * 8 * 8;
    }

    @Override
    public String toString() {
        return "Coder{" +
                "extraDay=" + extraDay +
                '}';
    }
}
