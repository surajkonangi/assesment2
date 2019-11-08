package com.atmecs.testdata;




import org.testng.annotations.DataProvider;

import com.atmecs.utils.ConstantPaths;


public class DataProvides {

	@DataProvider(name = "dataprovidername")
	public Object[][] gethomepagedata() {
		TestDataProvider provideData = new TestDataProvider(ConstantPaths.TESTDATA_FILE, 0);
		Object[][] getData = provideData.provideData();
		return getData;
	}

	@DataProvider(name = "dataprovidername")
	public Object[][] getheroingdata() {
		TestDataProvider provideData = new TestDataProvider(ConstantPaths.TESTDATA_FILE, 1);
		Object[][] getData = provideData.provideData();
		return getData;
	}
}
