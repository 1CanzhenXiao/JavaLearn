package Fexp10;
import java.util.*;

public class Test10 {
	public static void main(String [] args) {
		String d = new String();
		String b = new String("abcd");
		
		
		System.out.println("Please input the String you want:");
		Scanner c = new Scanner(System.in);
		d = c.nextLine();
		StringBuffer a = new StringBuffer(d);
		
		
		int index;
		for(int i=0;i<b.length();i++) {
			index=0;
			while(index<a.length()) {
				if(a.charAt(index)==b.charAt(i)) 
					a.deleteCharAt(index++);
				else index++;
			}
		}
		System.out.println(a);
	}
}
