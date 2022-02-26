package lab1;

import java.util.Scanner;

public class Ex7 {

	static boolean checkNumber(long n) {
		while (n > 0) {
			long flag = n / 10;
			while (flag > 0) {
				if (n%10 < flag % 10) {
					return false;
				}
				flag = flag/10;
			}
			n = n/10;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("The number is increasing: ");
		long num = sc.nextInt();
		System.out.println(Ex7.checkNumber(num));
		sc.close();
	}
}
