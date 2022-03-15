package lab5;

import java.util.Scanner;

class AgeException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AgeException(String str) {
		System.out.println(str);
	}
}

public class Ex1 {

	private static void checkAge() throws AgeException {
		throw new AgeException("Invalid age");
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter ur age :: ");
		int age = s.nextInt();

		try {
			if (age < 18) {
				checkAge();
			} else {
				System.out.println("Valid age");
			}
		} catch (AgeException a) {
			System.out.println(a);
		}
		s.close();
	}

}