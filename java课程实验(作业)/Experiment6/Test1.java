package Sexp;
import java.util.*;

public class Test1 {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		String a = scanner.nextLine();
		
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)>='a'&&a.charAt(i)<='z') {	//若为小写字母
				System.out.print((char)('a'+'z'-a.charAt(i)));
			}
			else if(a.charAt(i)>='A'&&a.charAt(i)<='Z') {	//若为大写字母
				System.out.print((char)('A'+'Z'-a.charAt(i)));
			}
			else System.out.print(a.charAt(i));	//若不为字母，则按原样输出
		}
	}
}
