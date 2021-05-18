package Texp1;
import java.util.Scanner;
class Student{
	int StudentNumber;
	int Class;
	int Age;
	String Name;
	String Gender;
	Scanner scanner = new Scanner(System.in);
	
	
	int GetClass() {
		return Class;
	}
	
	String GetName() {
		return Name;
	} 
	
	int GetAge() {
		return Age;
	}
	
	 int ChangeAge() {
		System.out.println("Please input you age:");
		this.Age = scanner.nextInt();
		return Age;
	}
	 
	 
	 
	
	
	
	
	
}
public class Text1 {
	public static void main(String[]args) {
		Student student = new Student();
		student.Name = "Xiao ChanZhen";
		System.out.println("Your age is"+" "+student.GetName());
		System.out.println("Your age is"+" "+student.GetAge());
		student.ChangeAge();
		System.out.println("Your age is"+" "+student.GetAge());
	}
		
}
 
 
	 

