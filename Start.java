import java.lang.*;
import classes.*;
import interfaces.*;
import fileio.*;
import java.util.*;

public class Start
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Bank b = new Bank();
		FileReadWriteDemo frwd = new FileReadWriteDemo();
		
		boolean choice = true;
		
		while(choice)
		{
			System.out.println("\n Choose among the Following Options: ");
			System.out.println(" ");
			System.out.println("1. Employee Management");
			System.out.println("2. Customer Management");
			System.out.println("3. Account Transactions");
			System.out.println("4. Exit");
			System.out.println(" ");
			
			System.out.print("You have choosed: ");
			int option = sc.nextInt();
			
			switch(option)
			{
				case 1:
				
					System.out.println(" ");
					System.out.println("_____EMPLOYEE MANAGEMENT_____");
					System.out.println(" ");
					System.out.println("Options for Employee Management\n");
					System.out.println("1. Insert New Employee ");
					System.out.println("2. Remove Existing Employee");
					System.out.println("3. Show All Employees");
					System.out.println("4. Go Back");
					System.out.println(" ");
					System.out.print("Enter your option: ");
					int input1 = sc.nextInt();
					
					switch(input1)
					{
						case 1:
							
							System.out.println(" ");
							System.out.println("Insert New Employee :-");
							
							System.out.print("Enter Employee ID: ");
							String empId1 = sc.next();
							
							System.out.print("Enter Employee Name: ");
							String name1 = sc.next();
							
							System.out.print("Enter Employee Salary: ");
							double salary = sc.nextDouble();
							
							Employee e1 = new Employee();
							e1.setEmpId(empId1);
							e1.setName(name1);
							e1.setSalary(salary);
							
							b.insertEmployee(e1);
							
							System.out.println(" ");
							break;
							
					

						case 2:
							
							System.out.println(" ");
							System.out.println("Remove Existing Employee");
							
							System.out.print("Enter Employee ID: ");
							String empId3 = sc.next();
							
							Employee e3 = b.getEmployee(empId3);
							b.removeEmployee(e3);
							
							//b.removeEmployee(b.getEmployee(empId3));
							
							System.out.println(" ");
							break; 	

						case 3:
							
							System.out.println(" ");
							System.out.println("Show All Employees");
							
							b.showAllEmployees();
							System.out.println(" ");
							break;	

						case 4:
							
							System.out.println(" ");
							System.out.println("Go Back");
							System.out.println(" ");
							break;
							
						default:
							System.out.println(" ");
							System.out.println("Invaild Choice");
							System.out.println(" ");
							break;
					}
					System.out.println(" ");
					break;
				
				case 2:
				
					System.out.println(" ");
					System.out.println("____CUSTOMER MANAGEMENT____");
					System.out.println("Options for Customer Management");
					System.out.println(" ");
					System.out.println("1. Insert New Customer ");
					System.out.println("2. Remove Existing Customer");
					System.out.println("3. Show All Customers");
					System.out.println("4. Go Back");
					System.out.println(" ");
					System.out.print("Enter your option: ");
					int input2 = sc.nextInt();
					
					switch(input2)
					{
						case 1:
							
							System.out.println(" ");
							System.out.println("Insert New Customer:-");
							
							System.out.print("Enter Customer Nid: ");
							int nid1 = sc.nextInt();
							
							System.out.print("Enter Customer Name: ");
							String name1 = sc.next();
			
							Customer c1 = new Customer();
							c1.setNid(nid1);
							c1.setName(name1);
				
							b.insertCustomer(c1);
							
							System.out.println(" ");
							break;
							
						

						case 2:
							
							System.out.println(" ");
							System.out.println("Remove Existing Employee");
							
							System.out.print("Enter Customer NID: ");
							int nid3 = sc.nextInt();
							
							Customer c3 = b.getCustomer(nid3);
							b.removeCustomer(c3);
							
							//b.removeCustomer(b.getcustomer(nid3));
							
							System.out.println(" ");
							break;	

						case 3:
							
							System.out.println(" ");
							System.out.println("Show All Customers");
							
							b.showAllCustomers();
							System.out.println(" ");
							break;	

						case 4:
							
							System.out.println(" ");
							System.out.println("Go Back");
							System.out.println(" ");
							break;
							
						default:
							System.out.println(" ");
							System.out.println("Invaild Choice");
							System.out.println(" ");
							break;
					}
					System.out.println(" ");
					break;
					
				
								
				case 3:
				
					System.out.println(" ");
					System.out.println("_____ACCOUNT TRANSACTIONS_____ ");
					
					
					System.out.println("Options for Account Transactions");
					System.out.println(" ");
					System.out.println("1. Deposit Money");
					System.out.println("2. Withdraw Money");
					System.out.println("3. Go Back");
					System.out.println(" ");
					
					System.out.print("Enter your option: ");
					int input4 = sc.nextInt();
					
					switch(input4)
					{
						case 1:
						
							System.out.println(" ");
							System.out.println("Deposit Money:-\n");
							
							System.out.print("Enter Customer NID: ");
							int nid1 = sc.nextInt();
							System.out.print("Enter Account Number: ");
							int an1 = sc.nextInt();
							System.out.print("Enter Deposit Amount: ");
							double amount1 = sc.nextDouble();
							
							if(amount1>0)
							{
								b.getCustomer(nid1).getAccount(an1).deposit(amount1);
								
								/*
								Customer cc = b.getCustomer(nid1);
								Account aa = cc.getAccount(an1);
								aa.deposit(amount1);
								*/
								
								//frwd.writeInFile("$"+amount1+" has been Deposited in Account Number "+ an1);
								frwd.writeInFile("Deposit	: $"+ amount1+" in "+ an1);
							}
							
							System.out.println(" ");
							break;
							
						case 2:
						
							System.out.println(" ");
							System.out.println("Withdraw Money");
							
							System.out.print("Enter Customer NID: ");
							int nid2 = sc.nextInt();
							System.out.print("Enter Account Number: ");
							int an2 = sc.nextInt();
							System.out.print("Enter Withdraw Amount: ");
							double amount2 = sc.nextDouble();
							
							if(amount2>0 && amount2 <= b.getCustomer(nid2).getAccount(an2).getBalance())
							{
								b.getCustomer(nid2).getAccount(an2).withdraw(amount2);
								
								/*
								Customer cc = b.getCustomer(nid2);
								Account aa = cc.getAccount(an2);
								aa.withdraw(amount2);
								*/
								
								frwd.writeInFile("Withdraw	: $"+ amount2+" from "+ an2);
							}
							
							System.out.println(" ");
							break; 
							
						case 4:
						
							System.out.println(" ");
							System.out.println("Show Transaction History");
							frwd.readFromFile();
							
							System.out.println(" ");
							break;
							
						case 3:
						
							System.out.println(" ");
							System.out.println("Going Back..");
							System.out.println(" ");
							break;
							
						default:
						
							System.out.println(" ");
							System.out.println("Invalid Option");
							System.out.println(" ");
							break;
					}
					
					System.out.println(" ");
					break;
								
				case 4:
				
					System.out.println(" ");
					System.out.println("Exit");
					choice = false;
					System.out.println(" ");
					break;
					
				default:
				
					System.out.println(" ");
					System.out.println("Invalid Option");
					System.out.println(" ");
					break;
			}
			
		}
		
		
	}
}
