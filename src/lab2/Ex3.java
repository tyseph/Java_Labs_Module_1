package lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex3 {

	static void getSorted(int[] arr) {
		int[] b = new int[arr.length];
		int j = arr.length;
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			b[j - 1] = arr[i];
			j -= 1;
		}
		for (int i : b) {
			System.out.print(i + " ");
		}
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
		Ex3.getSorted(arr);
		sc.close();
	}
}
