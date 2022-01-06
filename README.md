# Java
Example programs written for the following concepts

1. Data Types
2. Operators
3. Loops
4. Conditions
5. 1D Array
6. 2D Array
7. String Methods 
8. Object class
9. OOPS| Class & Object | Methods & Constructor














-------------------------------------------------------------------------------------------------------------------------------------------------------------------

OOPS concepts:
---------------

 

Class : 
-------

A class is collection of variables and methods

Syntax of a class


	public class className {
	//Methods 
	//Variables
	//Constructors
	}

Example :

     public class Employee {
  
         	int empid;                 //variables
	 	String empname;
	 	int salary;
	 	int deptno;
	
	
     void display() {              // method
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(salary);
		System.out.println(deptno);
		}
	}

How many ways we can initialize the values to class variables
-------------------------------------------------------------
1) Using object (directly)
2) Using Constructor
3) Using Method

-------------------------------------------------------------------------------------------------------------------------------------------------------------------

Methods :
----------

1. A method is a piece of code which will perform certain task

2. Method should be part of a class

Syntax of Method

	void m1() {
	//code
	//return 1;
	}

1) A method takes Parameters 
2) A method may not take parameters 
3) A method returns some value
4) A method may not return any value




-------------------------------------------------------------------------------------------------------------------------------------------------------------------



Objects : 
---------

An object is an instance of a class.

syntax of Object


className objectName = new className();

example:

	Employee emp1 = new Employee();

	Employee ----> class name
	emp1 --------> reference variable of an object 
	Employee() --> instantiation
	
-------------------------------------------------------------------------------------------------------------------------------------------------------------------

Method Overloading:
-------------------

A class contains more than one method with the same name is called Method Overloading.

	class Test{
		void m1(int a, int b) {
		//code
		//code
		}
		
		void m1(int x, int y, int z) {
		//code
		//code
		}
		
		void m1(int a, double b) {
		//code
		//code
		}
	}
	
	Test t = new Test();
	t.m1();

1. Number of Parameters
2. Order of Parameters
3. datatype of Parameters


Constructor Overloading:
------------------------

A class contains more than one constructor is called Constructor Overloading.

1. Constructor is special kind of method.
2. Constructor name should be same as class name.
3. Constructor will not return any value.
4. Constructor will be invoked at the time of object creation (We no need to call the constructor explicitly).
5. Constructor will take the Parameters (Just like a method).
6. Constructor is used for initialzing the value.

Two types of Constructors
1. Default Constructor.
2. Parameterized Constructor.

this keyword:
------------

when the external/ class variable and variable inside the constructor/method are same, we will use "this" keyword.

Example:

	public class conOverloading {
	
		int a;
		int b;
		double c;
	
		conOverloading(int a, int b){
		
			this.a = a;
			this.b = b;
		
		}
		
		void display() {
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		}
		
		public static void main(String[] args) {
			conOverloading con2 = new conOverloading(100, 200);
			con2.display();
		}

	}


static Keyword:
---------------
gernerally we can define a variable or method as static.
1. static variables and methods are shared across all the objects.
2. static variables and methods can directly access through class name.
3. static methods can access only static stuff directly.
4. static methods can access non-static stuff but using Object.
5. non-static methods can access everything directly.

		static int a;

		static void m1() {
		//code;
		//code;
		}
	
What is the advantage of using stating keyword?


System.out.println()
---------------------

		class Test{
		static String s = "Welcome";
		}
		
		Test.s.length();
		
		
		class System{
		static PrintStream out;
		}
		
		System.out.println()
		
		System ---> class (pre-defined)
		out ------> static keyword
		println()-> method

public static void main(String[] args)
--------------------------------------

JDK, JRE & JVM:
--------------

JDK : Java Development Kit (full software includes JRE & JVM, used for developing java application/software).

JRE : Java Runtime Environment (internally has JVM, It provides environment to run/install java based applications.

JVM : Java Virtual Machine (Responsible for executing Java programs).

Inheritance :
-------------

Acquiring methods and variables from parent class to child class is called Inheritance.

	class A{                  // Parent class/ Super class / Base class
	code;
	code;
	}

	class B extends A{        // Child class/ Sub class/ derived class
	code;
	code;
	}

	class C extends B{        // Child class/ Sub class/ derived class
	code;
	code;
	}


Types:
--
1. Single Inheritance 
2. Multi level Inheritance 
3. Multiple Inheritance (Using Interface)
4. Hierarchical Inheritance 
5. Hybrid Inheritance (Using Interface)


Method Overriding :
-------------------
Re-define the same method form parent class into child class.


	class A {
		void m1(){
		code;
		}
		code;
		code;
	}

	class B extends A {
		void m1() {
		code;
		}
		code;
		code;
	}

	public class MethodOverloading {
	public static void main(String[] args){

		A aobj = new aobj();
		aobj.m1();  
		}
	}	

final Keyword:
--------------

variable, method & class

	final int a = 10;     //value of the variable is constant (we cannot change)

	final void m1() {     //method we cannot override in the child class
	code;
	}

	final class Test {    //class cannot be extended 
	code;
	}


Interface:
----------

1. Blue print of class

		interface TestInt {

		//variables;
		//methods//

		}
2. Interface contains only static and final variables (by default)
3. In Interface by default methods are public.
4. In interface methods are by default abstract.

abstract: 
---------
A method have only definition but not implementation.

void m1();

	interface TestInt {

	void m1();

	}

	class TestClass implements TestInt
	{
	void m1() {
	//implement the body;
	}
	}

5. We cannot instansiate interface
	
		TestInt testobj = new TestInt();  //not valid
		TestInt testobj = new TestClass();  //valid

Access modifiers:
----------------
1. public 
2. default
3. private 
4. protected


Multiple inheritance using interface :
--


Packages :
--
collection of classes 

2 types:

1. user defined.
2. pre defined/default Packages --> import statement is used for using built-in packages.
