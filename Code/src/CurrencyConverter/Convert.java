package CurrencyConverter;


import java.util.Scanner;

public class Convert  {
	
	public double USDtoTAKA(double input) {
		return input*83.3;
		
	}
	
	public double EUROtoTAKA(double input) {
		return input*96.06;
	}
	
	public double RUPEEtoTAKA(double input) {
		return input*1.17;
	}
	
	public double TAKAtoUSD(double input) {
		return input*0.12;
		
	}
	
	public double TAKAtoEURO(double input) {
		return input*0.09606;
	}
	
	public double TAKAtoRUPEE(double input) {
		return input*0.84;
	}
	
	
}