package lab6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex2 {

	public static Map<Character, Integer> countChar(char[] str) {

		Map<Character, Integer> charMap = new HashMap<>();

		for (char ch : str) {
			if (charMap.containsKey(ch))
				charMap.put(ch, charMap.get(ch) + 1);
			else
				charMap.put(ch, 1);
		}

		return charMap;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String input = sc.next();

		System.out.println(countChar(input.toCharArray()));

		sc.close();
	}
}
