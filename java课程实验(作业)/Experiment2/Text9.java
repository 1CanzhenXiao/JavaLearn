package Texp9;

class Account{
	int id;
	double balance;
	double annualInterestRate;
	String dateCreated;
	Account(){
		int id = 0;
		double balance = 0;
		double annualInterestRate = 0;
		String dateCreated = "2020.01.01";
	}
	
	Account(int id,double balance,double annualInterestRate,String dateCreated){
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		this.dateCreated = dateCreated;
	}
	
	double getMonthlyInterestRate() {
		double MonthlyInterestRate = annualInterestRate/12;
		return MonthlyInterestRate;
	}
	
	double withDraw(double a) {
		balance = balance - a;
		return balance;
	}
	
	double deposit(double b) {
		balance = balance + b;
		return balance;
	}
}

public class Text9 {
	public static void main(String [] args) {
		Account a = new Account(1122,20000.0,4.5,"2020.01.01");
		a.withDraw(2500);
		a.deposit(3000);
		System.out.println("余额："+a.balance+"元"+'\n'+"月利率："+a.annualInterestRate+"%"+'\n'
		+"开户日期："+a.dateCreated);
		
	}
}
