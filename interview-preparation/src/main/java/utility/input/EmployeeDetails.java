package utility.input;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDetails {
	
	public static List<Employee> getEmployeeDetailsArrayList(){
		Employee employee;
		List<Employee> list = new ArrayList();
		list.add(new Employee(1001, "Gautam", "Raj", "Gautam.Raj@quintiles.com", null));
		list.add(new Employee(1010, "Sonu", "Singh", "SonuSingh@google.com", null));
/*		list.add(new Employee(employeeId, empFirstName, empLastName, empEmailId, address));
		list.add(new Employee(employeeId, empFirstName, empLastName, empEmailId, address));
		list.add(new Employee(employeeId, empFirstName, empLastName, empEmailId, address));
		list.add(new Employee(employeeId, empFirstName, empLastName, empEmailId, address));
		list.add(new Employee(employeeId, empFirstName, empLastName, empEmailId, address));
		list.add(new Employee(employeeId, empFirstName, empLastName, empEmailId, address));
		list.add(new Employee(employeeId, empFirstName, empLastName, empEmailId, address));
		list.add(new Employee(employeeId, empFirstName, empLastName, empEmailId, address));
		list.add(new Employee(employeeId, empFirstName, empLastName, empEmailId, address));*/
		return null;
	}
	
	
}