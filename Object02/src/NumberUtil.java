import java.util.Random;

/**
 * Created by Administrator on 2016/6/21.
 */
public class NumberUtil {
    // static修饰的变量被称为静态变量，它是类级别的，
    // 即当类的字节码加载到内存中后，就生成了，这个变量可以被对象共享
    private static Random random = new Random();

    private NumberUtil() {
    }

    // static修饰的方法被称为静态方法，它是类级别的，
    // 即当类的字节码加载到内存中后，就可以调用此种方法，
    // 通常使用类名.静态方法名的形式调用：
    // NumberUtil.getIntRandom(x,y)

    // 静态成员是在类的字节码加载后就可以使用的，在先
    // 非静态成员只有在类的字节码加载后并且生成了此类的实例对象，才可以使用，在后
    // 非静态的方法使用静态成员是可以的，因为它在后
    // 静态的方法使用非静态成员是不可以的，因为它在先
    public static int getIntRandom(int min, int max) {
        return random.nextInt(max) % (max - min + 1) + min;
    }
}
