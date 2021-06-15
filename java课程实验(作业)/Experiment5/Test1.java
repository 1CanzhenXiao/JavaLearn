package Fiexp1;
import java.util.*;

public class Test1 {
	public static void main(String [] args){
		Scanner a1 = new Scanner(System.in);
		System.out.println("Please input the a:");
		int a = a1.nextInt();
		System.out.println("Please input the b:");
		int b = a1.nextInt();
		double c;
		
		try {
			c = a/b;
			System.out.println(c);
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
	} 
}

