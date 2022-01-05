package com.Day3;

class A {
	int a;
	int b;
	
	public void diaplay() {
		System.out.println(a+b);
	}
}

class B extends A {
	int x;
	int y;
	
	public void show() {
		System.out.println(x+y);
	}
}

class C extends B {
	int l;
	int m;
	
	public void addition() {
		System.out.println(l+m);
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
		
		C cobj = new C();
		cobj.a = 200;
		cobj.x = 200;
		cobj.l = 300;
		cobj.m = 100;
		cobj.addition();
		
		
	}

}
