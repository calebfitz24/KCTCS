package caleb.employeeLab;

/**
 * 
 * @author cfitz
 *
 */

public class EmployeeGenerator {
	public static void main(String[] args) {
		Employee emp1 = new Employee("Bob", "Vance", 0_000_000_001);
		System.out.println("Employee 1: " + emp1);
		Employee emp2 = new Employee("Bob", "Vance", 0_000_000_001);
		System.out.println("Employee 2: " + emp2);
		Employee emp3 = emp2;
		System.out.println("Employee 3: " + emp3);

		System.out.println("Employee 3 equal employee 2? " + emp3.equals(emp2)); // symmetric
		System.out.println("Employee 2 equal employee 3? " + emp2.equals(emp3)); // reflexive, symmetric
		System.out.println("Employee 1 equal employee 3? " + emp1.equals(emp3)); // transitive
		System.out.println("Employee 1 equal employee 2? " + emp1.equals(emp2)); // transitive

		Object emp4 = (Object) emp1;
		Object emp7 = emp4;

		System.out.println("Object equals Employee1? " + emp4.equals(emp1));
		System.out.println("Object equals Employee 3?" + emp4.equals(emp3)); // thought this would be false, but it's
																				// not??
																				// because at runtime emp4 is an
																				// Employee

		Employee emp5 = new Employee("Phyllis", "Vance", 0_000_000_002);
		Employee emp6 = new Employee("Bob", "Vance", 0_000_000_003);
		System.out.println("5 = 6? " + emp5.equals(emp6));
		System.out.println("6 = 5? " + emp6.equals(emp5));
		System.out.println("1 = 6? " + emp1.equals(emp6));
	}
}