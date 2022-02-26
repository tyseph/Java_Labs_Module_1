package lab1;

import java.util.Scanner;

public class Ex3 {

	static void m1(int num) {
		int n1 = 0, n2 = 1, n3;
		if (num <= 2) {
			System.out.println(n1 + "\n" + n2);
		} else {
			System.out.println(n1 + "\n" + n2);
			for (int i = 2; i < num; i++) {
				n3 = n1 + n2;
				n1 = n2;
				n2 = n3;
				System.out.println(n3);
			}
		}
	}
	
	static int n1=0, n2=1,n3;
	static int m2(int n) {
		if(n == 0) {
			return 0;
		}
		if(n==1 || n==2) {
			return 1;
		}
		return m2(n-2) + m2(n-1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Nth number: ");
		int num = sc.nextInt();
		System.out.println("M1: Loops");
		Ex3.m1(num);
		System.out.println("m2: Recursion");
		for(int i=0;i<num;i++)
			System.out.println(Ex3.m2(i));
		sc.close();
	}
}
