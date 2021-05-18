package exp6;
import java.util.Scanner;

public class Exp6 {

	public static void main(String[] args) {
		System.out.println("Please input the even number:");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		while(num%2!=0) { 						//如果输入的num不为偶数，则要求重新输入
			System.out.println("Please input again,because the number isn't even number!");
			num = scanner.nextInt();
		}
		for(int i=2;i<=num-2;i++) {				//i和n为num的两个因子
			int n=num-i;
			if(count(i)&&count(n)) {			//若两个因子都为质数，则打印条件成立
				System.out.println("condition establishment");
				break;						
			}
		}
	}
	
	
	public static boolean count(int i) {  		//定义一个判断质数的静态方法count，类型为布尔
		for(int n=2;n<i;n++) {
			if(i%n==0) return false;
		}
		return true;
	}
}

