package End;

public class Project3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=1000;i++) {		//��1~1000���������ѭ�����ж�
			int a=0;					//��ʼ��a=0
			for(int n=1;n<i;n++) {		//�ж�ѭ����Ѱ������
				if(i%n==0) a+=n;		//�������������
			}
			if(a==i) System.out.printf("%5d",a);		//������֮�͵���i����i��������
		}

	}

}
