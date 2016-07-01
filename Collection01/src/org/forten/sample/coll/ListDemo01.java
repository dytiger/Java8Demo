package org.forten.sample.coll;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Administrator on 2016/7/1.
 */
public class ListDemo01 {
    public static void main(String[] args) {
        Apple a1 = new Apple("国光","青色",50);
        Apple a2 = new Apple("富士","红色",150);
        Apple a3 = new Apple("黄香蕉","黄色",250);
        Apple a4 = new Apple("富士","红色",120);
        Apple a5 = new Apple("蛇果","红色",100);

        // 实例化一个ArrayList的容器实例，如果构造器中没有参数，会使用默认值开辟容器的容量
        List appleBag = new ArrayList(5);
        // 向容器中追加元素
        appleBag.add(a1);
        appleBag.add(a2);
        appleBag.add(a3);
        appleBag.add(a4);

        // 打印当前容器中的容量
        System.out.println(appleBag.size());

        // 向容器中的第二个元素位置插入一个对象
        appleBag.add(1,a5);
        System.out.println(appleBag);

        // 移除容器中的第三个元素
        appleBag.remove(2);
        System.out.println(appleBag);

        // 因为List中的元素是可重复的，所以可以添加多个相等对象
        appleBag.add(a4);
        appleBag.add(a4);
        appleBag.add(a4);
        appleBag.add(a4);
        System.out.println(appleBag);

        // 移除第一个a4元素
        appleBag.remove(a4);
        System.out.println(appleBag);

        // 获得容器中的第二个元素
        Object obj = appleBag.get(1);
        Apple a6 = (Apple)obj;
        System.out.println(a6);

        // 替换第二个元素为第一个元素对象
        appleBag.set(1,appleBag.get(0));
        System.out.println(appleBag);

        // 把容器转换成为数组
        Object[] appleArr = appleBag.toArray();
        System.out.println(Arrays.toString(appleArr));

        System.out.println("============================================");

        // 类似于遍历数组的方法来遍历List
        for(int i = 0;i<appleBag.size();i++){
            System.out.println(appleBag.get(i));
        }

        System.out.println("============================================");

        // Java 5以前比较通用的遍历写法
        // 使用了Java提供的迭代器对象，可以应用于所有容器对象
        Iterator it = appleBag.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("============================================");

        // 增强for循环进行遍历
        for(Object o : appleBag){
            Apple a = (Apple)o;
            a.setWeigth(a.getWeigth()*10);
            System.out.println(a);
        }

        System.out.println("============================================");

        // Java 5之前的容器元素都是使用Object类型，所以存在类型的安全问题，
        // 程序代码量也会较多，可以使用Java 5以后的泛型技术来解决
        appleBag.add(new Bomb("TNT",5000));
        for(Object o : appleBag){
            System.out.println(o);
        }
    }
}
