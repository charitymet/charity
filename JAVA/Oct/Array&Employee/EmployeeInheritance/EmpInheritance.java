
class Employee
{

	int eId;
	String eName;

	// salary will be computed
	double salary;


	// Constructors - salary varies depending on the type of employee
	Employee(int eId, String eName)
	{
		this.eId = eId;
		this.eName = eName;
	}

	
	// Getters
	int getEId()
	{
		return this.eId;
	}
	String getEName()
	{
		return this.eName;
	}
	double getSalary()
	{
		return this.salary;
	}


	// Utility methods
	void calcSalary(){}
}


class DailyWagesEmp extends Employee
{
	// Data members
	double numOfDays;
	double dailyWages;

	// Constructor
	// since it is default inherited, ou can get eId and eName
	DailyWagesEmp(int eId, String eName, double numOfDays, double dailyWages)
	{
		super(eId, eName);
		this.numOfDays = numOfDays;
		this.dailyWages = dailyWages;
	}

	// Override calculate salary
	void calcSalary()
	{
		// calculate and assign salary
		salary = dailyWages * numOfDays;
	}
}


class PermanentEmp extends Employee
{
	// data member
	double basicSalary;

	// static data
	static double DA = 164; // 164% or 1.64
	static double HRA = 30; // 30% or 0.3
	static double TA = 1600; // 1600
	static double PF = 12.5; // 12.5% or 0.125

	// Constructor
	PermanentEmp(int eId, String eName, double basicSalary)
	{
		super(eId, eName);
		this.basicSalary = basicSalary;
	}

	// override calcSalary method
	void calcSalary()
	{
		salary = basicSalary + (basicSalary * DA/100) + (basicSalary * HRA/100) + TA - (basicSalary * PF/100);
	}
}


class EmpInheritance
{
	public static void main(String[] args)
	{
		/*		
		Employee d1 = new DailyWagesEmp(101,"Anjana",12,900);
		d1.calcSalary();
		System.out.println("ID: " + d1.getEId() + " || Name: " + d1.getEName() + " || Salary: " + d1.getSalary());
		
		Employee d2 = new PermanentEmp(102,"Crystal",1000);
		d2.calcSalary();
		System.out.println("ID: " + d2.getEId() + " || Name: " + d2.getEName() + " || Salary: " + d2.getSalary());
		*/

		// Declaring an Array and instantiating it
		Employee[] emp = new Employee[2];
		
		// Access
		emp[0] = new DailyWagesEmp(101,"Anjana",12,900);
		emp[1] = new PermanentEmp(102,"Crystal",1000);

		// using collection based for loop
		for(Employee e : emp)
		{
			e.calcSalary();
			System.out.println("ID: " + e.getEId() + " || Name: " + e.getEName() + " || Salary: " + e.getSalary());
		}

	}
}