package Thexxp15;

class Pointer{
	int x,y;
	Pointer(int x,int y){
		this.x = x;
		this.y = y;
	}
	
	void setX(int x) {
		this.x = x;
	}
	
	void setY(int y) {
		this.y = y;
	}
	
	int getX() {
		return x;
	}
	
	int getY() {
		return y;
	}
	
	void display(){
		System.out.println("The pointer x = "+x+'\n'+"The pointer y= "+y);
	}
	
	boolean equal(Pointer p1,Pointer p2) {
		if(p1 == p2) return true;
		else return false;
	}
	
	double distance(Pointer p1,Pointer p2) {
		double distance;
		int x1 = p1.x-p2.x;
		int y1 = p1.y-p2.y;
		distance = Math.sqrt(x1*x1+y1*y1);
		return distance;
		
	}
}

public class Test15 {
	public static void main(String[] args) {
		Pointer p1 = new Pointer(1,3);
		Pointer p2 = new Pointer(4,7);
		Pointer p3 = new Pointer(0,0);
		
		p3.x = (p1.x - p2.x)/2;
		p3.y = (p1.y - p2.y)/2;
		System.out.println("ÖÐµãÎª"+"("+p3.x+","+p3.y+")");
	}
}
