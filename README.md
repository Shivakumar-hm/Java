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

A class is collection of variables and methods
----------------------------------------------

Syntax of a class
-----------------

public class className {
//Methods 
//Variables
//Constructors
}

Example :

public class Employee {
  
  int empid;                    //variables
	String empname;
	int salary;
	int deptno;
	
	
	void display() {              // method
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(salary);
		System.out.println(deptno);
}

-------------------------------------------------------------------------------------------------------------------------------------------------------------------

Methods :

A method is a piece of code which will perform certain task
method should be part of a class
---------------------------
Syntax of Method

void m1() {
//code
//return 1;
}

How many ways we can initialize the values to class variables
-------------------------------------------------------------
1) Using object (directly)
2) Using Constructor
3) Using Method


Methods 
---------
1) A method takes Parameters 
2) A method may not take parameters 
3) A method returns some value
4) A method may not return any value
-------------------------------------------------------------------------------------------------------------------------------------------------------------------

Objects :

An object is an instance of class
----------------------------

syntax of Object
-----------------

className objectName = new className();

example:

Employee emp1 = new Employee();

Employee ----> class name
emp1 --------> reference variable of an object 
Employee() --> instantiation


