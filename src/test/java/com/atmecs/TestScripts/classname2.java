package com.atmecs.TestScripts;

public class classname2 {
	PageAction page;
	Readproperties read;
	WaitMethods wait;
	String url;
	@SuppressWarnings("static-access")
	@BeforeClass
	public void before() throws IOException {
	url=read.readPropertiesFile("Url2",ConstantPaths.CONFIG_FILE);
	driver.get(url);
	}  
	@SuppressWarnings("static-access")
	@Test(dataProvider = "dataprovidersname", dataProviderClass = DataProvides.class)
	public void methordname(String[] values) throws IOException, InterruptedException {
		Readproperties read = new Readproperties();
		page = new PageAction(driver);
		read = new Readproperties();
		wait = new WaitMethods();

		
	}
}
