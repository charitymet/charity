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


	// Utility methods
	// A method to deposit money in account
	void deposit(double amt)
	{
		// this.acBal = this.acBal + amt; --> you are changing the state of the balance, hence no return type
		this.acBal += amt; 
	}

	// A method to withdraw money from account
	boolean withdrawal(double amt)
	{
		if(this.acBal-amt >= 0)
		{
			// perform withdraw if you have sufficient funds
			this.acBal -= amt;
			return true;
		}
		else
		{
			return false;
		}
	}

	boolean transfer(Account target, double amt)
	{
		// Withdraw from this obj
		// deposit in target
		if(this.withdrawal(amt))
		{
			target.deposit(amt);
			return true;
		}
		else
		{
			return false;
		}
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
		
		
		System.out.println("Details =========");
		getDetails(a1);
		getDetails(a2);
		System.out.println("=================");
	

		// Deposit
		a1.deposit(2500);
		System.out.println("\nAmount after depositing: " + a1.getAcBal());

		// Withdrawal
		if(a1.withdrawal(150))
		{
			System.out.println("\nWithdrawing...\nWithdrawal Successful!!!");

		}
		else
		{
			System.out.println("Withdrawal Unsuccessful. INSUFFICIENT FUNDS.");
		}
		System.out.println("Balance after Withdrawal: " + a1.getAcBal() + "\n");
		
		// System.out.println("Ac No: " + a1.acNo); --> better to use Getters


		if(a1.transfer(a2, 150))
		{
			System.out.println("Transfer SUCCESSFUL!!!");
		}
		else
		{
			System.out.println("Transfer UNSUCCESSFUL.");
		}

		System.out.println("A1's current bal: " + a1.getAcBal());
		System.out.println("A2's current bal: " + a2.getAcBal());

	}

	static void getDetails(Account user)
	{
		System.out.println("Ac No.: " + user.getAcNo());
		System.out.println("Ac Name.: " + user.getAcName());
		System.out.println("Ac Balance: " + user.getAcBal() + "\n");
	}

	
}