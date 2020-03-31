package main;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FactorialsTest {

	@Test
	public void test() {

		assertEquals(24, Factorials.factorialStarter(4));
		assertEquals(120, Factorials.factorialStarter(5));
	}

}
