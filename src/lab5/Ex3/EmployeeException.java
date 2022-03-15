package lab5.Ex3;

import java.util.Scanner;

class InvalidSalaryException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidSalaryException(String string) {
		System.out.println(string);
	}
}

public class EmployeeException {

	private static void checkSalary(double amount) throws InvalidSalaryException {
		if (amount < 3000)
			throw new InvalidSalaryException("Salary Below 3000");
		else
			System.out.println(amount);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Salary: ");
		double salary = sc.nextDouble();

		try {
			EmployeeException.checkSalary(salary);
		} catch (InvalidSalaryException e) {
			System.out.println(e);
		}
		sc.close();

	}
}
