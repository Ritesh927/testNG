package test;

import org.testng.annotations.DataProvider;

public class DataProviderClass {

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
	@DataProvider(name = "create")
	public Object[][] dataSet1() {
		Object[][] dataset1 = { { "user1", "pass1", "test1" },
				{ "user2", "pass2", "test2" },
				{ "user3", "pass3", "test3" },
				{ "user4", "pass4", "test4" }
				};
		return dataset1;
	}
}
