package test;

import org.testng.annotations.Test;

public class GetDataFromClass {

	@Test(dataProvider = "dataSet", dataProviderClass = DataProviderClass.class)
	public void test(String username, String password) {
		System.out.println(username + "===========" + password);
	}

	@Test(dataProvider = "create", dataProviderClass = DataProviderClass.class)
	public void test1(String username, String password, String test) {
		System.out.println(username + "======" + password + "=======" + test);
	}
}
