package Fiexp9;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Test9 {
	public static void main(String [] args) throws InputMismatchException{
		Scanner a = new Scanner(System.in);
		System.out.println("请输入圆的半径： ");
		
		try {
			double r = a.nextDouble();
			double area = Math.PI*r*r;
			System.out.println("圆的面积是："+area);
		}catch(InputMismatchException e) {
			System.out.println(e);
		}finally {
			System.out.println("程序运行异常");
		}
	}
}
