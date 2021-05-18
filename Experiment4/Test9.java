package Fexp9;

import java.util.Arrays;

public class Test9 {
	public static void main(String [] args) {
		int [] a = new int [] {1,2,3,4,5,6,7,8,9,45,452,213,1324,32525,235,235,223,54};
		
		Arrays.sort(a);	//对数组进行升序排序
		
		//最大值
		System.out.println("最大值： "+a[a.length-1]);
		
		//最小值
		System.out.println("最小值： "+a[0]);
		
		//平均值&&所有元素的和
		int m=0;
		for(int i=0;i<a.length;i++){
			m += a[i]; 
		}
		int c=m/a.length;
		System.out.println("平均值： "+c);
		System.out.println("所有元素的和： "+m);
		
	}
}
