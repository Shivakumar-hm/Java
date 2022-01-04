package com.Day1;

public class conditionalOperators {
	
	public static void main(String[] args) {
		
		//if condition
		//if .... else condition
		//nested if ..else
		//switch case
		
		//case1: age>18 --> eligible to vote
		
		int age = 35;
		
		if(age>=18) {
			System.out.println("eligible for voting");
			
		}
		System.out.println("program exited");
		
		
		//case1: age>18 --> eligible to vote
		//case2: age<17 --> print not eligible to vote
		
		if(age>=18) {
			System.out.println("eligible for voting");
		}
		else {
			System.out.println("Not eligible for voting");
		}
		
		
		//Nested if .... else
		//case1: 1-7 , 1->Monday to 7-> Sunday
		
		int day = 3;
		
		if(day == 1) {
			System.out.println("Monday");
		}
		else if(day == 2) {
			System.out.println("Tuesday");
		}
		else if(day == 3) {
			System.out.println("Wednesday");
		}
		else if(day == 4) {
			System.out.println("Thursday");
		}
		else if(day == 5) {
			System.out.println("Friday");
		}
		else if(day == 6) {
			System.out.println("Saturday");
		}
		else {
			System.out.println("Tuesday");
		}
		
		switch(day) {
		case 1: System.out.println("Sunday");
		break;
		case 2: System.out.println("Monday");
		break;
		case 3: System.out.println("Tuesday");
		break;
		case 4: System.out.println("Wednesday");
		break;
		case 5: System.out.println("Thursday");
		break;
		case 6: System.out.println("Friday");
		break;
		default: System.out.println("Saturday");
		}
		
	}

}
