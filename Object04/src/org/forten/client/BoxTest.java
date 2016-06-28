package org.forten.client;

// 不同包下类的引入使用import关键字
import org.forten.sample.Box;

/**
 * Created by Administrator on 2016/6/28.
 */
public class BoxTest {
    public static void main(String[] args) {
        Box b1 = new Box(2,3,5);
        // String属性于java.lang包
        // java.lang包下的所有类和同包下的所有类，不用显式的使用import引入
        String s1 = new String("abc");
    }
}
