class Account 
{
	// Data members AKA Instance variables
	// ideally these should be private
	int acNo;
	String acName;
	double acBal;

	// define a constructor with 3 args.
	// called at the time of object creation only
	Account(int acNo, String acName, double acBal) // Local Variable
	{
		this.acNo = acNo;
		this.acName = acName;
		this.acBal = acBal;
	}

	// define getters and setters
	int getAcNo()
	{
		return this.acNo;
	}
	void setAcNo(int acNo) // ideally we do not need to setAcNo()
	{
		this.acNo = acNo;
	}

	String getAcName()
	{
		return this.acName;
	}
	void setAcName(String acName)
	{
		this.acName = acName;
	}

	double getAcBal()
	{
		return this.acBal;
	}
	void setAcBal(double acBal)
	{
		this.acBal = acBal;
	}

	
}


class AccountTest
{
	public static void main(String[] args)
	{
		// Account acc = new Account(); --> Error
		Account a1 = new Account(101,"ABC",2000);
		Account a2 = new Account(102,"PQR",3000);
		
		System.out.println("--- Account Information ---");
		
		getDetails(a1);
		getDetails(a2);
		System.out.println("\n");
		
		// System.out.println("Ac No: " + a1.acNo); --> better to use Getters

	}

	static void getDetails(Account user)
	{
		System.out.println("Ac No.: " + user.getAcNo());
		System.out.println("Ac Name.: " + user.getAcName());
		System.out.println("Ac Balance: " + user.getAcBal() + "\n");
	}

	
}