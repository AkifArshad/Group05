package CurrencyConverter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCase {

	@Test
	void test() {
		Convert con = new Convert();
		
		double result1 = con.USDtoTAKA(5);
		assertEquals(416.5, result1);
		
		double result2 = con.EUROtoTAKA(10);
		assertEquals(960.6, result2);
		
		double result3 = con.RUPEEtoTAKA(8);
		assertEquals(9.36, result3);
	}

}
