/**
 * Created by Administrator on 2016/6/21.
 */
public class StringTest03 {
    public static void main(String[] args) {
        String str1 = "%s对%s造成了%d点伤害%n";
        System.out.printf(str1,"张辽","吕布",1000);
        // 静态方法是最推荐使用的方式
        String str2 = String.format(str1,"张飞","刘备",20000);
    }

}
