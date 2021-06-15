package Fexp1;

public class Text1 {
	public static void main(String [] args) {
		String a = "abc"; //a 指向String池的“abc”
		String b = new String("abc");	//b指向堆中内容为“abc”的对象
		
		System.out.println(a.equals(b));	//a和b的内容相同，所以返回true
		System.out.println(a==b);	//a,b的对象地址存放不同，所以返回false
	}
}
