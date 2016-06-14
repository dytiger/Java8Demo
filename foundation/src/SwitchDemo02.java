/**
 * Created by Administrator on 2016/6/14.
 */
public class SwitchDemo02 {
    public static void main(String[] args) {
        int month = 6;
        // switch只可以做相等判断
        // 所判断的值只能是byte，short，int，char或其包装类的对象，Java5以后可以使用枚举类型，Java7以后可以使用String类型
        // switch相比完成同样功能的if-else if-else块，性能更好
        switch (month) {
            case 11:
            case 12:
            case 1:
                System.out.println("冬天");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("春天");
                break;
            case 5:
            case 6:
            case 7:
                System.out.println("夏天");
                break;
            case 8:
            case 9:
            case 10:
                System.out.println("秋天");
                break;
            default:
                System.out.println("请输入1到12之间的数字");
        }
    }
}
