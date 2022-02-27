package lab3;

import java.util.Scanner;

public class Ex3 {

	static StringBuffer alterString(String str) {
		StringBuffer s = new StringBuffer();
		char[] tmpStr = str.toCharArray();
		for (char tmp : tmpStr) {
			if (tmp == 'z') {
				tmp = 'a';
			}
			if (tmp == 'Z') {
				tmp = 'A';
			}
			if (tmp != 'a' && tmp != 'A' && tmp != 'e' && tmp != 'E' && tmp != 'i' && tmp != 'I' && tmp != 'o'
					&& tmp != 'O' && tmp != 'u' && tmp != 'U') {
				tmp += 1;
			}
			s.append(tmp);
		}
		return s;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String input = sc.next();

		System.out.println(Ex3.alterString(input));
		sc.close();
	}
}
