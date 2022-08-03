package RoughNotes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParameters {
	public static WebDriver driver;

	@BeforeSuite()
	public static void getScreenShot() {
		System.setProperty("webdriver.chrome.driver", "C:\\driver1\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test()
	@Parameters({ "username", "password" })
	private void signIn(String username, String password) {
		System.out.println("username =" + username);
		System.out.println("password =" + password);
	}

	@Test()
	@Parameters({ "url" })
	private void getUrl(String url) {
		System.out.println(url);
	}

}
