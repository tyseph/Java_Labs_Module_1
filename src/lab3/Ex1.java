package lab3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string of numbers");
		String input = sc.nextLine();

		StringTokenizer str = new StringTokenizer(input);

		int num = 0, sum = 0;

		while (str.hasMoreElements()) {
			String s = str.nextToken();
			num = Integer.parseInt(s);
			sum += num;
		}
		System.out.println(sum);
		sc.close();

	}
}
