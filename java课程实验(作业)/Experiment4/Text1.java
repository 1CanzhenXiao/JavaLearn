package Fexp1;

public class Text1 {
	public static void main(String [] args) {
		String a = "abc"; //a ָ��String�صġ�abc��
		String b = new String("abc");	//bָ���������Ϊ��abc���Ķ���
		
		System.out.println(a.equals(b));	//a��b��������ͬ�����Է���true
		System.out.println(a==b);	//a,b�Ķ����ַ��Ų�ͬ�����Է���false
	}
}
