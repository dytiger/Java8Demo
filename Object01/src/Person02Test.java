/**
 * Created by Administrator on 2016/6/17.
 */
public class Person02Test {
    public static void main(String[] args) {
        Person02 p1 = new Person02();
        // 因为name实例变量是private的，所以对于Person02以外的类，它不可见
        // 以下代码不会通过编译
        // p1.name = "Tom";
        p1.setName("张");
        System.out.println(p1.getName());
        p1.setAge(3000);
        System.out.println(p1.getAge());
        p1.setGender("公");
        System.out.println(p1.getGender());

        p1.setName("张飞");
        p1.setAge(40);
        p1.setGender("男");
        // 调用p1的toString()方法，如果Person02类中没有覆盖这个方法，则会调用Object类中的这个方法逻辑
        System.out.println(p1);
    }
}
