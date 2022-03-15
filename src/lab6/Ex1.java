package lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Ex1 {

	public static List<Integer> getValues(Map<Integer, Integer> myList, int num) {

//		myList.put(1, 2);
//		myList.put(2, 1);
//		myList.put(3, 5);
//		myList.put(4, 3);
//		myList.put(5, 4);

		List<Integer> newList = new ArrayList<>();

		newList.addAll(myList.values());
		Collections.sort(newList);

		return newList;
	}

	public static void main(String[] args) {

		Map<Integer, Integer> myList = new HashMap<>();
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Numebr of Value for HashMap: ");
		int num = 0;
		num = scanner.nextInt();

		for (int i = 0; i < num; i++) {
			int j = scanner.nextInt();
			myList.put(i, j);
		}
		scanner.close();

		scanner.close();

		System.out.println(Ex1.getValues(myList, num));
		;

	}
}
