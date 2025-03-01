package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {

	@BeforeTest
	public void loginToApplication() {
		System.out.println("Login to application");
	}

	@AfterTest
	public void logoutFromApplication() {
		System.out.println("Logout from application");
	}

	@BeforeMethod
	public void connectToDB() {
		System.out.println("DB connected");
	}

	@AfterMethod
	public void disonnectFromDB() {
		System.out.println("DB disconnected");
	}

	@Test(priority = 1, description = "This is a login test", groups = "regression")
	public void test1() {
		System.out.println("test1");
	}

	@Test(priority = 2, description = "This is a logout test")
	public void test2() {
		System.out.println("test2");
	}
}