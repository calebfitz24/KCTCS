import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class EmployeeMap {

	public static void main(String[] args) {
		//Create 3 Employees
		Employee emp1 = new Employee("Caleb", "Fitzgerald", 1123L);
		Employee emp2 = new Employee("Ed", "Lance", 1234L);
		Employee emp3 = new Employee("Matthew", "Jackson", 2345L);
		
		//Make a map
		Map<Long, Employee> employees = new HashMap<>();
		
		//Put those employees in map
		employees.put(emp1.getEmpId(), emp1);
		employees.put(emp2.getEmpId(), emp2);
		employees.put(emp3.getEmpId(), emp3);
		
		System.out.println(employees);
		//get 1 employee by their ID
		//String val = (String)newmap.get(3);
		Employee r1 = employees.get(1123L);
		System.out.println(r1);
		
		System.out.println(1123L == r1.getEmpId());
		System.out.println(r1.equals(emp1));
		
		//Find out if an employee is in the map
		System.out.println(employees.containsKey(2345L));
		System.out.println(employees.containsKey(123L));
		
		//Given a map, print out all the values

		Iterator mapPrint = employees.entrySet().iterator();
			while(mapPrint.hasNext()) {
			Map.Entry me = (Entry) mapPrint.next();
			System.out.println(me.getValue().toString());
			}
		//TODO Use a keyset instead
	}

}
