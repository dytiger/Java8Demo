/**
 * Created by Administrator on 2016/6/17.
 */
public class Person03 {
    private String name;
    private int age;
    private String gender;

    // 构造方法主要用于在实例化对象时封装数据的初始化逻辑
    // 如果一个类中没有编写任何构造方法，Java会帮助我们生成一个无参数构造方法
    // 但如果Java一旦发现类中编写了构造方法，无论它是否是无参的，都不会再自动生成无参构造方法了

    // 构造方法是一个特殊的方法
    // 它没有返回类型，因为它只返回本类型的对象
    // 构造方法的名字要与所在类的名字完全一致
    // 构造方法只能伴随着new操作符来调用
    public Person03() {
        this.name="someone";
        this.age = 18;
        this.gender = "男";
    }

    // 在一个类中可以定义多个参数列表不同（参数个数或类型不同）的构造方法
    // 这种技术叫构造方法的重载，也同样适用于一般方法
    public Person03(String name) {
        // 调用本类中的无参构造方法
        // 对其它构造方法的调用代码一定要出现在构造方法的首行
        this();
        this.name = name;
    }

    public Person03(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        // 以下语句可以省略，Java可以自动添加
        return;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person03{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
