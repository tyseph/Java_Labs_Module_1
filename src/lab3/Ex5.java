package lab3;

import java.util.Scanner;

public class Ex5 {

	static void display(String input) {
		int words = 0, letters = 0;
		String[] token = input.split(" ");
		for (int i = 0; i < token.length; i++) {
			words++;
			char[] ch = token[i].toCharArray();
			for (int j = 0; j < ch.length; j++) {
				letters++;
			}
		}
		System.out.println("Words = " + words);
		System.out.println("Letters = " + letters);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String input = sc.nextLine();

		Ex5.display(input);
		sc.close();

	}

}
