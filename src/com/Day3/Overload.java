package com.Day3;

public class Overload {
	
	int a;
	int b;
	
	void sum() {
		a = 20;
		b = 40;
		System.out.println(a+b);
	}
	
	void sum(int x, int y) {
		int a = x;
		int b = y;
		
		System.out.println(a+b);
	}
	
	void sum(int x, int y, int z) {
		System.out.println(x+y+z);
	}
	
	void sum(int x, double y) {
		System.out.println(x+y);
	}
	
	public static void main(String[] args) {
		
		Overload over1 = new Overload();
		over1.sum();
		over1.sum(100, 200);
		over1.sum(100, 200, 300);
		over1.sum(100, 100.50);
		
	}

}


