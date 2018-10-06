package com.date.demo.testclass;

import com.date.demo.pojoclass.MyDate;

public class MyDateTestRecord {
	public MyDate startDate;
	public MyDate endDate;
	public long expectedResult;
	
	public MyDateTestRecord(MyDate startDate, MyDate endDate, int expectedResult) {
		
		this.startDate = startDate;
		this.endDate = endDate;
		this.expectedResult = expectedResult;
	}
	
	

}
