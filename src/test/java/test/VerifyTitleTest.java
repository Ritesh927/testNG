package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyTitleTest {

	@Test
	public void titleTest() {

		String expectedTitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		String actualTitle = driver.getTitle();

		Assert.assertEquals(actualTitle, expectedTitle);

		driver.close();
	}
}
