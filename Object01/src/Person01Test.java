/**
 * Created by Administrator on 2016/6/16.
 */
public class Person01Test {
    public static void main(String[] args) {
        Person01 p1;// 声明，null
        p1 = new Person01();// 实例化并赋值
        System.out.println(p1.name+":"+p1.age+":"+p1.gender);
        p1.name="Tom";
        p1.age = 20;
        p1.gender = "男";
        System.out.println(p1.name+":"+p1.age+":"+p1.gender);

        Person01 p2;
        p2 = p1;
        System.out.println(p2.name+":"+p2.age+":"+p2.gender);

        p2.name="Mike";
        System.out.println(p1.name+":"+p1.age+":"+p1.gender);
        System.out.println(p2.name+":"+p2.age+":"+p2.gender);

        p2 = new Person01();
        System.out.println(p1.name+":"+p1.age+":"+p1.gender);
        System.out.println(p2.name+":"+p2.age+":"+p2.gender);
        p2.name="Mary";
        p2.age = 18;
        p2.gender="女";
//        System.out.println(p2.name+":"+p2.age+":"+p2.gender);
        p1.printInfo();
        p2.printInfo();

        Person01 p3 = new Person01();
        p3.age = 100000;
        p3.name = "张辽";
        p3.gender = "不说";
        if(p3.age>100||p3.age<1){
            System.out.println("年龄应该在1到100之间");
        }
        if(p3.name.length()>16||p3.name.length()<2){
            System.out.println("姓名长度应该在2到15个字符之间");
        }
        if(!p3.gender.equals("男")&&!p3.gender.equals("女")){
            System.out.println("性别只能取男或女");
        }
    }
}
