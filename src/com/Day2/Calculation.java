package com.Day2;

public class Calculation {
	
	int a;
	int b;
	
	
	
	
//---------------------------------------------------------------------------------------------------------------
	
	//A method may not take parameters
	
	
	/*void sum() {
		System.out.println(a+b);
	}*/

//---------------------------------------------------------------------------------------------------------------
	
	//A method may take parameters
	
	/*void sum(int x, int y) {
		
		a = x;
		b = y;
		System.out.println(a+b);
	}*/
	
	
	
//---------------------------------------------------------------------------------------------------------------
	
	//A method returns some value
	
	/*int sum() {
		return a+b;
	}*/
	
//---------------------------------------------------------------------------------------------------------------

	
	//A method may not returns any value
	
	void sum() {
		System.out.println(a+b);
	}
	
	
	
	public static void main(String[] args) {
		
		Calculation cal = new Calculation();
		cal.a = 100;
		cal.b = 200;
		cal.sum();
		
		/*Calculation cal1 = new Calculation();
		
		cal1.sum(100, 200);*/
		
		
		/*Calculation cal3 = new Calculation();
		cal3.a = 100;
		cal3.b = 200;
		int r = cal3.sum();
		
		System.out.println(r);*/
	}

}
