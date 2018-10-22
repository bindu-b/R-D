package com.example.demo;
import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class testProducts {
	

	

	
		@Test
		public void testGetPname() {
			//ProductService productService=new ProductService();
			testCases t=new testCases();
			String pname="fans";
			assertEquals(pname,t.findBygetPname("fans"));
			
		}
		@Test
		public void testGetPcategory() {
			//ProductService productService=new ProductService();
			testCases t=new testCases();
			String pcategory="Electronics and Appliances";
			assertEquals(pcategory,t.findBygetPcategory("Electronics and Appliances"));
			
		}
		
		@Test
		public void testGetPrice() {
			//ProductService productService=new ProductService();
			testCases t=new testCases();
			double price=3000;
			assertEquals(price,t.findBygetPrice(3000),0);
			
		}
		
		@Test
		public void testGetUname() {
			//ProductService productService=new ProductService();
			testCases t=new testCases();
			String uname="bindu";
			assertEquals(uname,t.findBygetUname("bindu"));
			
		}
		@Test
		public void testGetUphone() {
			//ProductService productService=new ProductService();
			testCases t=new testCases();
			String uphone="9481151309";
			assertEquals(uphone,t.findBygetUphone("9481151309"));
			
		}
		@Test
		public void testGetUemail() {
			//ProductService productService=new ProductService();
			testCases t=new testCases();
			String uemail="bin@gmail.com";
			assertEquals(uemail,t.findBygetUemail("bin@gmail.com"));
			
		}
		/*@Test
		public void testGetYear() {
			//ProductService productService=new ProductService();
			test2 t=new test2();
			String year="2000";
			assertEquals(year,t.findBygetYear("2000"));
			
		}*/


	}



