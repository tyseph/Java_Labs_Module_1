package lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex4 {

	static int[] modifyArray(int[] arr, int n) {
		int[] b = new int[1];
		int k = 0;
		Arrays.sort(arr);
		for (int i = 0; i < n; i++) {
			if (i == 0) {
				b[k] = arr[i];
			}
			if (arr[i] != b[k]) {
				b = Arrays.copyOf(b, b.length + 1);
				b[b.length - 1] = arr[i];
				k++;
			}
		}
		return b;
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
		arr = Ex4.modifyArray(arr, size);
		for(int a : arr) {
			System.out.print(a + " ");
		}
		sc.close();
	}
}
