package shekhar;

public class InterThreadC {
public static void main(String [] args) {
	Customer c = new Customer();
	
	Withdraw w = new Withdraw(c);
	Deposite d = new Deposite(c);
	
	w.start();
	d.start();
}
}
class Customer {
	int amount = 5000 ;
	synchronized void withdraw(int amount) {
	 if (this.amount<amount) {
		 System.out.println("Insufficient balance..");
		 try{
			 wait();
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
	 }
	 this.amount-=amount;
	 System.out.println("withdraw successfull. zero balance");
}
	synchronized void deposite(int amount) {
		this.amount+=amount;
		
		System.out.println("depositing successfull.15000");
		notify();
	}
	}
class Withdraw extends Thread{
	private Customer c;
	
	Withdraw(Customer c){
		this.c = c;
		
	}
	public void run() {
		c.withdraw(15000);
	}
	
}
class Deposite extends Thread{
	private Customer c;
	Deposite (Customer c){
		this.c = c;
		
	}
	public void run() {
		c.deposite(10000);
		
	}
}