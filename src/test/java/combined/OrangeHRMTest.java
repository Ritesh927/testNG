package combined;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/*
 * 1.Opening webpage
 * 2.Verify Logo
 * 3.Login
 * 4.Logout
 * 5. Close
 */

public class OrangeHRMTest {

	WebDriver driver;

	@Test(priority = 1, description = "Opening website")
	void openPage() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}

	@Test(priority = 2, description = "Checking logo is visible or not on this website")
	void testLogo() throws InterruptedException {
		Thread.sleep(3000);
		boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		if (status) {
			System.out.println("Logo is displayed....");
		} else {
			System.out.println("Logo is not displayed....");
		}
	}

	@Test(priority = 3, description = "Login to the website")
	void testLogin() {
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	}

	@Test(priority = 4, description = "Logout from this website")
	void testLogout() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
	}

	@Test(priority = 5, description = "Closing the website")
	void closePage() {
		driver.close();
	}
}
