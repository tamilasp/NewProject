package RoughNotes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class IncovaCount {
	public static WebDriver driver;
	@BeforeSuite
	private void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "C:\\\\driver1\\\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		
	}
	@Test(retryAnalyzer = ItryAnotation.class)
	private void getUrl() {
		driver.get("http://automationpractice.com/"); 
		Assert.assertEquals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!", driver.getTitle());
	}
/*	}
	@Test
	private void signIn() {
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("9884762649");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("aspt1234");
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();		
	}*/
	
//	  @Test(retryAnalyzer = ItryAnotation.class) private void retry() {
//	  System.out.println("retry");
//	  
//	  }
//	 
	

}
