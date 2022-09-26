package mru.assignment12503.model;

public class Employee {
	private int empNo;
	private String empName;
	private String department;
	private char type; 
	private double hourlyWage;
	private double salaryRate;
	private double consultantRate; 
	private double maxHours;
	
	

	public Employee() {
		empNo=0;
		empName=null;
		department=null;
		type=' ';
		hourlyWage=0;
		salaryRate=0;
		consultantRate=0;
		maxHours=0;
	}
	public Employee(int empNo, String empName, String department, char type, double hourlyRate, double salaryRate, double consultantRate, double maxHours) {
		this.empNo=empNo;
		this.empName=empName;
		this.department=department;
		this.type= type;
		this.hourlyWage=hourlyRate;
		this.salaryRate=salaryRate;
		this.consultantRate=consultantRate;
		this.maxHours=maxHours;
	}
	public Employee(Employee e) {
		this.empNo=e.getEmpNo();
		this.empName=e.getEmpName();
		this.department=e.getDepartment();
		this.hourlyWage=e.getHourlyWage();
		this.salaryRate=e.getSalaryRate();
		this.consultantRate=e.getConsultantRate();
		this.maxHours=e.getMaxHours();
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
	public double getHourlyWage() {
		return hourlyWage;
	}
	public void setHourlyWage(double hourlyRate) {
		this.hourlyWage = hourlyRate;
	}
	public double getSalaryRate() {
		return salaryRate;
	}
	public void setSalaryRate(double salaryRate) {
		this.salaryRate = salaryRate;
	}
	public double getConsultantRate() {
		return consultantRate;
	}
	public void setConsultantRate(double consultantRate) {
		this.consultantRate = consultantRate;
	}
	public double getMaxHours() {
		return maxHours;
	}
	public void setMaxHours(double maxHours) {
		this.maxHours = maxHours;
	}

}

