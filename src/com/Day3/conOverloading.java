package com.Day3;

public class conOverloading {
	
	int a;
	int b;
	double c;
	
	conOverloading(int a, int b){
		
		this.a = a;
		this.b = b;
		
	}
	
	conOverloading(){
		a = 10;
		b = 20;
		c = 10.5;
	}
	
	conOverloading(int x, double y){
		
		a = x;
		c = y;
		
	}
	
	conOverloading(int x, int z, double y){
		
		a = x;
		c = y;
		b = z;
		
	}
	
	void display() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		
		
		conOverloading con1 = new conOverloading(100, 200, 298.454654);
		conOverloading con2 = new conOverloading(100, 100.33453);
		con2.display();
		con1.display();
	}

}
