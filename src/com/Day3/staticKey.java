package com.Day3;

public class staticKey {
	
	
	int a;
	static int b;
	
	static void m1() {
		System.out.println("This is a static method");
	}
	
	void m2() {
		System.out.println("This is a non-static method");
	}
	
	void m3() {
		a = 10;
		b = 1000;
		m1();
		m2();
		System.out.println(a);
		System.out.println(b);
	}
	
	
	
	
	public static void main(String[] args) {
		b = 100;
		System.out.println(b);
		m1();
		
		staticKey stat1 = new staticKey();
		stat1.a = 100;
		System.out.println(stat1.a);
		stat1.m2();
		stat1.m3();
	}
}
