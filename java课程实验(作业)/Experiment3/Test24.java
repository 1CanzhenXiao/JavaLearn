package Thexp24;

class DirectoryInquiries{
	String name;
	String address;
	long phoneNumber;
	
	String getName(){
		return name;
	}
	
	String getAddress() {
		return address;
	}
	
	long getPhoneNumber() {
		return phoneNumber;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	void setAddress(String address) {
		this.address = address;
	}
	
	void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}

public class Test24 {
	public static void main(String[] args) {
		DirectoryInquiries a = new DirectoryInquiries();
		
		a.setName("ABC");
		a.setAddress("ABCDEF");
		a.setPhoneNumber(123456);
		
		System.out.println(a.getName());
		System.out.println(a.getAddress());
		System.out.println(a.getPhoneNumber());
	}
}
