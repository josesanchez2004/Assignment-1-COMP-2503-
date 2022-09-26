package mru.assignment12503.controller;

import java.util.Scanner;

import mru.assignment12503.model.Employee;

public class assignment1Controller {

	Scanner in;
	
	public assignment1Controller() {
		in = new Scanner(System.in);
	}
	
	public void calculateGrossWeeklyPay(double hoursWorked) {
		
	}
	
	public double salaryEmployee(Employee e) {
		System.out.println("+++++++++++++++++++++++++++++++++++++++");
		System.out.println("How many hours did you work this week: ");
		System.out.println("+++++++++++++++++++++++++++++++++++++++");		
		double hours = in.nextDouble();
		
		double numOfWeeks = 52;
		double maxHours = e.getMaxHours();
		double weeklyPay= e.getPayRate()/52;
		
		//no overtime 
		if(hours>maxHours) {
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("+_________YOU CANNOT WORK ANYMORE HOURS________+");
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
		}	
		return weeklyPay;
		
	}
	
	public double hourlyEmployee(Employee e) {
		
		int maxHours = 60;
		int fortyHourWeek = 40;
		double hourlyPay = e.getPayRate();
		System.out.println("+++++++++++++++++++++++++++++++++++++++");
		System.out.println("How many hours did you work this week: ");
		System.out.println("+++++++++++++++++++++++++++++++++++++++");
		double hours = in.nextDouble(); 
		double overtimePay;
		double total;
		
		if(hours > maxHours) {
			double nonPaidHours = hours - maxHours;
			hours -= nonPaidHours; 
			
		}
		//Overtime
		if(hours > fortyHourWeek) {
			double overtimeHours = hours - fortyHourWeek;
			overtimePay = overtimeHours * 1.5;
			total = hourlyPay * (hours- overtimeHours) + overtimePay;
		}
		else{
			total= hourlyPay * hours;
		}
		
		
		return total;
	}
	
	public double consultantEmployee(Employee e) {
		double maxHours = e.getMaxHours();
		System.out.println("+++++++++++++++++++++++++++++++++++++++");
		System.out.println("How many hours did you work this week: ");
		System.out.println("+++++++++++++++++++++++++++++++++++++++");
		double hours = in.nextDouble();
		double hourlyPay = e.getPayRate();
		double total;
		
		if(hours > maxHours) {
			double nonPaidHours = hours - maxHours;
			total = (hours - nonPaidHours) * hourlyPay;
		}
		else {
			total = hourlyPay * hours;
		}
		return total;
	}
	
	
}
