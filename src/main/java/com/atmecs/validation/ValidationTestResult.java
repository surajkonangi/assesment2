package com.atmecs.validation;

public class ValidationTestResult {
	static LogReports log = new LogReports();
	Readproperties read = new Readproperties();

	public static  boolean validateData(String actual,String expected, String message) {
		try {
			/*
			 * 
			 * print actual and expected value
			 * 
			*/
			Assert.assertEquals(actual, expected);
			
			return true;
		} catch (AssertionError assertionError) {
			
			return false;
		}
	}
}
