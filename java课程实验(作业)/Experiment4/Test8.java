package Fexp8;

public class Test8 {
	public static void main(String [] args) {
		int num;
		double a=0,b=0,c=0,d=0,e=0,f=0;
		for(int i=0;i<1000;i++) {
			num = (int)(Math.random()*6)+1;
			
			if(num==1) a++;
			else if(num==2) b++;
			else if(num==3) c++;
			else if(num==4) d++;
			else if(num==5) e++;
			else f++;
		}
		
		a/=1000; b/=1000; c/=1000; d/=1000; e/=1000; f/=1000;
		System.out.println("1的概率: "+a);
		System.out.println("2的概率: "+b);
		System.out.println("3的概率: "+c);
		System.out.println("4的概率: "+d);
		System.out.println("5的概率: "+e);
		System.out.println("6的概率: "+f);
	}
}
