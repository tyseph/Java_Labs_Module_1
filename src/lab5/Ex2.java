package lab5;

import java.util.Scanner;

class MissingNameException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MissingNameException(String string) {
		System.out.println(string);
	}

}

public class Ex2 {

	private static void checkName(String firstName, String lastName) throws MissingNameException {
		if (firstName.isEmpty() || lastName.isEmpty())
			throw new MissingNameException("Name Missing");
		else
			System.out.println(firstName + " " + lastName);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("Enter First Name: ");
		String firstName = s.next();

		System.out.print("Enter Last Name: ");
		String lastName = s.next();

		try {
			Ex2.checkName(firstName, lastName);
		} catch (MissingNameException e) {
			System.out.println(e);
		}

		s.close();

	}
}
