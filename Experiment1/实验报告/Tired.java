package exp4;

public class Tired {

	public static void main(String[] args) {
		int total=0,element=1,n=0; 	//totalΪ�ܺͣ�elementΪn��
		while(total<=9999) {		//ѭ���ж�����
			n++;
			element*=n;			//�׳˵ı仯
			total+=element;
		}
		System.out.printf("%d",n-1);	//����ѭ��ʱ�ܺ�һ������9999�����Դ�ӡn-1��	
	}

}
