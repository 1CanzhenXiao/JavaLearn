package Fexp13;
import java.util.*;

class Circle{
	double area(double r) {
		double area;
		area = Math.PI*r*r;
		return area;
	}
}

public class Test13 {
	public static void main(String [] args) {
		Circle aa = new Circle();
		System.out.println("Please input the r");
		Scanner a = new Scanner(System.in);
		
		System.out.println(aa.area(a.nextDouble()));
	}
}
