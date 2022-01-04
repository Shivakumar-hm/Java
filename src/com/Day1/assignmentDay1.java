package com.Day1;

public class assignmentDay1 {
	public static void main(String[] args) {
		//Swapping Numbers
		
		int a = 10, b = 20;
		
		System.out.println("Value of a = 10 and b = 20 before swapping");
		
		int c;
		c = a;
		a = b;
		b = c;
		
		System.out.println("Value of a is" + " " + a + " " + "and b is"+ " " + b + " " + "after swapping");
		
		
		//----------------------------------------------------------------------------------
		
		//Even or odd
		
		
		int num = 1;
		
		if(num % 2 == 0) {
			System.out.println(num +" " + "is even number");
		}
		else
		{
			System.out.println(num + " " + "is odd number");
		}
		
		//----------------------------------------------------------------------------------
		//Largest of three numbers
		
		
		int val1 = 15;
		int val2 = 20;
		int val3 = 100;
		
		if((val1>val2) && (val1>val3)) {
			System.out.println(val1 + " " + "is the largest");
		}
		else if ((val2>val1) && (val2>val3)) {
			System.out.println(val2 + " " + "is the largest");
		}
		else {
			System.out.println(val3 + " " + "is the largest");
		}

		
		
	}

}
