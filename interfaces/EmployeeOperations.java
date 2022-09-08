package interfaces;
import classes.Employee;
public interface EmployeeOperations
{
	void setEmployee(Employee e);
	void getEmployee(String empId);
	void insertEmployee(Employee e);
	void removeEmployee(Employee e);
	void showAllEmployees();
}