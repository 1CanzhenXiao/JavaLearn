package Texp6;
class MyInteger{
	int value;
	
	MyInteger(int x){
		value = x;
	}
	
	int getInt() {
		return value;
	}
	
	boolean isEven() {
		if(value%2==0) return true;
		else return false;
	}
	
	boolean isOdd() {
		if(value%2!=0) return true;
		else return false;
	}
	
	boolean isPrime() {
		if(value==1) return false;
		else if(value==2) return true;
		for(int i=2; i<Math.sqrt(value);i++) {
			if(value%i==0) return false;
		}return true;
	}
	
	boolean equals(int x) {
		if(value==x) return true;
		else return false;
	}
	
	int parseInt(String x) {
		return Integer.parseInt(x);
	}
}

public class Text6 {
	public static void main(String[]args) {
	MyInteger a = new MyInteger(3);	
	System.out.println(a.getInt());
	System.out.println(a.isEven());
	System.out.println(a.isOdd());
	System.out.println(a.isPrime());
	System.out.println(a.equals(3));
	System.out.println(a.parseInt("12314415"));
	}
}
