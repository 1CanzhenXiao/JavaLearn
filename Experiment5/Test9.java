package Fiexp9;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Test9 {
	public static void main(String [] args) throws InputMismatchException{
		Scanner a = new Scanner(System.in);
		System.out.println("������Բ�İ뾶�� ");
		
		try {
			double r = a.nextDouble();
			double area = Math.PI*r*r;
			System.out.println("Բ������ǣ�"+area);
		}catch(InputMismatchException e) {
			System.out.println(e);
		}finally {
			System.out.println("���������쳣");
		}
	}
}
