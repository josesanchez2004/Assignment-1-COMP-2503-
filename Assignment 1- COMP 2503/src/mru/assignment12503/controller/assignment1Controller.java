package mru.assignment12503.controller;

import java.util.Scanner;

import mru.assignment12503.model.Employee;

public class assignment1Controller {

	Scanner in;
	
	public assignment1Controller() {
		in = new Scanner(System.in);
	}
	
	public double calculateGrossWeeklyPay(double hoursWorked,Employee e) {
		char sType='S';
		char hType='H';
		double grossWeeklyPay;
		char employeeType=e.getType();
		if(employeeType==sType) {
			grossWeeklyPay=salaryEmployee(e, hoursWorked);
		}else if (employeeType==hType) {
			grossWeeklyPay=hourlyEmployee(e, hoursWorked);
			
		}else {
			grossWeeklyPay=consultantEmployee(e, hoursWorked);
		}
		return grossWeeklyPay;
	}
	
	//System.out.println("+++++++++++++++++++++++++++++++++++++++");
	//System.out.println("How many hours did you work this week: ");
	//System.out.println("+++++++++++++++++++++++++++++++++++++++");
	//double hours = in.nextDouble();
	
	public double salaryEmployee(Employee e, double hour) {
	
		double hours = hour;
		
		double numOfWeeks = 52;
		double maxHours = e.getMaxHours();
		double weeklyPay= e.getPayRate()/numOfWeeks;
		
		//no overtime 
		if(hours>maxHours) {
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("+_________YOU CANNOT WORK ANYMORE HOURS________+");
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
		}	
		return weeklyPay;
		
	}
	
	public double hourlyEmployee(Employee e, double hour) {
		
		double maxHours = e.getMaxHours();
		int fortyHourWeek = 40;
		double hourlyPay = e.getPayRate();
		double hours = hour;
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
	
	public double consultantEmployee(Employee e,double hour) {
		double maxHours = e.getMaxHours();
		double hours = hour;
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
	
	public double calcWithhold(double grossWeeklyPay) {
		
		double oneThousand=1000;
		double twoThousand=2000;
		double normalTax;
		if (grossWeeklyPay>twoThousand) {
			double tax=0.17;
			normalTax= grossWeeklyPay*tax;
			
		}else if (grossWeeklyPay<twoThousand && grossWeeklyPay>oneThousand) {
			
			double tax=0.12;
			normalTax=grossWeeklyPay*tax;
		}
		else {
			double tax=0.075;
			normalTax=grossWeeklyPay*tax;
			
		}
		return normalTax;
	}	
	
	public double calcCPP(double grossWeeklyPay) {
		double cpp=0.0475;
		double cppTax=grossWeeklyPay*cpp;
		return cppTax;
		
	}
	public double calcEI(double grossWeeklyPay) {
		double ei=0.018;
		double eiTax=grossWeeklyPay*ei;
		return eiTax;
	}
}




