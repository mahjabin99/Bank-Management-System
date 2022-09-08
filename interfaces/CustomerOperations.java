package interfaces;
import classes.*;
public interface CustomerOperations
{
	void setCustomer(Customer c);
	void getCustomer(int nid);
	void insertCustomer(Customer c);
	void removeCustomer(Customer c);
	void showAllCustomers();
}