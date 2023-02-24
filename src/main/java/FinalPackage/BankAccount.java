package FinalPackage;

import java.util.Scanner;

public class BankAccount {
	int balance;
	int previousTransaction;
	String CustomerName;
	String CustomerId;
	
	BankAccount(String cname, String cid){
		CustomerName= cname;
		CustomerId= cid;
	}
	
	void deposit(int amount) {
		if(amount !=0) {
			balance = balance + amount;
			previousTransaction=amount;
		}
	}
	
	void withdraw(int amount) {
		if(amount!=0) {
			balance = balance - amount;
			previousTransaction= -amount;
		}
	}
	
	void getPreviousTransaction() {
		if(previousTransaction >0) {
			System.out.println("Deposited: "+previousTransaction);
		}
		else if(previousTransaction<0) {
			System.out.println("Withdrawn: "+Math.abs(previousTransaction));
		}
		else {
			System.out.println("No Previous Transaction");
		}
	}
	
	void showMenu() {
		char option;
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Welcome "+CustomerName);
		System.out.println("Your ID is:" +CustomerId);
		System.out.println("");
		System.out.println("Menu");
		System.out.println("A. Check Balance");
		System.out.println("B. Deposit");
		System.out.println("C. Withdraw");
		System.out.println("D. Previous Transaction");
		System.out.println("E. Exit");
		
		do {
			System.out.println("=========================================");
			System.out.println("Enter an Option");
			System.out.println("=========================================");
			option = scanner.next().charAt(0);
			System.out.println("");
			
			switch(option){
			case 'A':
				System.out.println("-------------------------------------");
				System.out.println("Balance: "+balance);
				System.out.println("");
				break;
				
			case 'B':
				System.out.println("-------------------------------------");
				System.out.println("Enter an Amount to Deposit: ");
				int amount =scanner.nextInt();
				deposit(amount);
				System.out.println("Deposited: "+amount);
				System.out.println("Thankyou your amount is deposited");
				System.out.println("");
				break;
				
			case 'C':
				System.out.println("--------------------------------------");
				System.out.println("Enter an Amount to Withdraw: ");
				int amount2 = scanner.nextInt();
				withdraw(amount2);
				System.out.println("Please collect your cash");
				System.out.println("");
				break;
				
			case 'D':
				System.out.println("---------------------------------------");
				getPreviousTransaction();
				System.out.println("");
				break;
			
			case 'E':
				System.out.println("----------------------------------------");
				break;
				
			default:
				System.out.println("Invalid option!");
				System.out.println("Please enter again.");
				break;
			}
		}while(option !='E');
		
		System.out.println("Thankyou for using our services");
		
		scanner.close();
	}
}
