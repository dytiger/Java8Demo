package org.forten.sample.coll;

/**
 * Created by Administrator on 2016/7/1.
 */
public class Bomb {
    private String name;
    private int weight;

    public Bomb(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bomb bomb = (Bomb) o;

        if (weight != bomb.weight) return false;
        return name != null ? name.equals(bomb.name) : bomb.name == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + weight;
        return result;
    }

    @Override
    public String toString() {
        return "Bomb{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
