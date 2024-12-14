class Employee
{
	// --- Instance variables ---
	String firstName;
	String lastName;
	double monthlySalary;
	static double hikePercent = 0.1;

	// --- Constructor ---
	Employee(String firstName, String lastName, double monSal)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		if(this.monthlySalary < 0)
		{
			this.monthlySalary = 0.0;
		}
		else
		{
			this.monthlySalary = monSal;
		}
		
	}

	// --- Getters and Setters ---
	void setFirstName(String fName)
	{
		this.firstName = fName;
	}
	String getFirstName()
	{
		return this.firstName;
	}

	void setLastName(String lName)
	{
		this.lastName = lName;
	}
	String getLastName()
	{
		return this.lastName;
	}

	void setMonthlySalary(double monSal)
	{
		if(this.monthlySalary < 0)
		{
			this.monthlySalary = 0.0;
		}
		else
		{
			this.monthlySalary = monSal;
		}

	}
	double getMonthlySalary()
	{
		return this.monthlySalary;
	}

	// --- Utility Methods ---
	double yearlySalary()
	{
		return this.monthlySalary * 12;
	}

	// Then give each Employee a 10% raise and display each Employee’s yearly salary again.
	static void raise()
	{
		double raiseAmt = this.monthlySalary * hikePercent;
		this.monthlySalary += raiseAmt;
	}

}


class EmployeeTest
{
	public static void main(String[] args)
	{
		Employee e1 = new Employee("Anjana", "JK", 1000);
		Employee e2 = new Employee("Crystal", "Russo", 2000);

		displayDetails(e1);
		//displayDetails(e2);
		e1.raise();
		
	}

	static void displayDetails(Employee emp)
	{
		System.out.println("Monthly Salary: " + emp.getMonthlySalary());
		System.out.println("Yearly Salary: " + emp.yearlySalary());
	}
}