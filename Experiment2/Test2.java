package Texp2;

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


class StudentB extends Student{
	StudentB(int StudentNumber,int Class,int Age,String Name,String Gender){
		super.StudentNumber = StudentNumber;
		super.Class = Class;
		super.Age = Age;
		super.Name = Name;
		super.Gender = Gender;
	}
		
		public String toString() {
			String a = " Ñ§ºÅ: "+StudentNumber+" °àºÅ: "+Class+" ĞÕÃû: "+Name+" ĞÔ±ğ: "+Gender+" ÄêÁä "+Age;
			return a;
		}
}

public class Test2 {
	public static void main(String [] args) {
		StudentB aaa = new StudentB(42,1,20,"Ğ¤²ÓÛÚ","ÄĞ");
		System.out.println(aaa.toString());
	}
}
