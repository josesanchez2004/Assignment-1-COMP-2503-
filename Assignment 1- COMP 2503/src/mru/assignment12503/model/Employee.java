package mru.assignment12503.model;

public class Employee {
	private int empNo;
	private String empName;
	private String department;
	private char type; 
	private double payRate;
	private double maxHours;
	
	

	public Employee() {
		empNo=0;
		empName=null;
		department=null;
		type=' ';
		payRate=0;
		maxHours=0;
	}
	public Employee(int empNo, String empName, String department, char type, double payRate, double maxHours) {
		this.empNo=empNo;
		this.empName=empName;
		this.department=department;
		this.type= type;
		this.payRate=payRate;
		this.maxHours=maxHours;
	}
	public Employee(Employee e) {
		this.empNo=e.getEmpNo();
		this.empName=e.getEmpName();
		this.department=e.getDepartment();
		this.payRate=e.getPayRate();
		this.maxHours=e.getMaxHours();
	}
	public double getPayRate() {
		return payRate;
	}
	public void setPayRate(double payRate) {
		this.payRate = payRate;
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public char getType() {
		return type;
	}
	public void setType(char type) {
		this.type = type;
	}
	public double getMaxHours() {
		return maxHours;
	}
	public void setMaxHours(double maxHours) {
		this.maxHours = maxHours;
	}

}

