package Fiexp9;

class MyException extends Exception{
	String e;
	MyException(String e){
		this.e = e;
	}
	public void print() {
		System.out.println(e);
	}
}

public class Test11 {
	public static void main(String [] args) {
		try {
			MyException e1 = new MyException("I DON'T KNOW");
			throw e1;
		}catch(MyException e){
			e.print();
		}
	}
}
