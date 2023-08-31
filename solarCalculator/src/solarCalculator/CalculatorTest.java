package solarCalculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void testSum() {
		assertEquals(10,Calculator.sum(5, 5));
		assertEquals(-5,Calculator.sum(10, -15));
		assertEquals(0,Calculator.sum(0, 0));
	}

	@Test
	void testSubtract() {
		assertEquals(5,Calculator.subtract(10, 5));
		assertEquals(-5,Calculator.subtract(0, 5));
		assertEquals(0,Calculator.subtract(5, 5));
	}

	@Test
	void testMultiply() {
		assertEquals(25,Calculator.multiply(5, 5));
		assertEquals(0,Calculator.multiply(10, 0));
		assertEquals(-15,Calculator.multiply(3, -5));
	}

	@Test
	void testDivide() {
		assertEquals(2.5,Calculator.divide(10, 4));
		assertEquals(0,Calculator.divide(0, 15));
		try {
			Calculator.divide(5, 0);
		} catch (IllegalArgumentException e) {
			assertEquals("Cannot divide by zero.", e.getMessage());
			}		
	}

}
