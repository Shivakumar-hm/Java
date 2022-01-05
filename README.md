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

This keyword:
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
