package lab4;

public class Ex1 {

	public static void main(String[] args) {

		Account smith = new Account(2000);
		smith.deposit(2000);

		Account kathy = new Account(3000);
		kathy.withdraw(2000);

		System.out.println("Acc No. : Account Balance");
		System.out.println("  " + smith.getAccNum() + " 	  " + smith.getBalance());
		System.out.println("  " + kathy.getAccNum() + " 	  " + kathy.getBalance());

	}
}
