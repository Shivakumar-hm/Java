package com.Day4;

interface testinter {
	int a = 10;
	void display();
}



public class Interface implements testinter {
	
	public void display() {
		System.out.println(a);
	}
	public static void main(String[] args) {
		testinter testobj = new Interface();
		testobj.display();
		System.out.println();
	}
}
