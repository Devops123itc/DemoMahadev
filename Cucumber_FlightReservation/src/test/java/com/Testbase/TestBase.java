package com.Testbase;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestBase {
	public static FileInputStream fip;
	public static Properties props;
	public static String Browser;
	public static WebDriver driver;
	
	@Test
	public static void openBrowser() throws Throwable{
		fip=new FileInputStream("src\\test\\java\\com\\config\\0r.properties");
		props=new Properties();
		props.load(fip);
		Browser=props.getProperty("Browser");
		if (Browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "chromedriver_79.exe");
			driver = new ChromeDriver(); // OpenBrowser
		} else if (Browser.equalsIgnoreCase("mozilla")) {
			System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (Browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		driver.get(props.getProperty("url")); // open url
		driver.manage().window().maximize(); // maximize browser
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	}
public  void CloseBrowser() {
	driver.quit();
}
}
