import java.math.BigInteger;

/**
 * Created by Administrator on 2016/6/22.
 */
public class IntegerTest {
    public static void main(String[] args) {
        byte b1 = 10;
        Byte b2 = new Byte((byte)20);
        Byte b3 = new Byte("30");
        // 在Java5以后，支持以下语法
        // 自动装箱
        Byte b4 = 40;
        // 自动拆箱
        byte b5 = new Byte("50");

        // 以下是Java5以前的写法，现在不使用此方式
        byte b6 = Byte.valueOf(b4);

        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);

        byte b7 = Byte.parseByte("123");
        System.out.println(b7);
        b7 = Byte.parseByte("f",16);
        System.out.println(b7);
        b7 = Byte.parseByte("1010",2);
        System.out.println(b7);
        // 以下语句出现java.lang.NumberFormatException
        // b7 = Byte.parseByte("xyz");

//        long bigNum = 9999999999999999999999999999999999999999999999999;
        BigInteger bi1 = new BigInteger("9999999999999999999999999999999999999999999999999");
        BigInteger bi2 = new BigInteger("5");
        System.out.println(bi1.add(bi2).multiply(bi2));
    }
}
