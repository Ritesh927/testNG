package testngnaveen;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/*
@BeforeSuite -- Setup system property for chrome
@BeforeTest -- Launch chrome browser
@BeforeClass -- Url Entered

@BeforeMethod -- Login to app
@Test -- Google Title Test
@AfterMethod -- Logout from app

@BeforeMethod -- Login to app
@Test -- Search test
@AfterMethod -- Logout from app

@BeforeMethod -- Login to app
@Test -- Google logo test
@AfterMethod -- Logout from app

@AfterClass -- Delete all cookies
@AfterTest -- Close Browser
 */
public class TestNGbasics {

	// Pre conditions annotations --starting with @Before
	@BeforeSuite // 1
	public void setUp() {
		System.out.println("@BeforeSuite -- Setup system property for chrome");
	}

	@BeforeTest // 2
	public void launchBrowser() {
		System.out.println("@BeforeTest -- Launch chrome browser");
	}

	@BeforeClass // 3
	public void enterUrl() {
		System.out.println("@BeforeClass -- Url Entered");
	}

	@BeforeMethod // 4
	public void login() {
		System.out.println("@BeforeMethod -- Login to app");
	}

	// Test cases -- starting with @Test

	@Test(priority = 1) // 5
	public void googleTitleTest() {
		System.out.println("@Test -- Google Title Test");
	}

	@Test(priority = 2)
	public void searchTest() {
		System.out.println("@Test -- Search test");
	}

	@Test(priority = 3)
	public void googleLogoTest() {
		System.out.println("@Test -- Google logo test");
	}

	// Post conditions -- starting with @After
	@AfterMethod // 6
	public void logout() {
		System.out.println("@AfterMethod -- Logout from app");
	}

	@AfterClass //
	public void deleteAllCookies() {
		System.out.println("@AfterClass -- Delete all cookies");
	}

	@AfterTest //
	public void closeBrowser() {
		System.out.println("@AfterTest -- Close Browser");
	}

	@AfterSuite
	public void generateTestReport() {
		System.out.println("@AfterSuite -- Generate test report");
	}
}
