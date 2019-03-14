package CurrencyConverter;
import static org.junit.jupiter.api.Assertions.*;

import javax.swing.JOptionPane;

import org.junit.jupiter.api.Test;

class TestCase {

	@Test
	void test() {
		Convert con = new Convert();
		
		//Valid Input
		double result1 = con.USDtoTAKA(5);
		assertEquals(416.5, result1);
		
		double result2 = con.EUROtoTAKA(10);
		assertEquals(960.6, result2);
		
		double result3 = con.RUPEEtoTAKA(8);
		assertEquals(9.36, result3);
		
		double result4 = con.TAKAtoUSD(5);
		assertEquals(416.5, result4);
		
		double result5 = con.TAKAtoEURO(5);
		assertEquals(416.5, result5);
		
		double result6 = con.TAKAtoRUPEE(5);
		assertEquals(416.5, result6);
		
		//negative input
		
		double result7 = con.USDtoTAKA(-5);
		assertEquals(0, result7);
		
			
		}
	import static org.junit.jupiter.api.Assertions.*;

	import javax.swing.JOptionPane;

	import org.junit.jupiter.api.Test;

	class TestCase {

		@Test
		void test() {
			Convert con = new Convert();
			
			//Valid Input
			double result1 = con.USDtoTAKA(5);
			assertEquals(416.5, result1);
			
			double result2 = con.EUROtoTAKA(10);
			assertEquals(960.6, result2);
			
			double result3 = con.RUPEEtoTAKA(8);
			assertEquals(9.36, result3);
			
			double result4 = con.TAKAtoUSD(5);
			assertEquals(416.5, result4);
			
			double result5 = con.TAKAtoEURO(5);
			assertEquals(416.5, result5);
			
			double result6 = con.TAKAtoRUPEE(5);
			assertEquals(416.5, result6);
			
			//negative input
			
			double result7 = con.USDtoTAKA(-5);
			assertEquals(0, result7);
			
				
			}
			