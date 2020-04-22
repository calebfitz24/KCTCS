import java.util.HashMap;
public class Employee implements Comparable<Employee> {
	private long empId;
	private String firstName;
	private String lastName;

	public Employee(String firstNameIn, String lastNameIn, long empIdIn) {
		super();
		this.setFirstName(firstNameIn);
		this.setLastName(lastNameIn);
		this.setEmpId(empIdIn);
	}

	@Override
	public int hashCode() {
		final int prime = 17;
		int result = 1;
		result = (prime * result) + (int) (empId ^ (empId >>> 32)); // >>> is unsigned bit shift
		result = (prime * result) + ((firstName == null) ? 0 : firstName.hashCode());
		result = (prime * result) + ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Employee other = (Employee) obj;
		if (empId != other.empId) {
			return false;
		}
		if (firstName == null) {
			if (other.firstName != null) {
				return false;
			}
		} else if (!firstName.equals(other.firstName)) {
			return false;
		}
		if (lastName == null) {
			if (other.lastName != null) {
				return false;
			}
		} else if (!lastName.equals(other.lastName)) {
			return false;
		}
		return true;
	}

	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empIdIn) {
		this.empId = empIdIn;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String toString() {
		return lastName + ", " + firstName + " ID: " + empId;
	}

	@Override
	public int compareTo(Employee emp0) {
		// TODO Auto-generated method stub
		//System.out.println(emp0 instanceof Comparable);
		return lastName.compareTo(emp0.getLastName());
	}
	

}
