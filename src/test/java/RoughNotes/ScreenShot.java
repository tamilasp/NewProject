package RoughNotes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ScreenShot {
public static WebDriver driver;
public static Actions builder;

    @BeforeSuite(groups = "logIn")
	public static void getScreenShot() {
		System.setProperty("webdriver.chrome.driver", "C:\\driver1\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();		
	}
	@Test(priority = 1,groups = "logIn")
	@Parameters({"url"})
    private void getUrl(String url) {
    	driver.get(url);
    }
	@Test(priority = 2,groups = "sendValue")
	@Parameters({"username","password"})
	private void sendKey(String username,String password) throws InterruptedException {
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys(username);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		Thread.sleep(5000);
	}
	@Test(priority = 3,expectedExceptions = org.openqa.selenium.NoSuchElementException.class)
	@Parameters
	private void mouseHover() throws InterruptedException {
	Actions builder= new Actions(driver);
	builder.moveToElement(driver.findElement(By.xpath("//img[@alt='Electronics']"))).
	moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Laptop Accessories')]"))).build().perform();
	builder.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Mouse')]"))).click().build().perform();
	
	}
	@Test(dependsOnMethods = "mouseHover")
	@Parameters
	private void mouseHover1() throws InterruptedException {
	builder= new Actions(driver);
	builder.moveToElement(driver.findElement(By.xpath("//img[@alt='Electronics']"))).perform();
	builder.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Laptop Accessories')]"))).build().perform();
	builder.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Mouse')]"))).click().build().perform();
	Thread.sleep(4000);
	
	}
	@Test(priority = 4)
    @Parameters
	private void dragNdrop() throws InterruptedException {	
	WebElement src= driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[1]/div/div/div/section[2]/div[3]/div[1]/div[2]/div"));
	builder.dragAndDropBy(src, -80, 0).perform();
	}
	
	
	
}

