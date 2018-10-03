package com.example.bank;

public class CurrentAccount extends BankAccount{

@Override
	public void withdraw(double amount) {
		System.out.println("Current account withdraw method");
		
	}
	
	/*double odlimit;
	public CurrentAccount(String accName, double accBal,double odlimit) {
		super(accName,accBal);
		deposit(3000);
		this.odlimit=odlimit;
		
	}*/
	

}
