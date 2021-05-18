package Texp7;

class Mypoint{
	double x;
	double y;
	
	Mypoint(){
		x=0;
		y=0;
	}
	
	Mypoint(double x,double y){
		this.x = x;
		this.y = y;
	}
	
	double getX() {
		return x;
	}
	
	double getY() {
		return y;
	}
	
	double distance() {
		double dis = Math.sqrt(x*x + y*y);
		return dis;
	}
	
}

public class Text7{
	public static void main(String [] args) {
		Mypoint a = new Mypoint(2,3);
		System.out.println("The a's distance is "+a.distance());
		Mypoint b = new Mypoint(10,30.5);
		System.out.println("The b's distance is "+b.distance());
		
	}
}
