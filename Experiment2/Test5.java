package Texp5;

class Rectangle{
	double width;
	double height;
	String color;
	
	Rectangle(){
		width = 1.0;
		height = 1.0;
		color = "��ɫ";
	}
	
	Rectangle(double width,double height,String color){
		this.width = width;
		this.height = height;
		this.color = color;
	}
	
	double getWidth() {
		return width;
	}
	
	double getHeight() {
		return height;
	}
	
	String getColour() {
		return color;
	}
	
	void setWidth(double width) {
		this.width = width;
	}
	
	void setHeight(double height) {
		this.height = height;
	}
	
	void setColour(String color) {
		this.color = color;
	}
	
	double getArea() {
		double area = width*height;
		return area;
	}
	
	double getPerimeter() {
		double perimeter = 2*(width+height);
		return perimeter;
	}
}

public class Test5 {
	public static void main(String [] args) {
	Rectangle a = new Rectangle(4,40,"��ɫ");
	Rectangle b = new Rectangle(3.5,35.9,"��ɫ");
	System.out.println(" ��"+a.getWidth()+" ��"+a.getHeight()+
			" ��ɫ"+a.getColour()+" ���"+a.getArea()+" �ܳ�"+a.getPerimeter());
	System.out.println(" ��"+b.getWidth()+" ��"+b.getHeight()+
			" ��ɫ"+b.getColour()+" ���"+b.getArea()+" �ܳ�"+b.getPerimeter());
	}
}
