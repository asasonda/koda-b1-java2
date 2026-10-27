package com.koda;

public abstract class Employee {
    private String employeeId;
    private String name;
    private String position;
    private String department;
    private int salary;

    public Employee(String employeeId, String name, String position, String department, int salary){
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.department = department;
        this.salary = salary;
    }

    public String getEmployeeId(){
        return employeeId;
    }
    public String getEmployeeName(){
        return name;
    }
    public String getEmployeePosition(){
        return position;
    }
    public String getEmployeeDepartement(){
        return department;
    }
    public int getEmployeeSalary(){
        return salary;
    }

    protected abstract void increaseSalary(int amount);

    public  void addSalary(int amount){
        salary += amount;
    }
}
