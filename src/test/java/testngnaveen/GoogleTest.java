package testngnaveen;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {

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

	@Test(priority = 1, groups = "Title Test")
	public void googleTitleTest() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	@Test(priority = 2, groups = "Logo Test")
	public void googleLogoTest() {
		boolean logo = driver.findElement(By.xpath("//img[@class='lnXdpd']")).isDisplayed();
		if (logo) {
			System.out.println("Logo is displayed");
		} else {
			System.out.println("Logo is not displayed");
		}
	}

	@Test(priority = 3, groups = "Link Test")
	public void googleGmailTest() {
		boolean gmail = driver.findElement(By.xpath("//a[text()='Gmail']")).isDisplayed();
		if (gmail) {
			System.out.println("Gmail is displayed");
		} else {
			System.out.println("Gmail is not displayed");
		}
	}

	@Test(priority = 4, groups = "Test")
	public void test1() {
		System.out.println("Test 1");
	}

	@Test(priority = 4, groups = "Test")
	public void test2() {
		System.out.println("Test 2");
	}

	@Test(priority = 4, groups = "Test")
	public void test3() {
		System.out.println("Test 3");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
