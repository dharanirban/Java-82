import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account acc = null;
		
		while(true) {
			System.out.println("1. Create Account");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Balance");
			System.out.println("5. Exit");
			System.out.println("-------------------------------------------------");
			
			System.out.print("enter an option: ");
			int opt = sc.nextInt();
			
			switch(opt) {
			 case 1: //account creation
			   if(acc == null) {
				   System.out.print("enter account no: ");
				   long acno = sc.nextLong();
				   sc.nextLine();
				   
				   System.out.print("enter name: ");
				   String name = sc.nextLine();
				   
				   System.out.print("enter initial deposit: ");
				   float amount = sc.nextFloat();
				   
				   acc = new Account(acno, name, amount);
				   System.out.println("**** ACCOUNT OPENED **** CAN DO TRANSACTIONS ****");
			   }else {
				   System.out.println("---- ACCOUNT IS ALREADY OPENED WITH US ----");
			   }
			   break;
			 case 2: //deposit
			   if(acc != null) {
					System.out.print("enter amount to deposit: ");
					float amt = sc.nextFloat();
					acc.deposit(amt);					   
			   }else {
				   System.out.println("---- PLEASE OPEN AN ACCOUNT WITH US ----");
			   }				 
			   break;
			 case 3: //withdraw
			   if(acc != null) {
					System.out.print("enter amount to withdraw: ");
					float amt = sc.nextFloat();
					acc.withdraw(amt);
			   }else {
				   System.out.println("---- PLEASE OPEN AN ACCOUNT WITH US ----");
			   }				 
			   break;
			 case 4: //balance
			   if(acc != null) {
				   acc.getDetails();
			   }else {
				   System.out.println("---- PLEASE OPEN AN ACCOUNT WITH US ----");
			   }
			   break;
			 case 5: //terminate app
			   System.out.println("***** BYE **** BYE *****");
			   System.exit(0); //to terminate application 0 -> exit handler
			   break;
			 default:  
				 System.out.println("***** INVALID OPTION ... TRY AGAIN *****");
			}//switch
			System.out.println("=================================================");
		}//while
	}//main
}//class
