package test;

import org.testng.annotations.Test;

public class OrderOfExecution {

	// According to alphabetical order.
	@Test
	public void m() {
		System.out.println("M");
	}

	@Test
	public void p() {
		System.out.println("P");
	}

	@Test
	public void a() {
		System.out.println("A");
	}

	@Test
	public void x() {
		System.out.println("X");
	}
}
