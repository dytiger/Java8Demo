import java.util.Arrays;

/**
 * Created by Administrator on 2016/6/22.
 */
public class VariableLengthArgumentTest {
    public static void main(String[] args) {
        int result = VariableLengthArgument.add(1,2,3,4,5);
        System.out.println(result);
        result = VariableLengthArgument.add(1,2);
        System.out.println(result);

        int[] arr = VariableLengthArgument.getIntArray(10,20,30,40,50,60);
        System.out.println(Arrays.toString(arr));
    }
}
