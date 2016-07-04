package org.forten.sample.coll;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Administrator on 2016/7/4.
 */
public class MapDemo01 {
    public static void main(String[] args) {
        Apple a1 = new Apple("国光", "青色", 50);
        Apple a2 = new Apple("富士", "红色", 150);
        Apple a3 = new Apple("黄香蕉", "黄色", 250);
        Apple a4 = new Apple("富士", "红色", 120);
        Apple a5 = new Apple("蛇果", "红色", 100);

        Map<String,Apple> appleBox = new HashMap<>();
        appleBox.put("一",a1);
        appleBox.putIfAbsent("二",a2);
        appleBox.putIfAbsent("二",a3);
        appleBox.put("三",a3);
        System.out.println(appleBox);

        appleBox.replace("一",a5);
        System.out.println(appleBox);

        Apple a6 = appleBox.get("一");
        Apple a7 = appleBox.getOrDefault("八",a4);
        System.out.println(a6);
        System.out.println(a7);

        Set<String> keySet = appleBox.keySet();
        System.out.println(keySet);
        for(String key : keySet){
            System.out.println(appleBox.get(key));
        }

        System.out.println("==========================");
        Set<Map.Entry<String,Apple>> entrySet = appleBox.entrySet();
        for(Map.Entry<String,Apple> entry: entrySet){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}
