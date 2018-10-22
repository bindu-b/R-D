package com.example.demo.service;

import com.example.demo.model.Product;

public class test2 {
	public String findBygetPname(String pname)
	{
		Product p=new Product(100,"fans","Electronocs and Appliances",3000.0,"fans","bindu","9481151309","bin@gmail.com");
		return p.getPname();
	}
	
	public String findBygetPcategory(String pcategory)
	{
		Product p=new Product(100,"fans","Electronics and Appliances",3000.0,"fans","bindu","9481151309","bin@gmail.com");
		return p.getPcategory();
	}
	
	public double findBygetPrice(double price)
	{
		Product p=new Product(100,"fans","Electronics and Appliances",3000.0,"fans","bindu","9481151309","bin@gmail.com");
		return p.getPrice();
	}
	
	public String findBygetUname(String uname)
	{
		Product p=new Product(100,"fans","Electronics and Appliances",3000.0,"fans","bindu","9481151309","bin@gmail.com");
		return p.getUname();
	}
	public String findBygetUphone(String uphone)
	{
		Product p=new Product(100,"fans","Electronics and Appliances",3000.0,"fans","bindu","9481151309","bin@gmail.com");
		return p.getUphone();
	}
	public String findBygetUemail(String uemail)
	{
		Product p=new Product(100,"fans","Electronics and Appliances",3000.0,"fans","bindu","9481151309","bin@gmail.com");
		return p.getUemail();
	}
}
