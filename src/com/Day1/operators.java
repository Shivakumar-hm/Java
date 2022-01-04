package com.Day1;

public class operators {
	
	
	public static void main(String[] args) {
		
		
		//Arithmetic operators
		
		int a = 10, b = 20;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		//Relational Operators (always returns boolean value True/False)

		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a==b);
		System.out.println(a!=b);
		
		//Logical Operators (always returns boolean value True/False)
		
		boolean x = true;
		boolean y = false;
		
		System.out.println(x && y);
		System.out.println(x || y);
		System.out.println(!x);
		System.out.println(!y);
		
		
		//Assignment Operators
		
		int c = 100;
		//c = c+1;
		c++;
		c--;
		c+=5;
		
		
		System.out.println(c);
		System.out.println(c*=5);
		System.out.println(c/=5);
		System.out.println(c%=100);
	}
	
	
	
	

}
