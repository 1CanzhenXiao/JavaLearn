package Thexp19;

abstract class Area{
	abstract double area();
}

class RoundArea extends Area{
	double Pi = 3.1415926;
	double r;
	RoundArea(double r){
		this.r = r;
	}
	double area(){
		double area;
		area = Pi*r*r;
		return area;
	}
}

class RectArea extends Area{
	double b;
	RectArea(double b){
		this.b = b;
	}
	
	double area() {
		double area;
		area = b*b;
		return area;
	}
}

public class Test19 {
	public static void main(String[] args) {
		RoundArea a = new RoundArea(1);
		RectArea b = new RectArea(2);
		
		System.out.println("a= " +a.area());
		System.out.println("b= "+b.area());
	}
}
