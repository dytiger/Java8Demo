package org.forten.sample;

/**
 * Created by Administrator on 2016/7/1.
 */
public class Car implements Movable{
    private String name;
    private int speed;

    public Car() {
    }

    public Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public void run() {
        System.out.println(name+"以"+speed+"km/h的速度行驶");
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                '}';
    }

}
