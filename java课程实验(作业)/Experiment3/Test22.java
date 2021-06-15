package Thexp22;

interface Flyable{
	double flySpeed();
}

class Animal{
	private String type;
	String sound;
	
	Animal(String type,String sound){
		this.type = type;
		this.sound = sound;
	}
	
	public String toString() {
		return type;
	}
	
	public void sound() {
		System.out.println("sound is" +sound);
	}
}

class Eagle extends Animal implements Flyable{
	double speed;
	Eagle(String type,String sound,double speed){
		super(type,sound);
		this.speed = speed;
	}
	
	public double flySpeed() {
		return speed;
	}
}

class Pigeon extends Animal implements Flyable{
	double speed;
	Pigeon(String type,String sound,double speed){
		super(type,sound);
		this.speed = speed;
	}
	
	public double flySpeed() {
		return speed;
	}
}

public class Test22 {
	public static void main(String[] args) {
		Eagle e = new Eagle("a","aaa",22);
		Pigeon p = new Pigeon("b","bbb",11);
	
		System.out.println(e.flySpeed());
		System.out.println(p.flySpeed());
	}
	
}
