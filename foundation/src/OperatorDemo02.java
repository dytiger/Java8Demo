/**
 * Created by Administrator on 2016/6/14.
 */
public class OperatorDemo02 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 10;
        System.out.println(a<b);// true
        System.out.println(b<=c);// true
        System.out.println(b>a);// true
        System.out.println(b>=c);// true
        System.out.println(a==b);// false
        System.out.println(a!=b);// true

        System.out.println("==============================");

        System.out.println(!(a<b));// false
        System.out.println(!(a>b));// true

        System.out.println((a>b)&(++b>c));// false&true=>false
        System.out.println(b);// 11

        b = 10;
        // 短路与：如果左操作数是false，则不对右操作数进行取值判断，直接返回false
        System.out.println((a>b)&&(++b>c));// false
        System.out.println(b);// 10
        System.out.println((a<b)&&(++b>c));// true
        System.out.println(b);// 11

        b = 10;
        System.out.println((a<b)|(++b>c));// true|true=>true
        System.out.println(b);// 11

        b = 10;
        // 短路或：如果左操作数是true，则不对右操作数进行取值判断，直接返回true
        System.out.println((a<b)||(++b>c));// true
        System.out.println(b);// 10

        // 异或：左操作数与右操作数一致返回false，反之返回true
        System.out.println(true^false);// true
        System.out.println(false^true);// true
        System.out.println(true^true);// false
        System.out.println(false^false);// false
    }
}
