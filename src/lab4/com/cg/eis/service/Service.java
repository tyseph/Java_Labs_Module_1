package lab4.com.cg.eis.service;

import lab4.com.cg.eis.bean.Employee;

interface EmpService {

}

public class Service implements EmpService {

	String name;
	double salary;
	String designation;
	String insType;

	Employee obj;

	public Service(String name, double salary, String designation) {
//		System.out.println("Service called...");
		obj = new Employee(name, salary, designation);
		this.name = name;
		this.salary = salary;
		this.designation = designation;
	}

	public void getEmployee() {
		obj.insScheme();
		System.out.println(obj.toString());
	}
}
