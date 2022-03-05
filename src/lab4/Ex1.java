package lab4;

import java.util.UUID;

class Person {

	public String name;
	float age;

	public Person(String name, int age) {
		super();
		System.out.println("Called first");

//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter Name: ");
//		this.name = sc.next();
//		System.out.print("Enter Age: ");
//		this.age = sc.nextInt();
//		sc.close();
		this.name = name;
		this.age = age;
	}

//	Person(String name, int age) {
//
//	}

	void setName(String name) {
		this.name = name;
	}

	void setAge(int age) {
		this.age = age;
	}

	public void getEverything() {
		System.out.println(this.name + ": " + this.age);
	}
}

class Account {
	private UUID accNum;
	double balance = 0;
	String accHolder;

	public Account(String name, int age) {
		super();
		this.accNum = UUID.randomUUID();
		Person person = new Person(name, age);
		System.out.println("Called second");
		this.accHolder = person.name;
	}

	void deposit(double amount) {
//		Scanner dep = new Scanner(System.in);
//		System.out.print("Enter Amount: ");
//		double amount = dep.nextDouble();
//		dep.close();
		this.balance += amount;
	}

	void withdraw(double amount) {
		if (amount > this.balance)
			this.balance -= amount;
	}

	void getBalance() {
		System.out.println(this.balance);
	}

	void getDetails() {
		System.out.println("-----Details-----");
		System.out.println(this.accNum);
		System.out.println(this.accHolder);
		System.out.println(this.balance);
	}
}

class savingsAccount extends Account {

	final double minBalance = 500;
	double balance;

	public savingsAccount(String name, int age) {
		super(name, age);
		Account save = new Account(name, age);
		this.balance = save.balance;
	}

	@Override
	void withdraw(double amount) {
		if (amount > this.balance)
			this.balance -= amount;
	}

}

public class Ex1 {
	public static void main(String[] args) {
		savingsAccount smith = new savingsAccount("Smith", 25);
		smith.deposit(2000);
		smith.getDetails();
	}

}
