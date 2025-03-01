package combined;

import org.testng.annotations.Test;

/*
 * 1.Open App
 * 2.Login
 * 3.Logout
 */
public class FirstTestCase {

	@Test(priority = 1)
	void openApp() {
		System.out.println("Opening Application");
	}

	@Test(priority = 2)
	void login() {
		System.out.println("Login to Application");
	}

	@Test(priority = 3)
	void logout() {
		System.out.println("Logout from Application");
	}
}
