import java.util.Arrays;

/**
 * Created by Administrator on 2016/7/5.
 */
public class SizeDemo {
    public static void main(String[] args) {
        Size[] sizes = Size.values();
        System.out.println(Arrays.toString(sizes));
        Size xl = Size.valueOf("XL");
        System.out.println(xl);

        System.out.println(xl.name());
        System.out.println(xl.ordinal());
    }
}
