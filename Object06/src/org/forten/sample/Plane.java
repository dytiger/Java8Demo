package org.forten.sample;

/**
 * Created by Administrator on 2016/7/1.
 */
public class Plane implements MoveAndFlyable{
    private String name;

    public Plane(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void fly() {
        System.out.println(name+"在天上巡航");
    }

    @Override
    public void run() {
        System.out.println(name+"在跑道上滑行");
    }

    @Override
    public String toString() {
        return "Plane{" +
                "name='" + name + '\'' +
                '}';
    }
}
