package testngnaveen;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTitleTest {

	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
	}

	@Test(priority = 1)
	public void googleTitleTest() {
		String title = driver.getTitle();
		System.out.println(title);

		Assert.assertEquals(title, "Google", "Title is not matched");
	}

	@Test(priority = 2)
	public void googleLogoTest() {
		boolean logo = driver.findElement(By.xpath("//img[@class='lnXdpd']")).isDisplayed();

//		Assert.assertEquals(logo, true, "Logo is not displayed");
		Assert.assertTrue(logo, "Logo is not displayed");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
