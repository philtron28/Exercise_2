package gr.upatras.first;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class SignClassTest {

	@Test
	void testSignMethod1() {
		assertEquals("POSITIVE", SignClass.signMethod(6, 4), "6 - 4 must be POSITIVE");
	}
	
	@Test
	void testSignMethod2() {
		assertEquals("NEGATIVE", SignClass.signMethod(4, 6), "4 - 6 must be NEGATIVE");
	}
	
	
}
