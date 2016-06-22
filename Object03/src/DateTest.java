import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Administrator on 2016/6/22.
 */
public class DateTest {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());

        Date d1 = new Date();// 得到表示当前时间的日期对象
        System.out.println(d1);
        Date d2 = new Date(0);
        System.out.println(d2);
        Date d3 = new Date(24*60*60*1000);
        System.out.println(d3);

        d3.setTime(d3.getTime()+72*60*60*1000);
        System.out.println(d3);

        Calendar c1 = Calendar.getInstance();
        // 月份是0~11来表示1到12月
        c1.set(2010,5,25,13,30,18);
        System.out.println(c1);
        Date d4 = c1.getTime();
        System.out.println(d4);

        // 格式化日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String d4Str = sdf.format(d4);
        System.out.println(d4Str);
        sdf.applyPattern("yy年MM月dd日");
        d4Str = sdf.format(d4);
        System.out.println(d4Str);

        // 日期的计算
        c1.setTime(d4);
        c1.add(Calendar.DAY_OF_MONTH,10);
        d4 = c1.getTime();
        sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        d4Str = sdf.format(d4);
        System.out.println(d4Str);

        c1.add(Calendar.MONTH,2);
        d4 = c1.getTime();
        d4Str = sdf.format(d4);
        System.out.println(d4Str);

        c1.add(Calendar.MONTH,-4);
        d4 = c1.getTime();
        d4Str = sdf.format(d4);
        System.out.println(d4Str);
    }
}
