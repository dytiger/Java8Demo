/**
 * Created by Administrator on 2016/6/20.
 */
public class DriverTest {
    public static void main(String[] args) {
        Car c1 = new Car("QQ",10,80);
        Car c2 = new Car("奔驰",100,180);
        Car c3 = new Car("法拉利",300,220);
        Driver d1 = new Driver("赵云",c1);
        Driver d2 = new Driver("吕布",c2);
        d1.start();
        d1.drive();
        d1.crash();
        d2.start();
        d2.drive();
        d2.crash();

        d1.setCar(c3);
        d1.start();
        d1.drive();
        d1.crash();

        d2.setCar(c1);
        d2.start();
        d2.drive();
        d2.crash();
    }
}
