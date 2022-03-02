package lab4;

public class Account {

	private double balance;
	private static long accNum = 1;
	long num;
	
	public Account(double initialDeposit) {
		this.balance = initialDeposit;
		num = Account.accNum++;
		
	}
		
	public long getAccNum() {
		return num;
	}

	public void deposit(double amount) {
		balance = balance + amount;
	}

	public void withdraw(double amount) {
		if(amount<=balance) {			
			balance = balance - amount;
		}
		else {
			System.err.println("Not Enough Balance");
		}
	}

	public double getBalance() {
		return balance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
