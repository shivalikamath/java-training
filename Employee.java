package lti.org;

public class Employee {
	private int empNo;
	private String empName;
	private double salary;
	private static int autogen;
	
	static {
		System.out.println("Employee Class Loaded...");
		autogen=101;
	}

	public Employee() {
	}

	public Employee(String empName, double salary) {
		this.empNo = autogen++;
		this.empName = empName;
		this.salary = salary;
	}

	public void payslip() {
		System.out.println("EmpNo:" + empNo);
		System.out.println("EmpName:" + empName);
		System.out.println("Salary:" + salary);
	} 
	public double getSalary() {
		return salary;
	}
}
