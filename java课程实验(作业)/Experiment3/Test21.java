package Thexp21;

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

public class Test21 {
	public static void main(String[] args) {
	}
}
