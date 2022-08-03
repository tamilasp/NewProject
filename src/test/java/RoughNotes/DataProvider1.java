package RoughNotes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 {
public static WebDriver driver;
	@BeforeSuite
	private void getBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\driver1\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();

	}
	@Test
	private void getUrl() {
		driver.get("https://iopen.impactiva.com/");
	}
	@Test(dataProvider = "data")
	private void signIn(String username, String password) {
		driver.findElement(By.id("id=\"txtTMNumber\"")).sendKeys(username);
		driver.findElement(By.id("id=\"txtPassword\"")).sendKeys(password);	
	}
	@DataProvider
	private Object data() {
	
		return new Object[][]{
			
			{"tamil","1234"},{"praveen","2345"}
			
		};

	}
	
	
	
	
	
	

}
