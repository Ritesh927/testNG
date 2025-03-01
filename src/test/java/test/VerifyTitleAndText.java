package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class VerifyTitleAndText {

	@Test
	public void titleTest() {

		SoftAssert softassert = new SoftAssert();
		String expectedTitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
		String expectedText = "Search";
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		String actualTitle = driver.getTitle();
		String actualText = driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).getAttribute("value");

		System.out.println("Verifying title");
		softassert.assertEquals(actualTitle, expectedTitle, "Title verification failed");

		System.out.println("Verifying text");
		softassert.assertEquals(actualText, expectedText, "Text verification failed");

		System.out.println("Closing browser");
		driver.close();

//		softassert.assertAll();
	}
}
