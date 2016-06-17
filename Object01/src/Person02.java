/**
 * Created by Administrator on 2016/6/17.
 */
public class Person02 {
    // 把所有实例变量设置为私有的
    // 只可以在本类中访问它们，对于外部的代码，这些变量是不可见的
    private String name;
    private int age;
    private String gender;

    // 公开实例变量对应的读取器和设置器方法
    // 这样做的优点是：1.可以在方法中加入对变量值的增强处理，如格式校验，输出的排版等
    //                  2.可以控制某个实例变量的读写粒度，如只开放get方法，则对应的实例变量就为只读了
    // name属性的读取器
    public String getName(){
        // this表示调用此方法的那个对象引用
        // 比如在客户代码中有p1.getName()，这个this就是p1
        return this.name;
    }

    // name属性的设置器
    public void setName(String name){
        int length = name.length();
        if(length>16||length<2){
            System.out.println("姓名长度应该在2到15个字符之间");
        }else {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void setAge(int age) {
        if(age>100||age<1){
            System.out.println("年龄应该在1到100之间");
        }else {
            this.age = age;
        }
    }

    public void setGender(String gender) {
        if(!gender.equals("男")&&!gender.equals("女")){
            System.out.println("性别只能取男或女");
        }else {
            this.gender = gender;
        }
    }

    // 所有没有显示声明其父类的类，它们的父类就是Object类
    // Object类中有一个toString()方法，用途是输出某个对象的字符串表示形式
    // 在子类中通常要重写这个方法，来实现具体的输出逻辑
    @Override
    public String toString() {
        return "Person02{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
