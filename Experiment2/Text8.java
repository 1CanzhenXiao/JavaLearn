package Texp8;

class Course{
	int cNumber;
	String cName;
	double cuit;
	
	Course(int cNumber,String cName,double cuit){
		this.cNumber = cNumber;
		this.cName = cName;
		this.cuit = cuit;
	}
	
	void printCourseInfo() {
		System.out.println(" cNumber: "+cNumber+"  cName: "+cName+"  cuit: "+cuit);
	}
}

public class Text8{
	public static void main(String [] args) {
		Course c = new Course(10,"abc",3.0);
		c.printCourseInfo();
	}
}
