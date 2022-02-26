package lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex2 {

	static void sortStrings(String str) {

		char charArr[] = str.toCharArray();
		Arrays.sort(charArr);
		for (int c = charArr.length - 1; c >= 0; c--) {
			System.out.print(charArr[c]);
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		String str = sc.next();
		Ex2.sortStrings(str);
		sc.close();
	}
}
