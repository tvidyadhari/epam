package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import logic.InterestCalculator;

class InterestCalculatorTest {

	@Test
	void testSimpleInterest() {
		assertEquals(210, InterestCalculator.simpleInterest(3000, 1, 0.07), 0.001);
		assertEquals(2500, InterestCalculator.simpleInterest(10000, 5, 0.05), 0.001);
		assertEquals(1170, InterestCalculator.simpleInterest(15600, 1.5, 0.05), 0.001);

	}
	
	@Test
	void testCompoundInterest() {
		assertEquals(2382.032, InterestCalculator.compoundInterest(2000, 3, 0.06, 1), 0.001);
		assertEquals(2693.71, InterestCalculator.compoundInterest(2000, 5, 0.06, 4), 0.001);
		assertEquals(3210, InterestCalculator.compoundInterest(3000, 1, 0.07, 1), 0.001);
	}

}
