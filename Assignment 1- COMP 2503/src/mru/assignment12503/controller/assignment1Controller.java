package mru.assignment12503.controller;

import mru.assignment12503.model.Employee;

public class assignment1Controller {

	public assignment1Controller() {
		
	}
	
	public void calculateGrossWeeklyPay(double hoursWorked) {
		
	}
	
	public double salaryEmployee(Employee e) {
		
		double weeklyPay= e.getSalaryRate()/52;
		//no overtime 
		if(e.getMaxHours()>168) {
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("+_________YOU CANNOT WORK ANYMORE HOURS________+");
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
		}	
		return weeklyPay;
		
	}
	
	public double hourlyEmployee() {
		
	}
	
	public double consultantEmployee() {
		
	}
	
	
	
	
}
