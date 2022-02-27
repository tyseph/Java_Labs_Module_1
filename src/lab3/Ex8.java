package lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Ex8 {

	static boolean posString(String input) {
		char ch[] = input.toCharArray();
		Arrays.sort(ch);
		String c = new String(ch);
		if (c.equals(input)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String input = sc.next();

		System.out.println(Ex8.posString(input));
		sc.close();
	}
}
