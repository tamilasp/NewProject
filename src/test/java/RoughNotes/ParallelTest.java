package RoughNotes;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ParallelTest {
	public static WebDriver driver;

	@BeforeSuite(groups = "test1")
	public void getScreenShot() {
		System.setProperty("webdriver.chrome.driver", "C:\\driver1\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test(priority = 1, groups = "test1")
	private void getUrl() throws InterruptedException {
		driver.get("https://google.com/");
		Thread.sleep(4000);
	}

	@Test(priority = 2, groups = "test1")
	private void load() {
		driver.findElement(By.name("q")).sendKeys("parallel testing usage in testNG");

	}

	@Test(dependsOnMethods = "load", groups = "test1")
	private void keyPress() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_ENTER);
	}

	@Test(groups = "test2")
	private void screenShot() {
		System.setProperty("webdriver.chrome.driver", "C:\\driver1\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test(groups = "test2")
	private void urlFind() {
		driver.get("https://flipkart.com/");
	}

}
