package currencyconverter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class test {

	@Test
	void test() {
		CurrencyConverter CC = new CurrencyConverter();
		
		double result1 = CC.USDtoTAKA(5);
		assertEquals(400, result1);
		
		double result2 = CC.EUROtoTAKA(10);
		assertEquals(960.6, result2);
		
		double result3 = CC.RUPEEtoTAKA(8);
		assertEquals(9, result3);
		
		
	}

}
