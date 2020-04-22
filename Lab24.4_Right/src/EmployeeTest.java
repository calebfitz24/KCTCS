import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeTest {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Caleb", "Fitzgerald", 0_000_000_001));
		employees.add(new Employee("Bob", "Vance", 0_000_000_001));
		employees.add(new Employee("Bob", "Lance", 0_000_000_001));
		employees.add(new Employee("Phyllis", "Cance", 0_000_000_002));
		employees.add(new Employee("Bob", "Chance", 0_000_000_003));

		System.out.println(employees);
		Collections.sort(employees);
		System.out.println(employees);
		System.out.println("Sort by ID: ");
		Collections.sort(employees, new EmployeeSortId());
		System.out.println(employees);
		Collections.sort(employees, new EmployeeSortFn());
		System.out.println("Sort by First Name: ");
		System.out.println(employees);
//		Employee emp1 = new Employee("Bob", "Vance", 0_000_000_001);
//		for (Employee emp : employees) {
//			if (emp1.equals(emp)) {
//				System.out.println("We've already seen employee: " + emp);
//			} else {
//				System.out.println("New employee! " + emp);
//			}
//		}
	}
}
