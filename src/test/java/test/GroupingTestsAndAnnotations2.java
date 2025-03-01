package test;

import org.testng.annotations.Test;

import common.CommonDataSetup;

@Test(groups = "user_registration")
public class GroupingTestsAndAnnotations2 extends CommonDataSetup{

	@Test(priority = 1, groups = "regression")
	public void test1() {
		System.out.println("test 1");
	}

	@Test(priority = 2, groups = "regression")
	public void test2() {
		System.out.println("test 2");
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
