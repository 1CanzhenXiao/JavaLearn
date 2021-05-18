package exp4;

public class Tired {

	public static void main(String[] args) {
		int total=0,element=1,n=0; 	//total为总和，element为n！
		while(total<=9999) {		//循环判断条件
			n++;
			element*=n;			//阶乘的变化
			total+=element;
		}
		System.out.printf("%d",n-1);	//跳出循环时总和一定大于9999，所以打印n-1；	
	}

}
