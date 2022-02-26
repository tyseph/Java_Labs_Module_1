package lab1;

import java.util.Scanner;

public class Ex8 {

	static boolean checkNumber(int n) {
		while (n > 1) {
			if (n % 2 != 0) {
				return false;
			}
			n = n / 2;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number ");
		int num = sc.nextInt();
		System.out.println(Ex8.checkNumber(num));
		sc.close();
	}
}
