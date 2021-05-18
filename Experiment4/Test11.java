package Fexp11;

import java.util.Scanner;

public class Test11 {
	public static void main(String [] args) {
		String a = new String();
		char b = 'a';
		
		
		System.out.println("Please input the String you want:");
		Scanner c = new Scanner(System.in);
		a = c.nextLine();
		
		
		int number=0;
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)==b) number++;
		}
		System.out.println(number);
	}
}
