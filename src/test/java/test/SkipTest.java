package test;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipTest {

	boolean datasetup = false;

	// 1st way
	// Not implemented test cases
	@Test(enabled = false)
	public void skipTest1() {
		System.out.println("Skipping this test as it is not complete.");
	}

	// 2nd way
	// using throw keyword
	@Test
	public void skipTest2() {
		System.out.println("Skipping this test forcefully.");
		throw new SkipException("Skipping this test.");
	}

	// 3rd way
	// Based on certain condition
	@Test
	public void skipTest3() {
		System.out.println("Skipping this test based on condition.");
		if (datasetup) {
			System.out.println("Execuet the test.");
		} else {
			System.out.println("Do not execute further steps.");
			throw new SkipException("Do not execute further steps.");
		}
	}
}
