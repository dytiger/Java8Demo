/**
 * Created by Administrator on 2016/6/14.
 */
public class OperatorDemo03 {
    public static void main(String[] args) {
        int a = 10;// 00000000000000000000000000001010 => 10的原码
        //            11111111111111111111111111110101 => 10的反码
        //            11111111111111111111111111110110 => -10的表示形式
        //            00000000000000000000000000001001 => -10的反码
        //            00000000000000000000000000001010 => 10

        int b = 47;// 00000000000000000000000000101111
        //            11111111111111111111111111010000
        //            11111111111111111111111111010001 =>-47

        System.out.println(~a);
        System.out.println(~b);
        System.out.println(~~b);

        // 00000000000000000000000000001010
        // 00000000000000000000000000101111
        // 00000000000000000000000000001010
        System.out.println(a & b);

        // 00000000000000000000000000001010
        // 00000000000000000000000000101111
        // 00000000000000000000000000101111
        System.out.println(a | b);

        // 00000000000000000000000000001010
        // 00000000000000000000000000101111
        // 00000000000000000000000000100101
        System.out.println(a ^ b);

        // 应用异或可以交换两个变量的值
        a = a ^ b;
        b = b ^ a;
        a = a ^ b;
        System.out.println(a);
        System.out.println(b);

        a = 10; // 00000000000000000000000000001010 = 00000000000000000000000000101000
        // 左位移即对原始值乘以2的位移次方
        System.out.println(a << 2);

        a = 64;
        // 右位移即对原始值除以2的位移次方
        System.out.println(a >> 2);// 16
        a = -64;
        System.out.println(a >> 2);// 16

        a = 64;
        System.out.println(a >>> 2); // 16
        a = -64;
        System.out.println(a >>> 2); // 1073741808

        int i = (a > b) ? a : b;
    }
}