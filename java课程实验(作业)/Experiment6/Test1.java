package Sexp;
import java.util.*;

public class Test1 {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		String a = scanner.nextLine();
		
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)>='a'&&a.charAt(i)<='z') {	//��ΪСд��ĸ
				System.out.print((char)('a'+'z'-a.charAt(i)));
			}
			else if(a.charAt(i)>='A'&&a.charAt(i)<='Z') {	//��Ϊ��д��ĸ
				System.out.print((char)('A'+'Z'-a.charAt(i)));
			}
			else System.out.print(a.charAt(i));	//����Ϊ��ĸ����ԭ�����
		}
	}
}
