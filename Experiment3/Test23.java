package Thexp23;

class C{
	double fahrenheit,celsius;
	double getFahrenheit() {
		return fahrenheit;
	}
	double getCelsius() {
		return celsius;
	}
	
	void setFahrenheit (double fahrenheit) {
		this.fahrenheit = fahrenheit;
	}
	void setCelsius(double celsius) {
		this.celsius = celsius;
	}
}

public class Test23 {
	public static void main(String[] args) {
		C c = new C();
		c.setFahrenheit(22);
		System.out.println(c.getFahrenheit());
		
		c.setCelsius(22);
		System.out.println(c.getCelsius());
	}
}
