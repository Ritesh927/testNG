package test;

import org.testng.annotations.Test;

import common.BaseTest;

public class ListenersDemoTest extends BaseTest{

	@Test
	public void launchApp() {
		driver.get("https://ebay.com");
	}
}