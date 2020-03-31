package main;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FactorialsTest {

	@Test
	public void test() {

		assertEquals("10!", Factorials.factorialStarter(3628800));
		assertEquals("12!", Factorials.factorialStarter(479001600));

		assertEquals("3!", Factorials.factorialStarter(6));
		assertEquals("NONE", Factorials.factorialStarter(18));
	}

}
