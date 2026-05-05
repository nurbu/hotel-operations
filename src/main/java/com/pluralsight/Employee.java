package com.pluralsight;

public class Employee {

    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private int startTime;
    private int endTime;

    public Employee(int employeeId, String name, String department, double hoursWorked, double payRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getTotalPay() {
        return getRegularHours() * payRate + getOvertimeHours() * payRate * 1.5;
    }

    public double getRegularHours() {
        return hoursWorked >= 40 ? 40 : hoursWorked;
    }

    public double getOvertimeHours() {
        return hoursWorked >= 40 ? hoursWorked - 40 : 0;
    }

    public void punchIn(int startTime) {
        this.startTime = startTime;
    }

    public int getStartTime() {
        return startTime;
    }

    public void punchOut(int endTime) {
        this.endTime = endTime;
    }

    public int getEndTime() {
        return endTime;
    }
}
