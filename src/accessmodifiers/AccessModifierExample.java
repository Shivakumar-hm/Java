package accessmodifiers;

/*class A {
	private int a =10;
	
	private void m1() {
		System.out.println(a);
	}
}*/

class A {
	protected int a = 10;
	protected void m1() {
		System.out.println(a);
	}
}

public class AccessModifierExample {
	
	public static void main(String[] args) {
		A obj = new A();
		obj.m1();      // cannot access because it is private method
		obj.a = 100;    // cannot access because it is private variable
		obj.m1();
	}

}
