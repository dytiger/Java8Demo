package org.forten.sample.coll;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Administrator on 2016/7/4.
 */
public class ListDemo03 {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(116);
        intList.add(6);
        intList.add(3);
        intList.add(7);
        intList.add(20);

        Collections.sort(intList);

        System.out.println(intList);

        Apple a1 = new Apple("国光", "青色", 50);
        Apple a2 = new Apple("富士", "红色", 150);
        Apple a3 = new Apple("黄香蕉", "黄色", 250);
        Apple a4 = new Apple("富士", "红色", 120);
        Apple a5 = new Apple("蛇果", "红色", 100);

        List<Apple> appleList = new ArrayList<>();
        appleList.add(a1);
        appleList.add(a2);
        appleList.add(a3);
        appleList.add(a4);
        appleList.add(a5);

        Collections.sort(appleList);

        System.out.println(appleList);

        /*Collections.sort(appleList, new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                if (o1.getWeigth() < o2.getWeigth()) {
                    return 1;
                } else if (o1.getWeigth() > o2.getWeigth()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });*/
        System.out.println(appleList);

        Collections.sort(appleList,(o1,o2)->{
            if (o1.getWeigth() < o2.getWeigth()) {
                return 1;
            } else if (o1.getWeigth() > o2.getWeigth()) {
                return -1;
            } else {
                return 0;
            }
        });
        System.out.println(appleList);
    }
}
