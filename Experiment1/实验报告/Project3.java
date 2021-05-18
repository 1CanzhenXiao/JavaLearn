package End;

public class Project3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=1000;i++) {		//将1~1000里的数带入循环中判断
			int a=0;					//初始化a=0
			for(int n=1;n<i;n++) {		//判断循环，寻找因子
				if(i%n==0) a+=n;		//将所有因子求和
			}
			if(a==i) System.out.printf("%5d",a);		//若因子之和等于i，则i是完数。
		}

	}

}
