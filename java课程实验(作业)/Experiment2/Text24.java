package Texp24;
import java.util.Scanner;

class Whattime{
	public static int getYear() {	//�����û��������
		System.out.print("Please input years:");
		Scanner scanner = new Scanner (System.in);
		int year = scanner.nextInt();
		return year;
	}
	static int year = getYear();
}


class Leapyear extends Whattime{	//�ж��Ƿ������겢�޸Ķ��·ݵ�����
	static int[] monthDay = {31,28,31,30,31,30,31,31,30,31,30,31};
	public static int[] leapYear() {
		if(year%4==0&&year%100!=0) monthDay[1]=29;
		else if(year%100==0&&year%400==0) monthDay[1]=29;
		//System.out.println(monthDay[1]); (�����Ƿ���Ч)
		return monthDay;
	}
}


class Wheretoprint extends Leapyear{	//��������ĸ�ʽ�ж�
	static int date=0;
	public static int leapYearNumber() {
		for(int y=1900;y<Whattime.year;y++) {
			if(y % 4 == 0 && y % 100 != 0 || y % 400 == 0) date++;
		}return date;
	}
	static int blank = ((Whattime.year - 1900)*365 + date)% 7 ;	//һ��ĵ�һ���������ڼ�����Ҫ�ռ����ո������
}


class Calendar extends Wheretoprint{	//�������
	static void calendar(int i) {
		int num=0;
		if(i==0) {
			for(int l=0;l<blank;l++) {
				System.out.printf("%c",'\t');
				num=blank;
			}
		}else {
				for(int l=0;l<blank;l++) {
					System.out.printf("%c",'\t');
					num=blank;
				}
			}
		for(int j=1;j<monthDay[i]+1;j++) {
			System.out.printf("%c%d",'\t',j);
			num++;
			if(num%7==0) System.out.print('\n');
			blank = num%7;
		}
	}	
}


class Print extends Calendar{	//�������
	String[] month = new String[] {"January","February","Match","April","May","June","July",
									"August","September","October","November","December"};
	void print() {
		for(int i=0;i<12;i++) {
		System.out.println();
		System.out.println();
		System.out.println("\t\t\tMonth's name is "+month[i]);
		System.out.println("======================================================================");
		System.out.println("\tSun\tMon\tThu\tWed\tThe\tFri\tSat\t");
		calendar(i);
		}
	}
}


public class Text24 {
	public static void main(String[] args) {
		Print.leapYear();
		Print a =new Print();
		a.print();
	}
}
