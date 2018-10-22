package com.example.demo;


import com.example.demo.model.Product;


public class testCases {
	
	public class test2 {
		public String findBygetPname(String pname)
		{
			Product p=new Product(100,"fans","Electronocs and Appliances",3000.0,"fans","bindu","9481151309","bin@gmail.com","brand",2016);
			return p.getPname();
		}
		
		public String findBygetPcategory(String pcategory)
		{
			Product p=new Product(100,"fans","Electronics and Appliances",3000.0,"fans","bindu","9481151309","bin@gmail.com","brand",2018);
			return p.getPcategory();
		}
		
		public double findBygetPrice(double price)
		{
			Product p=new Product(100,"fans","Electronics and Appliances",3000.0,"fans","bindu","9481151309","bin@gmail.com","brand",2000);
			return p.getPrice();
		}
		
		public String findBygetUname(String uname)
		{
			Product p=new Product(100,"fans","Electronics and Appliances",3000.0,"fans","bindu","9481151309","bin@gmail.com","brand",2014);
			return p.getUname();
		}
		public String findBygetUphone(String uphone)
		{
			Product p=new Product(100,"fans","Electronics and Appliances",3000.0,"fans","bindu","9481151309","bin@gmail.com","brand",2018);
			return p.getUphone();
		}
		public String findBygetUemail(String uemail)
		{
			Product p=new Product(100,"fans","Electronics and Appliances",3000.0,"fans","bindu","9481151309","bin@gmail.com","brand",2000);
			return p.getUemail();
		}
	}


}
