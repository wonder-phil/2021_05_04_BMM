package UnitTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import alg.ZeroOne;

class DotProduct_1_Test {

	@Test
	void test_normalize_0() {
		ZeroOne zeroOne = new ZeroOne(10);
		
		assertEquals(1, zeroOne.getValue());
	}
	
	@Test
	void test_normalize_1() {
		ZeroOne zeroOne = new ZeroOne(0);
		
		assertEquals(0, zeroOne.getValue());
	}
	
	
	@Test
	void test_dot_product() {
		ZeroOne zeroOne = new ZeroOne(0);
		
		assertEquals(0, zeroOne.getValue());
	}
}
