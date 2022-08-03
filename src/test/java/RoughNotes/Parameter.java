package RoughNotes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {
WebDriver driver;	
	@BeforeSuite
	private void getBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\\\driver1\\\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	@Test
	private void getUrl() {
		driver.get("https://adactinhotelapp.com/");

	}
	@Test(dependsOnMethods = "getUrl")
	@Parameters({"username","password"})
	private void credential(String username,String password) {
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login")).click();
		
	}

}
