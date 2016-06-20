/**
 * Created by Administrator on 2016/6/20.
 */
public class Box {
    private int x;
    private int y;
    private int z;

    public Box() {
        this.x = 5;
        this.z = 5;
        this.y = 5;
    }

    public Box(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Box box = (Box) o;

        if (x != box.x) return false;
        if (y != box.y) return false;
        return z == box.z;

    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        result = 31 * result + z;
        return result;
    }

    @Override
    public String toString() {
        return "Box{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
