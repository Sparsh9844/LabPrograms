package myFunc;

class BankAccount {
	private String name;
	private int AccountNo;
	

	public void setAccount(String newName, int newAccount_No) {
		this.name = newName;
		this.AccountNo = newAccount_No;
		
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAccountNo() {
		return this.AccountNo;
	}
	
}

public class Prac7 {
	public static void main(String[] args) {
		BankAccount acc=new BankAccount("Sparsh", 1234567);
		System.out.println("name:" +acc.getName());
		System.out.println("name:" +acc.getAccountNo());
		
	}
}
