package mru.assignment12503.model;

/**
 * This class describes all the attributes towards an employee of a company. It will be used to calculate their specific pay and taxes 
 * to determine their pay wage per week.
 * @author Jose Sanchez, Gabriel Toro
 *
 */
public class Employee {
	private int empNo;
	private String empName;
	private String department;
	private char type; 
	private double payRate;
	private double maxHours;
	
	
	/**
	 * Default Constructor
	 */
	public Employee() {
		empNo=0;
		empName=null;
		department=null;
		type=' ';
		payRate=0;
		maxHours=0;
	}
	
	/**
	 * Constructor which accepts all our parameters
	 * @param empNo Employee Number
	 * @param empName Employee Name
	 * @param department 
	 * @param type Type of employee
	 * @param payRate
	 * @param maxHours
	 */
	public Employee(int empNo, String empName, String department, char type, double payRate, double maxHours) {
		this.empNo=empNo;
		this.empName=empName;
		this.department=department;
		this.type= type;
		this.payRate=payRate;
		this.maxHours=maxHours;
	}
	
	/**
	 * Copy constructor
	 * @param e
	 */
	public Employee(Employee e) {
		this.empNo=e.getEmpNo();
		this.empName=e.getEmpName();
		this.department=e.getDepartment();
		this.payRate=e.getPayRate();
		this.maxHours=e.getMaxHours();
	}
	
	/**
	 * getting the pay rate
	 * @return Pay rate
	 */
	public double getPayRate() {
		return payRate;
	}
	
	/**
	 * Setting the pay rate
	 * @param payRate
	 */
	public void setPayRate(double payRate) {
		this.payRate = payRate;
	}
	
	/**
	 * getting the Employee number
	 * @return Employee Number
	 */
	public int getEmpNo() {
		return empNo;
	}
	
	/**
	 * Setting Employee Number
	 * @param empNo
	 */
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	
	/**
	 * getting the Employee name
	 * @return Employee Name
	 */
	public String getEmpName() {
		return empName;
	}
	
	/**
	 * Setting the Employee Name
	 * @param empName
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	/**
	 * getting the Department
	 * @return Department
	 */
	public String getDepartment() {
		return department;
	}
	
	/**
	 * Setting the Department
	 * @param department
	 */
	public void setDepartment(String department) {
		this.department = department;
	}
	
	/**
	 * getting the Type of employee
	 * @return Type
	 */
	public char getType() {
		return type;
	}
	
	/**
	 * Setting the type of Employee
	 * @param Type
	 */
	public void setType(char type) {
		this.type = type;
	}
	
	/**
	 * getting the Max amount of hours an employee can work
	 * @return Max hours
	 */
	public double getMaxHours() {
		return maxHours;
	}
	
	/**
	 * Setting the max amount of hours and employee can work
	 * @param maxHours
	 */
	public void setMaxHours(double maxHours) {
		this.maxHours = maxHours;
	}

}

