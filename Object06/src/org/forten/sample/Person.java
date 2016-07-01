package org.forten.sample;

/**
 * Created by Administrator on 2016/7/1.
 */
// 类如果要与接口产生关系，应该使用implements关键字，它们之间的关系被称为实现关系
public class Person implements Movable{
    private String name;
    private int age;

    public Person() {

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void run() {
        System.out.println(name+"正在步行");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
