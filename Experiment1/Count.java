package PrimeNumbers;

public class Count {

	public static void main(String[] args) {
		int i=2,j=1;					//初始化，i为要判断的数，j为打印换行的判断数
		System.out.printf("%5d",i);				//因为2本身就是素数，所以不参与判断，直接打印
		for(i=3;i<=1000;i++){					//循环，将要判断的数填入用来判断的方法count
			if(Count.count(i)) {				//若是true，则执行
				System.out.printf("%5d",i);		//%5d的作用是让打印出来的数更加整齐
				j++;  
				if(j%8==0) System.out.printf("\n"); 		//每打印8个数字就换行
				}
		}
	}

	public static boolean count(int i) {  		//定义一个判断的静态方法count，类型为布尔
		for(int n=2;n<i;n++) {
			if(i%n==0) return false;
		}
		return true;
	}
}
