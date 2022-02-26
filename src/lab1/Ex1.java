package lab1;


public class Ex1 {

	static void m1(int n) {
		int digit, sum=0;
		while(n>0) {
			digit = n%10;
			sum = (digit*digit*digit) + sum;
			n = n/10;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		Ex1.m1(123);
	}

}
