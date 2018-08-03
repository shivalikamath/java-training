import lti.org.*;
public class TestEmployee {
	public static void main(String args[]) {
		Employee e1 = new Employee("Polo", 5000);
		e1.payslip();

		Manager mgr = new Manager("Lili", 7000, 2000);

		showSalary(mgr);
		Executive e = new Executive("Mili", 9000, 3000);

		showSalary(e);
	}

	private static void showSalary(Employee emp) {
		if (emp instanceof Manager)
			System.out.println("Manager Salary" + emp.getSalary());
		else
			System.out.println("Executive Salary" + emp.getSalary());
	}

	// private static void showSalary(Executive e) {
	// System.out.println("Executive Salary"+e.getSalary());
	// }
	//
	// private static void showSalary(Manager mgr) {
	// System.out.println("Executive Salary"+mgr.getSalary());
	// }
}
