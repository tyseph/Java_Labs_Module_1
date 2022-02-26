package lab1;

import java.util.Scanner;

public class Ex4 {

	static void m1(int n) {
		int count = 0;
		for (int i = 2; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % j == 0)
					count++;
			}
			if (count == 2)
				System.out.print(" " + i);
			count = 0;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Nth number: ");
		int num = sc.nextInt();
		Ex4.m1(num);
		sc.close();
	}
}
