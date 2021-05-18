package Thexp12;

class Person{ //person��
	String name;
	String address;
	long phoneNumber;
	String email;
	Person(String name,String address,long phoneNumber,String email){
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	
	public String toString() { //��дtoString����
		return "name= "+name+'\n'+"address= "+address+'\n'+"phoneNumber= "+phoneNumber+'\n'
				+"email= "+email;
	}
}

class Student extends Person{	//Student�̳и���
	String grade;
	Student(String name,String address,long phoneNumber,String email,String grade){
		super(name,address,phoneNumber,email);
		this.grade = grade;
	}
	
	 public String toString() { //��дtoString����
		return "name= "+name+'\n'+"address= "+address+'\n'+"phoneNumber= "+phoneNumber+'\n'
				+"email= "+email+'\n'+"grade= "+grade;
	}
}

class Employee extends Person{  //ְԱ��
	Employee(String name,String address,long phoneNumber,String email){
		super(name,address,phoneNumber,email);
	}
	
	public String toString() {  //��дtoString����
		return "name= "+name+'\n'+"address= "+address+'\n'+"phoneNumber= "+phoneNumber+'\n'
				+"email= "+email;
	}
}

class Faculty extends Employee{  //��Ա��
	String office;
	String level;
	String positionTitle;
	int salary;
	Faculty(String name,String address,long phoneNumber,String email,
			String office,String level,String positionTitle,int salary){
		super(name,address,phoneNumber,email);
		this.office = office;
		this.level = level;
		this.positionTitle = positionTitle;
		this.salary = salary;
	}
	MyDate s = new MyDate(2027,9,1);
	
	public String toString() {
		return "name= "+name+'\n'+"address= "+address+'\n'+"phoneNumber= "+phoneNumber+'\n'
				+"email= "+email+'\n'+"office= "+office+'\n'+"level= "+level+'\n'
				+"positionTitle= "+positionTitle+'\n'+"salary= "+salary+'\n'+"Date= "+s;
	}
}

class MyDate{  //������
	int year;
	int month;
	int day;
	MyDate(int year,int month,int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}
}


public class Test12 {	
	public static void main(String[] args) {
		Person a = new Person("AA","AAA",123456,"666@qq.com");
		Student b = new Student("BB","BBB",123456,"666@qq.com","��");
		Employee c = new Employee("CC","CCC",123456,"666@qq.com");
		Faculty d = new Faculty("DD","DDD",123456,"666@qq.com","In your heart","3","ABCD",10000);
		
		System.out.println(a.toString()+'\n'+"*************************");
		System.out.println(b.toString()+'\n'+"*************************");
		System.out.println(c.toString()+'\n'+"*************************");
		System.out.println(d.toString());
	}
}
