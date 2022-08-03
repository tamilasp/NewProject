package RoughNotes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataProvider0 {
public static WebDriver driver;	
	@BeforeSuite()
	public void getScreenShot() {
		System.setProperty("webdriver.chrome.driver", "C:\\driver1\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Test
	private void getUrl() {
		driver.get("https://www.facebook.com/");
	}
	@Test(dataProvider = "data")
	private void signIn(String username, String password) {
	driver.findElement(By.id("email")).sendKeys(username);
	driver.findElement(By.id("pass")).sendKeys(password);

	}
	@DataProvider
	private Object data() {		
		
		return new Object[][] {
			
			{"tamil","1234"},{"praveen","2345"}
		};
		
		

	}

}
