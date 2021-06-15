package Thexp17;

class MyRectangle{
	int heigth,width;
	
	int gerHeigth() {
		return heigth;
	}
	
	int getWidth() {
		return width;
	}
	
	void setHeigth(int heigth) {
		this.heigth = heigth;
	}
	
	void setWidth(int width) {
		this.width = width;
	}
	
	int getArea() {
		int area;
		area = heigth*width;
		return area;
	}
	
	void showInfo() {
		System.out.println("heigth = "+heigth+'\n'+"width = "+width+'\n'+"Area = "+getArea());
	}
}

class Mysquare extends MyRectangle{
	int getArea() {
		int area;
		area = heigth *width;
		return area;
	}
	
	void showInfo() {
		System.out.println("heigth = "+heigth+'\n'+"width = "+width+'\n'+"Area = "+getArea());
	}
}

public class Test17 {
	public static void main(String [] args) {
		MyRectangle a = new MyRectangle();
		Mysquare b = new Mysquare();
		
		a.setHeigth(10);
		a.setWidth(100);
		a.showInfo();
		
		
		b.setHeigth(10);
		b.setWidth(10);
		b.showInfo();
	}
}
