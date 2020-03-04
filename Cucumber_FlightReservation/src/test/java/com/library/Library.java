package com.library;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.Testbase.TestBase;

public class Library extends TestBase {

	public static void clickonRegister() {
		driver.findElement(By.xpath(props.getProperty("Register"))).click();
	}

	public static void contactinfo(String Fn, String Ln, String p, String e) {
		driver.findElement(By.xpath("Fname")).sendKeys(Fn);
		driver.findElement(By.xpath("Lname")).sendKeys(Ln);
		driver.findElement(By.xpath("phone")).sendKeys(p);
		driver.findElement(By.xpath("email")).sendKeys(e);
	}

	public static void userinfo(String un, String pwd) {
		driver.findElement(By.xpath("uname")).sendKeys(un);
		driver.findElement(By.xpath("pwd")).sendKeys(pwd);
		driver.findElement(By.xpath("cpwd")).sendKeys(pwd);
	}

	public static void clickonSubmit() {
		driver.findElement(By.xpath(props.getProperty("Submit"))).click();
	}
	public static void verifysucessmsg(String un) {
		String text=driver.findElement(By.xpath(props.getProperty("successmessage"))).getText();
		boolean contains=text.contains(un);
		Assert.assertEquals(true, contains);
	}

}
//driver.findElement(By.xpath(""))
