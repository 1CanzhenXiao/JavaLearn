package THexp1;

class Person{
	String name;
	String gender;
	int age;
	Person(String name,String gender,int age){ //构造方法
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
}

class Student extends Person{
	long id;
	String cname;
	int score;
	Student(String name,String gender,int age,long id,String cname,int score){ //子类构造方法
		super(name,gender,age);
		this.id = id;
		this.cname = cname;
		this.score = score;
	}
	
	void display() {  //display方法，显示各类信息
		System.out.println("name = "+name+'\n'+"gender = "+gender+'\n'+"age = "+age+'\n'
				+"id = "+id+'\n'+"cname = "+cname+'\n'+"score = "+score);
	}
}

public class Test1 {
	public static void main(String[] args) {
		Student student = new Student("肖灿圳","男",21,20251102142l,"计科",1);
		student.display();
	}
}
