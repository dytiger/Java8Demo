/**
 * Created by Administrator on 2016/6/16.
 */
public class ForDemo05 {
    public static void main(String[] args) {
        double[] arr = { 9, 8.3, 6.3, 8.2, 7.9, 9.8, 9.2, 9.0, 9.9, 6.9 };
        double min = arr[0];
        double max = arr[0];
        double sum = 0;
        for (double v : arr) {
            if(v<min){
                min = v;
            }
            if(v>max){
                max = v;
            }
            sum = sum +v;
        }

        sum = sum - min - max;

        System.out.println(sum/8);
    }
}
