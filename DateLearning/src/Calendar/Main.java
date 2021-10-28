package Calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
    static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd : HH-mm-ss");
    public static void main(String[] args) {
        //日历类Calendar为单例模式，无法实例化对象
        Calendar c = Calendar.getInstance();
        //从日历类中提取当前时间并将其变为日期对象
        Date now = c.getTime();
        System.out.println(now);
        System.out.println(sdf.format(now));
        System.out.println(c.getTime());

        c.setTime(now);
        c.add(Calendar.YEAR,-1);
        System.out.println(c.getTime());
    }
}
