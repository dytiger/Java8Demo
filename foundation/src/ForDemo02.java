/**
 * Created by Administrator on 2016/6/14.
 */
public class ForDemo02 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        for(int i = 0;i<=arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("===========================");
        for(int value : arr){
            System.out.println(value);
        }
    }
}
