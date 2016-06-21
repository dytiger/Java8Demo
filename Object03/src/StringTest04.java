/**
 * Created by Administrator on 2016/6/21.
 */
public class StringTest04 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("56");
        sb.append("789");
        sb.insert(0,"12");
        System.out.println(sb.toString());
        sb.insert(2,"34");
        System.out.println(sb.toString());
        sb.delete(4,6);
        System.out.println(sb.toString());

        // StringBuilder和StringBuffer都是用于优化大量字符串拼接工作的
        // StringBuilder和StringBuffer所提供的方法完全一致
        // StringBuilder是Java 5以后才引入的，是线程不安全的，但性能高，推荐使用
        // StringBuffer是Java 5以前就有的，是线程安全的，但性能差
    }
}
