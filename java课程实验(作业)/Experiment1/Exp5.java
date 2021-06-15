package exp5;

public class Exp5 {

	public static void main(String[] args) {
		for(int i=100;i<=999;i++) {	//水仙花数只遍历100~999
			int h,m,l;				//定义水仙花数的每位数
			int H,M,L;				//每位数的立方
			l=i%10;					//将水仙花数的每位数提取出来,取模和除
			m=i/10%10;				
			h=i/100%10;					
			L=l*l*l;				//求立方
			M=m*m*m;
			H=h*h*h;
			if(i==L+M+H)			//判断条件
				System.out.printf("%d\n",i);
		}
	}

}
