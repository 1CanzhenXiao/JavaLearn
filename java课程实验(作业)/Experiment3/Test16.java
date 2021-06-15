package Thexp16;

class Vehlcles{
	int size,seats;
	String color;
	Vehlcles(int size,String color,int seats){
		this.size = size;
		this.color = color;
		this.seats = seats;
	}
	
	public void print() {
		System.out.println("size = " + size+";   color is :"+color+";   seats are :"+seats);
	}
}

class Car extends Vehlcles {
	Car(int size,String color,int seats){
		super(size,color,seats);
	}
	
	public void print() {
		System.out.println("size = " + size+";   color is :"+color+";   seats are :"+seats);
	}
}

public class Test16 {
	public static void main(String[] args) {
		Vehlcles a = new Vehlcles(10,"red",4);
		Car b = new Car(12,"yellow",4);
		
		a.print();
		b.print();
	}
}
