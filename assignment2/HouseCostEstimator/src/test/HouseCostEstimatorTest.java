package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import logic.HouseCostEstimator;

class HouseCostEstimatorTest {

	@Test
	void test() throws Exception {
		assertEquals(240000, HouseCostEstimator.calucateCost("basic", 200, false), 0.0001);
		assertEquals(900000, HouseCostEstimator.calucateCost("high", 500, false), 0.0001);
		assertEquals(442860.0, HouseCostEstimator.calucateCost("above", 295.24, false), 0.0001);
		assertEquals(738100.0, HouseCostEstimator.calucateCost("high", 295.24, true), 0.0001);
		assertThrows(Exception.class, () -> {
			HouseCostEstimator.calucateCost("basic", 200, true);
	    });
		assertThrows(Exception.class, () -> {
			HouseCostEstimator.calucateCost("above", 350, true);
	    });
		
	}

}
