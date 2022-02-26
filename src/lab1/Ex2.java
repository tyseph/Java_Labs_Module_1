package lab1;
import java.util.Scanner;

public class Ex2 {

	static void m1(int n) {
		switch(n) {
		case 1:
			System.out.println("Stop");
			break;
		case 2:
			System.out.println("Wait");
			break;
		case 3: 
			System.out.println("Go");
			break;
		default:
			System.out.println("Invalid input");
		}
			
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input");
		System.out.println("1. Stop \n2.Wait \n3.Go");
		int n = sc.nextInt();
		sc.close();
		Ex2.m1(n);
	}
}
