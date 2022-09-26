package mru.assignment12503.controller;

import java.util.Scanner;

import mru.assignment12503.model.Employee;

/**
 * This Class calculates all employee's pay including hourly, salary, consultant, gross and net pay 
 * as well as including the tax deductions from their wages.
 * @author Gabriel Toro, Jose Sanchez
 *
 */
public class assignment1Controller {

	Scanner in;
	
	public assignment1Controller() {
		in = new Scanner(System.in);
	}
	
	 /**
	  * This method classifies which pay stub an employee belongs to. Either hourly, salary, or consultant.
	  * @param hoursWorked
	  * @param e
	  * @return Gross Weekly pay without deductions
	  */
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
	
	
	
	/**
	 * this method calculates the weekly wage of a salary employee
	 * @param e
	 * @param hour
	 * @return Total pay for the week.
	 */
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
	
	/**
	 * This method calculates the weekly wage of hourly employees.
	 * @param e Referring to the employee object.
	 * @param hour The amount of hours worked.
	 * @return Total pay for the week.
	 */
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
	
	/**
	 * This method calculates the weekly wage of consultant employees.
	 * @param e Referring to the employee object.
	 * @param hour The amount of hours worked.
	 * @return total pay for the week.
	 */
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
	
	/**
	 * This method calculates the income tax of employees within different income brackets.
	 * @param grossWeeklyPay.
	 * @return income tax for different tax brackets.
	 */
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
	
	/**
	 * This method calculates the tax for CPP.
	 * @param grossWeeklyPay
	 * @return CPP tax
	 */
	public double calcCPP(double grossWeeklyPay) {
		double cpp=0.0475;
		double cppTax=grossWeeklyPay*cpp;
		return cppTax;
		
	}
	
	/**
	 * This method calculates employment insurance deduction.
	 * @param grossWeeklyPay
	 * @return Employment Insurance deduction
	 */
	public double calcEI(double grossWeeklyPay) {
		double ei=0.018;
		double eiTax=grossWeeklyPay*ei;
		return eiTax;
	}
	
	/**
	 * This method calculates the deductions from extended health benefits (only applies to specific employees).
	 * @param grossWeeklyPay
	 * @return Health Benefit deductions
	 */
	public double calcExtHealth(double grossWeeklyPay) {
		double healthBen = 0.013;
		double HealthBenDeduc = grossWeeklyPay * healthBen;

		return HealthBenDeduc;
	}

	/**
	 * This method calculates the deductions from union fees (only applies to specific employees).
	 * @param grossWeeklyPay
	 * @return Union Fee deductions
	 */
	public double calcUnionDues(double grossWeeklyPay) {
		double unionFee = 0.01;
		double UnionFeeDeduc = grossWeeklyPay * unionFee;

		return UnionFeeDeduc;
	}
	
	/**
	 * This method calculates the weekly net pay of every single employee with all deductions and taxes.
	 * @param e Referring to the employee object.
	 * @param hoursWorked for a week
	 * @return Net Pay with deductions
	 */
	public double calcNetPay(Employee e, double hoursWorked) {
	
		char sType = 'S';
		char hType = 'H';
		char employeeType = e.getType();
		double gWeeklyPay = calculateGrossWeeklyPay(hoursWorked, e);
		double incomeTax = calcWithhold(gWeeklyPay);
		double cppTax = calcCPP(gWeeklyPay);
		double eiTax = calcEI(gWeeklyPay);

		double netPay;
		
		
		
		if(employeeType == hType) {
			double unionFee = calcUnionDues(gWeeklyPay);
			double extHealth = calcExtHealth(gWeeklyPay);
			netPay = gWeeklyPay - incomeTax - cppTax - eiTax - unionFee - extHealth;
		}
		if(employeeType == sType) {
			double extHealth = calcExtHealth(gWeeklyPay);
			netPay = gWeeklyPay - incomeTax - cppTax - eiTax - extHealth;
			
		}
		else {
			netPay = gWeeklyPay - incomeTax - cppTax - eiTax; 
		}
			
			
		return netPay;
	}
}




