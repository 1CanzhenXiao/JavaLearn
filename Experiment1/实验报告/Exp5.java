package exp5;

public class Exp5 {

	public static void main(String[] args) {
		for(int i=100;i<=999;i++) {	//ˮ�ɻ���ֻ����100~999
			int h,m,l;				//����ˮ�ɻ�����ÿλ��
			int H,M,L;				//ÿλ��������
			l=i%10;					//��ˮ�ɻ�����ÿλ����ȡ����,ȡģ�ͳ�
			m=i/10%10;				
			h=i/100%10;					
			L=l*l*l;				//������
			M=m*m*m;
			H=h*h*h;
			if(i==L+M+H)			//�ж�����
				System.out.printf("%d\n",i);
		}
	}

}
