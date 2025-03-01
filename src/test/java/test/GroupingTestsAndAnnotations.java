package test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

@Test(groups = "user_registration")
public class GroupingTestsAndAnnotations {

	@BeforeClass
	public void beforeClass() {
		System.out.println("Run this before class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("Run this after class");
	}

	@BeforeGroups(value = "regression")
	public void beforeGroups() {
		System.out.println("Run this method before regression");
	}

	@AfterGroups(value = "regression")
	public void afterGroup() {
		System.out.println("Run this method after regression");
	}

	@Test(priority = 1, groups = "regression")
	public void test1() {
		System.out.println("test 1");
	}

	@Test(priority = 2, groups = "regression")
	public void test2() {
		System.out.println("test 2");
		Assert.assertTrue(false);
	}

	@Test(groups = { "regression", "bvt" })
	public void test3() {
		System.out.println("test 3");
	}

	@Test(groups = "bvt")
	public void test4() {
		System.out.println("test 4");
	}
}
