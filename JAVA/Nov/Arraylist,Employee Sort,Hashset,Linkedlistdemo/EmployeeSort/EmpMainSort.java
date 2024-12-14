import java.util.*;

class Employee implements Comparator<Employee>
{

	int eId;
	String eName;
	double salary;

	// Constructors
	Employee(){}

	Employee(int eId, String eName, double salary)
	{
		this.eId = eId;
		this.eName = eName;
		this.salary = salary;
	}

	// Getters & Setters
	void setEId(int eId)
	{
		this.eId = eId;
	}
	void setEName(String eName)
	{
		this.eName = eName;
	}
	void setSalary(double salary)
	{
		this.salary = salary;
	}

	int getEId()
	{
		return eId;
	}
	String getEName()
	{
		return eName;
	}
	double getSalary()
	{
		return salary;
	}

	// Automatically calls for String representation of the objects
	public String toString()
	{
		return "{" + eId + ", " + eName + ", " + salary + "}"; 
	}

	// Override compare method
	public int compare(Employee e1, Employee e2)
	{
		return Double.compare(e1.getSalary(), e2.getSalary());
	}

} //-end of Employee class


class SortByName implements Comparator<Employee>
{
	// override the compare method
	public int compare(Employee e1, Employee e2)
	{
		return e1.getEName().compareTo(e2.getEName());
	}
} //-end of SortByName class


class SortById implements Comparator<Employee>
{
	public int compare(Employee e1, Employee e2)
	{
		return Integer.compare(e1.getEId(), e2.getEId());
	}
} //-end of SortById class


class EmpMainSort
{
	public static void main(String[] args)
	{
		List<Integer> l1 = new ArrayList<>();
		l1.add(12);
		l1.add(17);
		l1.add(1);
		l1.add(0);
		l1.add(20);

		System.out.println("Before Sorting: " + l1);
		
		Collections.sort(l1);	// only for built-in types
		System.out.println("After Sorting: " + l1);

		// Creating a list of objects
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(1, "Anjana", 22000));
		empList.add(new Employee(3, "Fabian", 13000));
		empList.add(new Employee(2, "Gwen", 54000));
		empList.add(new Employee(4, "Ben", 5000));

		// ----------------------
		// --- Sort By Salary ---
		// ----------------------
		System.out.println("\n--- Employee --- \n<Sort By Salary>\nBefore Sorting: " + empList);
		//Collections.sort(empList) --> ERROR!
		
		// ... Implementing comparator/comparable interface
		
		Collections.sort(empList, new Employee());
		// we want to use employee's comparator		

		System.out.println("After Sorting: " + empList);
		
		// --------------------
		// --- Sort By Name ---
		// --------------------
		Collections.sort(empList, new SortByName());
		System.out.println("\n<Sort By Name>\n: " + empList);

		// ------------------
		// --- Sort By ID ---
		// ------------------
		Collections.sort(empList, new SortById());
		System.out.println("\n<Sort By ID>\n: " + empList);
	} //-end of main

} //-end of EmpMainSort