package Fiexp9;

public class Test10 {
	public static void main(String[] args) {
		try {
			throw new Exception("Warning");
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			System.out.println("打印一条消息");
		}
	}
}
