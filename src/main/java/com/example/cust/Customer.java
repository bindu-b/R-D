package com.example.cust;

import com.example.bank.BankAccount;
import com.example.bank.CurrentAccount;
import com.example.bank.CurrentAccountVer2;
import com.example.bank.SavingsAccount;
import com.example.bank.SavingsAccountVer2;

public class Customer {
	public static void main(String[] args)
	{
		BankAccount acc=null;
		acc=new SavingsAccount();
		acc.withdraw(5000);
		//acc.isSalary();
		
		SavingsAccountVer2 acc1=new SavingsAccountVer2();
		acc1.withdraw(3000);
		acc1.getInsuranceNo();
		acc1.getInsuranceName();
		acc1.getInsuranceAmount();
		
		CurrentAccountVer2 acc2=new CurrentAccountVer2();
		acc2.getInsuranceNo();
		acc2.getInsuranceName();
		acc2.getInsuranceAmount();
		
	}

}
