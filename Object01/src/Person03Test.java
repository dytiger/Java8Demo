/**
 * Created by Administrator on 2016/6/17.
 */
public class Person03Test {
    public static void main(String[] args) {
        Person03 p1 = new Person03();
        System.out.println(p1.toString());

        Person03 p2 = new Person03("张婧");
        System.out.println(p2);

        Person03 p3 = new Person03("张辽",42,"男");
        System.out.println(p3);

        // 因为构造方法只能伴随着new操作符来调用，所以以下语句不能通过编译
        // p3.Person03("Tom");
        // 以下语句是合法的，作用是把p3指向一个新的对象，与老对象之间的引用关系断开，老对象等待被垃圾回收
        p3 = new Person03("Tom");
    }
}
