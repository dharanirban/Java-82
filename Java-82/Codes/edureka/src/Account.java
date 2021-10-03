
public class Account {
	long acno;
	String name;
	float bal;
	
	Account(long acno, String name, float bal) {
		this.acno = acno;
		this.name = name;
		this.bal = bal;
	}
	
	void deposit(float amt) {
		this.bal = this.bal + amt;
		System.out.println("Rs."+amt+" credited | Balance: "+ this.bal);
	}
	
	void withdraw(float amt) {
		if(this.bal >= amt) {
			this.bal -= amt;
			System.out.println("Rs."+amt+" debited | Balance: "+ this.bal);
		}else {
			System.out.println("Error: Insufficient Balance");
		}
	}
	
	void getDetails() {
		System.out.println("A/C NO: "+this.acno + " | NAME: "+ this.name +" | BALANCE: "+ this.bal);
	}
}
