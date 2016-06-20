/**
 * Created by Administrator on 2016/6/20.
 */
public class BoxTest {
    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = new Box();
        // 因为==判断的是栈空间中两块变量区域的值是否相等
        // 所以以下语句返回false
        // 简单来说，把==操作符应用于两个引用类型的变量，比较的是它们是否引用了同一个堆中的对象
        System.out.println(b1 == b2);
        System.out.println(b1.equals(b2));

        Box b3 = b2;
        System.out.println(b1 == b3);
        System.out.println(b2 == b3);
        System.out.println(b1.equals(b2));
        System.out.println(b2.equals(b3));

    }
}
