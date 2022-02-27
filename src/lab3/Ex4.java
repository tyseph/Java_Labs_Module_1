package lab3;

import java.util.Scanner;

public class Ex4 {

	static int modifyNumber(int input) {
		int num = 0;
		StringBuffer modNum = new StringBuffer();
		String tmp = Integer.toString(input);
		for (int i = 0; i < tmp.length(); i++) {
			if (i == tmp.length() - 1) {
				modNum.append(tmp.charAt(i));
			} else {
				num = Math.abs(Character.getNumericValue(tmp.charAt(i)) - Character.getNumericValue(tmp.charAt(i + 1)));
				// System.out.println(num);
				char b = Character.forDigit(num, 10);
				modNum.append(b);
			}
			num = Integer.parseInt(modNum.toString());
		}
		return num;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int input = sc.nextInt();

		System.out.println(Ex4.modifyNumber(input));
		sc.close();
	}
}
