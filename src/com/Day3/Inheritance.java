package com.Day3;

class A {
	int a;
	int b;
	
	public void diaplay() {
		System.out.println(a+b);
	}
}

class B extends A{
	int x;
	int y;
	
	public void show() {
		System.out.println(x+y);
	}
}

public class Inheritance {
	
	public static void main(String[] args) {
		A aobj = new A();
		aobj.a = 100;
		aobj.b = 50;
		aobj.diaplay();
		
		B bobj = new B();
		bobj.x = 100;
		bobj.y = 50;
		bobj.show();
		
		bobj.a = 200;
		bobj.b = 300;
		bobj.diaplay();
		
	}

}
