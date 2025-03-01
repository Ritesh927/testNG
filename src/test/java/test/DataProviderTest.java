package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

	@Test(dataProvider = "dataSet")
	public void test(String username, String password) {
		System.out.println(username + "===========" + password);
	}

	@Test(dataProvider = "dataSet1")
	public void test1(String username, String password, String test) {
		System.out.println(username + "======" + password + "=======" + test);
	}

	// 1st way
	@DataProvider
	public Object[][] dataSet() {
		Object[][] dataset = new Object[4][2];

		// 1st row
		dataset[0][0] = "user1";
		dataset[0][1] = "pass1";
		// 2nd row
		dataset[1][0] = "user2";
		dataset[1][1] = "pass2";
		// 3rd row
		dataset[2][0] = "user3";
		dataset[2][1] = "pass3";
		// 4th row
		dataset[3][0] = "user4";
		dataset[3][1] = "pass4";

		return dataset;
	}

	// 2nd way
	@DataProvider
	public Object[][] dataSet1() {
		Object[][] dataset1 = {
				{ "user1", "pass1", "test1" },
				{ "user2", "pass2", "test2" },
				{ "user3", "pass3", "test3" },
				{ "user4", "pass4", "test4" }
				};
		return dataset1;
	}
}
