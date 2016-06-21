import java.util.Random;

/**
 * Created by Administrator on 2016/6/21.
 */
public class Weapon {
    private String name;
    private int minHurt;
    private int maxHurt;

    public Weapon() {
    }

    public Weapon(String name, int minHurt, int maxHurt) {
        this.name = name;
        this.minHurt = minHurt;
        this.maxHurt = maxHurt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMinHurt() {
        return minHurt;
    }

    public void setMinHurt(int minHurt) {
        this.minHurt = minHurt;
    }

    public int getMaxHurt() {
        return maxHurt;
    }

    public void setMaxHurt(int maxHurt) {
        this.maxHurt = maxHurt;
    }

    public int getFinalHurt(){
        return NumberUtil.getIntRandom(minHurt,maxHurt);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Weapon weapon = (Weapon) o;

        if (minHurt != weapon.minHurt) return false;
        if (maxHurt != weapon.maxHurt) return false;
        return name != null ? name.equals(weapon.name) : weapon.name == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + minHurt;
        result = 31 * result + maxHurt;
        return result;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "name='" + name + '\'' +
                ", minHurt=" + minHurt +
                ", maxHurt=" + maxHurt +
                '}';
    }
}
