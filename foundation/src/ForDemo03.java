/**
 * Created by Administrator on 2016/6/16.
 */
public class ForDemo03 {
    public static void main(String[] args) {
        for(int i = 1;i<=9;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+"*"+i+"="+(i*j)+"\t");
            }
            System.out.println();
        }
    }
}
