package org.forten.sample.coll;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/7/1.
 */
public class ListDemo02 {
    public static void main(String[] args) {
        Apple a1 = new Apple("国光", "青色", 50);
        Apple a2 = new Apple("富士", "红色", 150);
        Apple a3 = new Apple("黄香蕉", "黄色", 250);
        Apple a4 = new Apple("富士", "红色", 120);
        Apple a5 = new Apple("蛇果", "红色", 100);

        // Java 7以前一定用下一行代码来声明泛型
        // List<Apple> appleBag = new ArrayList<Apple>();
        // Java 7以后可以省略实例化类型后<>中的类型
        // <>中的类型是泛型类型
        List<Apple> appleBag = new ArrayList<>();

        appleBag.add(a1);
        appleBag.add(a2);
        appleBag.add(a3);
        appleBag.add(a4);

        // 因为使用了泛型进行声明容器对象，所以不可以把不安全类型对象放到容器中
        // 以下代码不能通过编译
        // appleBag.add(new Bomb("TNT",50));

        for (Apple apple : appleBag) {
            apple.setWeigth(apple.getWeigth()*5);
            System.out.println(apple);
        }
    }
}
