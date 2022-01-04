package com.Day1;

public class objectClass {
	public static void main(String[] args) {
		
		Object o[] = new Object[5];
		
		o[0]= 10;
		o[1] = 10.55;
		o[2] = 'A';
		o[3] = true;
		o[4] = "Hello";
		
		for(Object i:o) {
			System.out.println(i);
		}
				
		Object a[] = {"hello", 10.505, 100, 'A', false};
		
		for(Object j:a) {
			System.out.println(j);
		}
		
		
	}

}
