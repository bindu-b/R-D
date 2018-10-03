package com.example.bank;

public class SavingsAccount extends BankAccount {

	@Override
	public void withdraw(double amount) {
		System.out.println("Savings account withdraw method");
		
		
	}
	
	public void idSalary()
	{
		System.out.println("Salary account");
	}
	//double interest;
	/*public SavingsAccount(String accName, double accBal,double intrest)
	{
		super(accName,accBal);
		withdraw(1000);
		this.interest=intrest;
	}
	
	*/

}
