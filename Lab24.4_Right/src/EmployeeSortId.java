import java.util.Comparator;

public class EmployeeSortId implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return (int) (o1.getEmpId()-o2.getEmpId());
	}

	
}
