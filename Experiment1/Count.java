package PrimeNumbers;

public class Count {

	public static void main(String[] args) {
		int i=2,j=1;					//��ʼ����iΪҪ�жϵ�����jΪ��ӡ���е��ж���
		System.out.printf("%5d",i);				//��Ϊ2����������������Բ������жϣ�ֱ�Ӵ�ӡ
		for(i=3;i<=1000;i++){					//ѭ������Ҫ�жϵ������������жϵķ���count
			if(Count.count(i)) {				//����true����ִ��
				System.out.printf("%5d",i);		//%5d���������ô�ӡ����������������
				j++;  
				if(j%8==0) System.out.printf("\n"); 		//ÿ��ӡ8�����־ͻ���
				}
		}
	}

	public static boolean count(int i) {  		//����һ���жϵľ�̬����count������Ϊ����
		for(int n=2;n<i;n++) {
			if(i%n==0) return false;
		}
		return true;
	}
}
