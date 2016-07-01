package org.forten.sample.coll;

/**
 * Created by Administrator on 2016/7/1.
 */
public class Apple {
    private String name;
    private String color;
    private int weigth;

    public Apple(String name, String color, int weigth) {
        this.name = name;
        this.color = color;
        this.weigth = weigth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeigth() {
        return weigth;
    }

    public void setWeigth(int weigth) {
        this.weigth = weigth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Apple apple = (Apple) o;

        if (weigth != apple.weigth) return false;
        if (name != null ? !name.equals(apple.name) : apple.name != null) return false;
        return color != null ? color.equals(apple.color) : apple.color == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + weigth;
        return result;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", weigth=" + weigth +
                '}';
    }
}
