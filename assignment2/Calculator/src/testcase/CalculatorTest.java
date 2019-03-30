package testcase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import logic.Calculator;

class CalculatorTest {
	
	@Test
	void testAdd() {
		assertEquals(0, Calculator.add(-1, 1));
		assertEquals(55, Calculator.add(45, 10));
		assertEquals(10, Calculator.add(5, 5));
	}
	
	@Test
	void testMultiply() {
		assertEquals(15, Calculator.multiply(3, 5));
		assertEquals(0, Calculator.multiply(3, 0));
		assertEquals(-15, Calculator.multiply(3, -5));
	}	
	
	@Test
	void testDivide() {
		assertEquals(0, Calculator.divide(0, 1));
		assertEquals(5, Calculator.divide(25, 5));
		assertEquals(2, Calculator.divide(25, 11));
		assertThrows(ArithmeticException.class, () -> {
	        Calculator.divide(1, 0);
	    });
	}

}
