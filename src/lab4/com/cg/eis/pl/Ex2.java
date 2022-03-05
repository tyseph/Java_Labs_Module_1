package lab4.com.cg.eis.pl;

import java.util.Scanner;

import lab4.com.cg.eis.service.Service;

public class Ex2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Employee Name: ");
		String name = sc.next();
		System.out.print("Enter Salary: ");
		double salary = sc.nextDouble();
		System.out.print("Enter Designation: ");
		String designation = sc.next();
		sc.close();

		Service emp = new Service(name, salary, designation);
		Service emp2 = new Service("Sajal", 600, "emp2");

		emp.getEmployee();
		emp2.getEmployee();

	}
}
