package com.atmecs.validation;

public class classname {
	LogReports log = new LogReports();
	PageAction page;

	public void methordname(WebDriver driver) throws IOException {
		page = new PageAction(driver);
		LogReports log = new LogReports();

	}
}
