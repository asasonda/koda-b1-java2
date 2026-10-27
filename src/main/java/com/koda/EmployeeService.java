package com.koda;

public class EmployeeService {
    private Employee employee;

    public EmployeeService(Employee employee){
        this.employee = employee;
    }

    public void showEmployee(){
        System.out.println("EmployeeID: "+ employee.getEmployeeId());
        System.out.println("Name: "+ employee.getEmployeeName());
        System.out.println("Position: "+ employee.getEmployeePosition());
        System.out.println("Departement: "+ employee.getEmployeeDepartement());
        System.out.println("Salary: "+ employee.getEmployeeSalary());
    }
    public void giveRaise(int amount){
        employee.increaseSalary(amount);
    }

}
