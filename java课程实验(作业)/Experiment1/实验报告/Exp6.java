package exp6;
import java.util.Scanner;

public class Exp6 {

	public static void main(String[] args) {
		System.out.println("Please input the even number:");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		while(num%2!=0) { 						//��������num��Ϊż������Ҫ����������
			System.out.println("Please input again,because the number isn't even number!");
			num = scanner.nextInt();
		}
		for(int i=2;i<=num-2;i++) {				//i��nΪnum����������
			int n=num-i;
			if(count(i)&&count(n)) {			//���������Ӷ�Ϊ���������ӡ��������
				System.out.println("condition establishment");
				break;						
			}
		}
	}
	
	
	public static boolean count(int i) {  		//����һ���ж������ľ�̬����count������Ϊ����
		for(int n=2;n<i;n++) {
			if(i%n==0) return false;
		}
		return true;
	}
}

