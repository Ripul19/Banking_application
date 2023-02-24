package FinalPackage;

public class BankingApplication extends BankAccount {
	BankingApplication(String cname, String cid) {
		super(cname, cid);
		// TODO Auto-generated constructor stub
	}


public static void main(String[]args) {
	BankAccount obj = new BankAccount("Ripul","75364785");
	obj.showMenu();
	
}
}