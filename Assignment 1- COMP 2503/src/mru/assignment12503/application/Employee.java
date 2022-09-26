package mru.assignment12503.application;

public class Employee {
	private int empNo;
	private String empName;
	private String department;
	private char type; 
	private double hourlyRate;
	private double salaryRate;
	private double consultantRate; 
	
	
	

	public Employee() {
		empNo=0;
		empName=null;
		department=null;
		type=(Character) null;
		hourlyRate=0;
		salaryRate=0;
		consultantRate=0;
		
	}
	public Employee(int empNo, String empName, String department, char type, double hourlyRate, double salaryRate, double consultantRate) {
		this.empNo=empNo;
		this.empName=empName;
		this.department=department;
		this.type= type;
		this.hourlyRate=hourlyRate;
		this.salaryRate=salaryRate;
		this.consultantRate=consultantRate;
	}
	public Employee(Employee e) {
		this.empNo=e.getEmpNo();
		this.empName=e.getEmpName();
		this.department=e.getDepartment();
		this.hourlyRate=e.getHourlyRate();
		this.salaryRate=e.getSalaryRate();
		this.consultantRate=e.getConsultantRate();
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
	public double getHourlyRate() {
		return hourlyRate;
	}
	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
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

}

