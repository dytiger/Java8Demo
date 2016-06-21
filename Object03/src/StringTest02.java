/**
 * Created by Administrator on 2016/6/21.
 */
public class StringTest02 {
    public static void main(String[] args) {
        // Java会先在一个叫字符串池的内存区域中查找"Hello "
        // 如果找到，str1指向其内存地址
        // 如果未找到，会实例化一个字符串对象："Hello "，并把它放入字符串池中
        String str1 = "Hello ";
        String str2 = "World!";
        // 得到str1和str2引用的字符串，进行拼接，生成一个新的对象
        String str3 = str1 + str2;

        // 因为String是不可变对象，所以进行多个字符串拼接时会产生大量中间对象
        // 在大量进行字符串拼接时应该使用StringBuilder或StringBuffer来避免此问题
        String str4 = "abc"+" "+"xyz";

        // 直接使用字符串字面量来赋值，会先在串池中查找这个字符串，
        // 如果没有，会把这个对象会被放到串池中
        // 如果有，则直接使用
        String str5 = "123";
        String str6 = "123";

        // 使用String类的各种构造方法来实例化的对象，是被放置在普通的堆空间中的
        String str7 = new String("123");
        String str8 = new String("123");
        System.out.println(str5==str6);// true
        System.out.println(str7==str8);// false

        // 通过intern()可以把str7的值放到字符串池中，把其在串池中的地址返回给str9
        String str9 = str7.intern();
        System.out.println(str6==str9);// true
    }
}
