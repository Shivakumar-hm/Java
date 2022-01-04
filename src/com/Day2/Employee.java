package com.Day2;

public class Employee {
	
	int empid;
	String empname;
	int salary;
	int deptno;
	
	/*Employee(int id, String empname, int sal, int dno){
		empid = id;
		this.empname = empname;
		salary = sal;
		deptno = dno;
		
	}*/
	
	
	void setdata(int id, String empname, int sal, int dno) {
		empid = id;
		this.empname = empname;
		salary = sal;
		deptno = dno;
		
	}
	
	
	void display() {
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(salary);
		System.out.println(deptno);
	}
	
	
	
	public static void main(String[] args) {
		
		
		//Assigning values to class variables using object
		/*Employee emp1 = new Employee();
		
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
		
		
		//Assigning values to class variables using constructor
		
		Employee emp3 = new Employee(101, "Shiva", 100000, 30);
		emp3.display();
		
		Employee emp4 = new Employee(105, "ShivaKumar", 200000, 40);
		emp4.display();*/
		
		
		//Assigning values to class variables using method
		
		Employee emp5 = new Employee();
		emp5.setdata(106, "Roja", 10000, 10);
		emp5.display();
	}

}
