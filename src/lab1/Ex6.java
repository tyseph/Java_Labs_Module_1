package lab1;

import java.util.Scanner;

public class Ex6 {

	static void calculateDifference_1(int n) {
		int sum1 = 0, sum2 = 0;
		for (int i = 0; i <= n; i++) {
			sum1 += i * i;
		}
		for (int i = 0; i <= n; i++) {
			sum2 += i;
		}
		System.out.println(sum1 - (sum2 * sum2));
	}

	static void calculateDifference_2(int n) {
		int sum = n * (2 + 3 * n - 2 * (n * n) - 3 * (n * n * n));
		System.out.println(sum / 12);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Nth number: ");
		int num = sc.nextInt();
		Ex6.calculateDifference_1(num);
		sc.close();
		Ex6.calculateDifference_2(num);
	}
}
