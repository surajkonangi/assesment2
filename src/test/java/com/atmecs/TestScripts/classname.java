package com.atmecs.TestScripts;

public class classname {
	PageAction page;
	Readproperties read;
	WaitMethods wait;
	String url;

	@SuppressWarnings("static-access")
	@BeforeClass
	public void before() throws IOException {
		url = read.readPropertiesFile("Url1", ConstantPaths.CONFIG_FILE);
		driver.get(url);
	}

	@SuppressWarnings("static-access")
    @Test
	public void methordname() throws IOException {

	}
}
