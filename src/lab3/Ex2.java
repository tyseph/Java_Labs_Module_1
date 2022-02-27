package lab3;

import java.util.Scanner;

public class Ex2 {

	static StringBuffer getImage(String str) {
		StringBuffer s = new StringBuffer(str);
		StringBuffer newStr = new StringBuffer(str);
		s.append(" | " + newStr.reverse());
		return s;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String input = sc.next();

		System.out.println(Ex2.getImage(input));
		sc.close();
	}
}
