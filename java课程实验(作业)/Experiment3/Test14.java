package Thexp14;

class SA{
	public int f(int a,int b) {
		int c=1;
		int min = Math.min(a, b);
		int max = Math.max(a, b);
		while(c!=0) {
			c = max%min;
			if(c!=0)
			min=c;
		}return min;
	}
}

class SB extends SA{
	int m;
	public int f(int a,int b) {
		int m = super.f(a,b);
		return (a*b)/m;
	}
}

public class Test14 {
	public static void main(String[] args) {
		SA sa = new SA();
		SB sb = new SB();
		
		System.out.println(sa.f(30,45));
		System.out.println(sb.f(30,45));
	}
}
