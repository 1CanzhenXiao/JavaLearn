package Texp5;

class Rectangle{
	double width;
	double height;
	String color;
	
	Rectangle(){
		width = 1.0;
		height = 1.0;
		color = "白色";
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
	Rectangle a = new Rectangle(4,40,"黄色");
	Rectangle b = new Rectangle(3.5,35.9,"红色");
	System.out.println(" 宽"+a.getWidth()+" 高"+a.getHeight()+
			" 颜色"+a.getColour()+" 面积"+a.getArea()+" 周长"+a.getPerimeter());
	System.out.println(" 宽"+b.getWidth()+" 高"+b.getHeight()+
			" 颜色"+b.getColour()+" 面积"+b.getArea()+" 周长"+b.getPerimeter());
	}
}
