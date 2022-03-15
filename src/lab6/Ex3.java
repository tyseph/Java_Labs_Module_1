package lab6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex3 {

	public static Map<Integer, Integer> getSquares(int[] input) {

		Map<Integer, Integer> list = new HashMap<>();

		for (int i : input)
			list.put(i, i * i);

		return list;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size of array: ");
		int n = sc.nextInt();

		int[] input = new int[n];

		for (int j = 0; j < input.length; j++)
			input[j] = sc.nextInt();

		sc.close();

		System.out.println(getSquares(input));
	}
}
