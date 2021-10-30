package calendar1;

import java.util.Scanner;

class WhatTime {
    public static int getYear() {	//访问用户输入的年
        System.out.print("Please input years:");
        Scanner scanner = new Scanner (System.in);
        int year = scanner.nextInt();
        return year;    //得到用户所输入的年
    }
    static int year = getYear();    //这一句的作用是，在其子类中不用再写WhatTime.getYear()，节省空间
}


class LeapYear extends WhatTime {	//判断是否是闰年并修改二月份的天数
    static int[] monthDay = {31,28,31,30,31,30,31,31,30,31,30,31};  //将12个月的日数输入到一个数组中
    public static int[] leapYear() {    //新建一个年数的判断方法
        if(year%4==0&&year%100!=0) monthDay[1]=29;  //若年份不为百位整数年且可被4整除，则为闰年
        else if(year%100==0&&year%400==0) monthDay[1]=29;   //若其为百整数年且能被400整除，也是闰年
        //System.out.println(monthDay[1]); (测试是否有效)
        return monthDay;
    }
}


class WhereToPrint extends LeapYear {	//输出日历的格式判断
    static int date=0;
    public static int leapYearNumber() {
        for(int y = 1900; y<WhatTime.year; y++) {
            if(y % 4 == 0 && y % 100 != 0 || y % 400 == 0) date++;
        }return date;
    }
    static int blank = ((WhatTime.year - 1900)*365 + WhereToPrint.leapYearNumber())% 7 ;	//一年的第一个月是星期几（需要空几个空格出来）
}


class Calendar extends WhereToPrint {	//输出日历
    static void calendar(int i) {   //i的作用是用来提取出月份数，i为月份数的下标，下面Print类有引用
        LeapYear.leapYear();
        int num=0;
        for(int l=0;l<blank;l++) {
            System.out.printf("%c", '\t');
            num = blank;
        }
        for(int j=1;j<monthDay[i]+1;j++) {
            System.out.printf("%c%d",'\t',j);
            num++;
            if(num%7==0) System.out.print('\n');
            blank = num%7;
        }
    }
}


class Print extends Calendar {	//输出日历
    String[] month = new String[] {"January","February","Match","April","May","June","July",
            "August","September","October","November","December"};
    void print() {
        for(int i=0;i<12;i++) {
            System.out.println();
            System.out.println();
            System.out.println("\t\tMonth's name is "+month[i]);
            System.out.println("==========================================");
            System.out.println("\tMon\tThu\tWed\tThe\tFri\tSat\tSun");
            calendar(i);    //这里调用了父类Calendar打印日历
        }
    }
}

class MyCalender1 {
    public static void main(String[] args) {
        Print a =new Print();
        a.print();
    }
}
