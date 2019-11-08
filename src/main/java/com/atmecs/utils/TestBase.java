package com.atmecs.utils;

public class TestBase {
	public WebDriver driver;
	LogReports log = new LogReports();

	@SuppressWarnings("deprecation")
	//@Parameters("browsername")
	@BeforeTest
	public void invokeBrowser() throws IOException {
         String modeofrunning="browser";
         if(modeofrunning.equalsIgnoreCase("grid")) {
        	 //driver =SeleniumGrid.getGrid(browsername);
        	 //System.out.println(driver);
         }
	      
         else { 
        	 String browsername = Readproperties.readPropertiesFile("Browser", ConstantPaths.CONFIG_FILE);
		if (browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", ConstantPaths.CHROME_FILE);
			driver = new ChromeDriver();
			log.info("Chrome browser launched...");

		} else if (browsername.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", ConstantPaths.FIREFOX_FILE);
			driver = new FirefoxDriver();
			log.info("Firefox browser launched...");

		} else if (browsername.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver", ConstantPaths.IE_FILE);
			DesiredCapabilities ieCaps = DesiredCapabilities.internetExplorer();
			ieCaps.setCapability(InternetExplorerDriver.INITIAL_BROWSER_URL, "");
			driver = new InternetExplorerDriver(ieCaps);
			log.info("IE browser started...");
		}
		//driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.MINUTES);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		log.info("Application is open...");
	}

//	@AfterSuite
//	public void closeBrowser() {
//		driver.quit();
//	}

}
}
