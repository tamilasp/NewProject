package com.AnnotationsTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class SimpleAnnotation {
public static WebDriver driver;
@BeforeSuite
public static void launch() {
	
	System.setProperty("webdriver.chrome.driver", "C:\\driver1\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.manage().window().maximize();}
@BeforeClass
public static void getUrl() throws InterruptedException {
	driver.get("http://automationpractice.com/");
	Thread.sleep(2000);
}
@Test
public static void Signin() {
	driver.findElement(By.xpath("//a[@title='Log in to your customer account']")).click();
}
@Test
public static void namemail() {
	driver.findElement(By.name("email")).sendKeys("tamil98");;
}

}
