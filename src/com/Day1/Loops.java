package com.Day1;

public class Loops {
	public static void main(String[] args) {
		
		
		//While loop
		//for loop
		//do  .... while loop
		//for .... each loop
		
		
		
		//while loop
		
		//print 1-10 
		//----------------------------------------------------------------------------------
		
		int num = 1;
		
		while(num<=10) {
			
			System.out.println(num);
			num++;
		}
		
		System.out.println("program exited because "+num+ " " + "is greater than 10");
		
		//----------------------------------------------------------------------------------
		//print even numbers less than 10
		
        int even = 2;
		
		while(even<=10) {
			
			System.out.println(even);
			even+=2;
		}
		
		System.out.println("program exited because "+even+ " " + "is greater than 10");
		
		//----------------------------------------------------------------------------------
		
		//do....while
		
		int x = 2;
		
		do {
			System.out.println(x);
			x++;
		}while(x<=10);
		
		//----------------------------------------------------------------------------------
		
        int y = 2;
		
		do {
			System.out.println(y);
			y+=2; // i=i+2
		}while(y<=10);
		
		//----------------------------------------------------------------------------------
		//for loop
		
		for(int a=1; a<=10 ; a++) {
			System.out.println(a);
			
		}
		
		//----------------------------------------------------------------------------------
		
		//Break and Continue Statement
		
		for(int b = 1; b<=10; b++) {
			if(b==5) {
				break;
			}
			System.out.println(b);
			
		//----------------------------------------------------------------------------------	
			
		for(int c = 1; c<=10; c++) {
			if(c==5) {
				continue;
			}
			System.out.println(c);	
		}
		
		}
	}

}
