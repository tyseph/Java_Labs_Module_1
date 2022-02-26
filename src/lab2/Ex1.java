package lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {

	static void getSecondSmallest(int[] arr) {
		for (int a : arr) {
			System.out.print(a + " ");
		}
		Arrays.sort(arr);
		System.out.println("\nSecond Smallest Integer is: " + arr[1]);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array Size: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + 1 + ": ");
			arr[i] = sc.nextInt();
		}
		Ex1.getSecondSmallest(arr);
		sc.close();
	}
}
