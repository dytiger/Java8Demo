/**
 * Created by Administrator on 2016/6/22.
 */
public class VariableLengthArgument {
//    public int add(int x,int y){
//        return x + y;
//    }
//    public int add(int x,int y,int z){
//        return x + y + z;
//    }

    // 可变长参数
    // 可变长参数是被Java以数组解释的
    // 可变长参数的值可以有零到多个，零被解释成为一个不包含任何元素的空数组
    // 可变长参数只能出现在方法参数列表的最后一个位置
    public static int add(int x, int y, int... values){
        int sum = x+y;
        for (int value : values) {
            sum = sum + value;
        }
        return sum;
    }

    public static int[] getIntArray(int... values){
        return values;
    }
}
