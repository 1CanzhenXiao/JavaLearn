package Fexp9;

import java.util.Arrays;

public class Test9 {
	public static void main(String [] args) {
		int [] a = new int [] {1,2,3,4,5,6,7,8,9,45,452,213,1324,32525,235,235,223,54};
		
		Arrays.sort(a);	//�����������������
		
		//���ֵ
		System.out.println("���ֵ�� "+a[a.length-1]);
		
		//��Сֵ
		System.out.println("��Сֵ�� "+a[0]);
		
		//ƽ��ֵ&&����Ԫ�صĺ�
		int m=0;
		for(int i=0;i<a.length;i++){
			m += a[i]; 
		}
		int c=m/a.length;
		System.out.println("ƽ��ֵ�� "+c);
		System.out.println("����Ԫ�صĺͣ� "+m);
		
	}
}
