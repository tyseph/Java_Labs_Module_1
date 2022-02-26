package lab1;

import java.util.Scanner;

public class Ex5 {

	static void calculateSum(int n) {
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Nth number: ");
		int num = sc.nextInt();
		Ex5.calculateSum(num);
		sc.close();
	}
}
