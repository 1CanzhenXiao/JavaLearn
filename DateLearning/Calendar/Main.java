package Calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
    static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd : HH-mm-ss");
    public static void main(String[] args) {
        //日历类Calendar为单例模式，无法实例化对象
        Calendar c = Calendar.getInstance();

        //set为当前对象设立起始时间，共有两种设置方法，一种是set date对象，，一种是set 时间字段
        c.set(1970,2,24);
        System.out.println(c.getTime());

        //add为当前set的基准时间增加或减少某个时间，
        c.add(Calendar.YEAR,10000);
        System.out.println(c.getTime());

        //从日历类中提取当前时间并将其变为日期对象
        Date now = new Date();
        System.out.println(now);
        System.out.println(sdf.format(now));
        System.out.println(c.getTime());

        //去年的现在
        c.setTime(now);
        c.add(Calendar.YEAR,-1);
        System.out.println(c.getTime());

        //上个月的第三天
        c.setTime(now);
        c.add(Calendar.MONTH,-1);
        c.set(Calendar.DATE,3);
        System.out.println(c.getTime());

        //1970年1月1日后的100天
        c.setTime(new Date(0));
        c.add(Calendar.DATE,100);
        System.out.println(c.getTime());

        //1970年1月1日两个月再过10000天
        c.setTime(new Date(0));
        c.add(Calendar.MONTH,2);
        c.set(Calendar.DATE,10000);
        System.out.println(c.getTime());

        //1970年两百年后
        c.setTime(new Date(0));
        c.add(Calendar.YEAR,100);
        c.set(Calendar.DATE,100);
        System.out.println(c.getTime());
    }
}
