package lab4.com.cg.eis.bean;

import java.util.UUID;

public class Employee {
	UUID id;
	String name;
	double salary;
	String designation;
	String insType;

	public Employee(String name, double salary, String designation) {
		super();
//		System.out.println("Employee called...");
		this.id = UUID.randomUUID();
		this.name = name;
		this.salary = salary;
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", designation=" + designation
				+ ", insType=" + insType + "]";
	}

	public void insScheme() {
		if (this.salary > 500)
			this.insType = "Below 500";
		else
			this.insType = "Above 500";
	}
}
