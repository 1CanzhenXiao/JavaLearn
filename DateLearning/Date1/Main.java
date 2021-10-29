package Date1;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //date类中的时间原点为1970年1月1日八点（1969年发布了Unix第一个版本AT&T）
        //创建日期对象，打印出现在的时间及距离时间原点毫秒时间
        Date now = new Date();
        System.out.println(now);
        Date s = new Date(5000);
        System.out.println(s);


        //System.currentTimeMillis()与date。getTime（）效果相同
        System.out.print(new Date().getTime());
        System.currentTimeMillis();
    }
}
