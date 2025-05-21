package com.constructor;

public class Employee {
	public  String name;
	public double salary;
	
	public Employee(String na,double sal) {
		name=na;
		salary=sal;
	}
	
	public void displayDetails() {
		if(salary<0) {
			salary=0;
		}
		System.out.println("Name of the Employee :" + name );
		System.out.println("Salary of the Employee :" +salary);
	}
	public static void main(String[] args) {
		Employee emp = new Employee("Ganesh",-65);
		emp.displayDetails();
		
	}
}
