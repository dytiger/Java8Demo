import java.util.Arrays;

/**
 * Created by Administrator on 2016/6/21.
 */
public class StringTest01 {
    public static void main(String[] args) {
        String str1 = "a1, b3, ccc, da, e3";
        String[] strArr1 = str1.split(",");
        System.out.println(Arrays.toString(strArr1));

        String str2 = "This is an apple.";
        // 从参数位置截取到字符串最后
        System.out.println(str2.substring(5));
        // 从第一个参数位置截取到第二个参数位置之前
        System.out.println(str2.substring(5,7));


    }
}
