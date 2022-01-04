package com.Day1;

public class arrays {
	public static void main(String[] args) {
		//Array is a variable with set of elements which contains multiple elements all comes under same data types
		
		
		
		int a[] = new int[10]; //1D array
		
		a[0] = 10;
		a[1] = 100;
		a[2] = 30;
		a[3] = 20;
		a[4] = 400;
		
		for (int i = 0; i<=4; i++) {
		System.out.println(a[i]);
		}
		
		
		//--------------------------------------
		//for .... each loop
		
		int b[] = new int[10];
		b[0] = 10;
		b[1] = 100;
		b[2] = 30;
		b[3] = 20;
		b[4] = 400;
		for(int j:b) {
			System.out.println(j);
			
		}
		
		//--------------------------------------
		
		String s[] = new String[3];
		s[0] = "Welcome";
		s[1] = "to";
		s[2] = "training";
		
		System.out.println(s.length);
		
		for(String k:s) {
			System.out.println(k);
		}
		
		int c[] = {100, 200, 300, 400, 500};
		int sum = 0;
		
		for(int l:c) {
			System.out.println(l);
			sum+=l;
		}
		System.out.println(sum);
	}

}
