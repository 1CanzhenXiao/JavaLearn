package Thexp13;

class A{
	 protected void f(String s) {
		char [] a = s.toCharArray();
		for(int i=0;i<s.length();i++) {
			if(a[i]<='Z')
				System.out.printf("%c", a[i]);
		}
	}
}

class B extends A{
	void g(String s) {
		char [] b = s.toCharArray();
		for(int i=0;i<s.length();i++) {
			if(b[i]>'Z')
				System.out.printf("%c", b[i]);
		}
	}
}

public class Test13 {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		
		a.f("I��LOVE��YOU��");
		System.out.println('\n');
		b.g("I��LOVE��YOU��");
		
	}
}
