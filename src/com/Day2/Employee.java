package com.Day2;

public class Employee {
	
	int empid;
	String empname;
	int salary;
	int deptno;
	
	
	void display() {
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(salary);
		System.out.println(deptno);
	}
	
	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		
		emp1.empid = 101;
		emp1.empname = "Unknown";
		emp1.salary = 65000;
		emp1.deptno = 10;
		emp1.display();
		
		Employee emp2 = new Employee();
		emp2.empid = 102;
		emp2.empname = "known";
		emp2.salary = 165000;
		emp2.deptno = 20;
		emp2.display();
	}

}
