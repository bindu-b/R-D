package com.example.bank;

/**this comment is for documentation
 * 
 * @author biumesh
 * @since 03-10-2018
 *@
 */
public abstract class BankAccount {
	int accNo;
	String accName;
	double accBal;
	static int autoAccNoGen;
	{
		accNo=++autoAccNoGen;
	}
	
	public BankAccount() {
		
		accName="Unknown";
		accBal=0;
	}

	public BankAccount(String accName, double accBal) {
		super();
		
		this.accName = accName;
		this.accBal = accBal;
	}
	
	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public double getAccBal() {
		return accBal;
	}

	public int getAccNo() {
		return accNo;
	}

	

	public abstract void withdraw(double amount);
	
		
		
	
	
	public void deposit(double amount)
	{
		accBal+=amount;
		System.out.println(accBal);
		
	}
	
	@Override
	public String toString() {
		return "BankAccount [accNo=" + accNo + ", accName=" + accName + ", accBal=" + accBal + "]";
	}
	
	
	

	

	
	
	

}
