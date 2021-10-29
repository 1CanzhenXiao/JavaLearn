package SimpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {
//        y 代表年
//        M 代表月
//        d 代表日
//        H 代表24进制的小时
//        h 代表12进制的小时
//        m 代表分钟
//        s 代表秒
//        S 代表毫秒
        //SimpleDateFormat可将时间转为指定格式日期文本，也可将文本转为日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd/HH/mm/ss");
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd   HH-mm-ss");
        Date now = new Date();
        System.out.println(sdf.format(now));
        System.out.println(sdf1.format(now));

        String date1 = "2020/12/02/11/32/44";
        Date aaa = sdf.parse(date1);
        System.out.println(aaa);
    }
}
