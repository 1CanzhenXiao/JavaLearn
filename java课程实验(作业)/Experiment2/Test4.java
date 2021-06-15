package Texp4;

class MyDate{
	int year;
	int month;
	int day;
	
	MyDate(){
		year = 2018;
		month = 1;
		day = 1;
	}
	
	MyDate(int y,int m,int d){
		year = y;
		month = m;
		day = d;
	}
	
	int getYear() {
		return year;
	}
	
	int getMonth() {
		return month;
	}
	
	int getDay() {
		return day;
	}
	
	void showDate() {
		System.out.println(year+"Äê"+month+"ÔÂ"+day+"ÈÕ");
	}
}
public class Test4 {
	public static void main(String [] args) {
		MyDate mydate = new MyDate();
		mydate.showDate();
	}

}
