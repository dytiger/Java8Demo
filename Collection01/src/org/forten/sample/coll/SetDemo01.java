package org.forten.sample.coll;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Administrator on 2016/7/4.
 */
public class SetDemo01 {
    public static void main(String[] args) {
        Apple a1 = new Apple("国光", "青色", 50);
        Apple a2 = new Apple("富士", "红色", 150);
        Apple a3 = new Apple("黄香蕉", "黄色", 250);
        Apple a4 = new Apple("富士", "红色", 120);
        Apple a5 = new Apple("蛇果", "红色", 100);

        Set<Apple> appleSet = new HashSet<>(5);

        // Set是无序的
        appleSet.add(a1);
        appleSet.add(a2);
        appleSet.add(a3);
        appleSet.add(a4);
        appleSet.add(a5);
        System.out.println(appleSet);

        // Set中的元素不可重复
        // 向Set中添加元素时，如果进行排重
        // 1.先调用被添加元素对象的hashCode()方法，得到一个int值，然后与Set中第一个元素的hashCode()值进行对比，如果没有一个是一样的，直接添加这个元素到Set中
        // 2.如果发现被添加元素对象的hashCode与某个已存在于Set中的元素的hashCode一致，则调用它们的equals()方法，如果返回true则不添加新元素，如果返回false，则添加
        appleSet.add(a5);
        appleSet.add(a5);
        appleSet.add(a5);
        appleSet.add(a5);
        System.out.println(appleSet);

        appleSet.remove(a1);
        System.out.println(appleSet);

        System.out.println(appleSet.size());

        // 遍历Set比遍历List少一种方式
        // Set没有按索引遍历，因为其是无序的
        Iterator it = appleSet.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        for(Apple a : appleSet){
            System.out.println(a);
        }
    }
}
