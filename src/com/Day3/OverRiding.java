package com.Day3;

class Bank {
	int getRateOfIntrest() {
		return 0;
	}
}

class SBI extends Bank {
	int getRateOfIntrest() {
		return 10;
	}	
}

class ICICI extends Bank {
	int getRateOfIntrest() {
		return 15;
	}
}

class HDFC extends Bank {
	int getRateOfIntrest() {
		return 12;
	}
}
public class OverRiding {
	
	public static void main(String[] args) {
		
		SBI sbiobj = new SBI();
		System.out.println(sbiobj.getRateOfIntrest()); 
		
		ICICI iciciobj = new ICICI();
		System.out.println(iciciobj.getRateOfIntrest());
		
		HDFC hdfcobj = new HDFC();
		System.out.println(hdfcobj.getRateOfIntrest());
		
	}
	
	

}
