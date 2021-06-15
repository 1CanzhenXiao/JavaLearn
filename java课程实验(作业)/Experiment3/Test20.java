package Thexp20;

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

public class Test20 {
	public static void main(String[] args) {
		Animal a = new Animal("a","a");
		Animal b = new Animal("b","b");
	}
}
