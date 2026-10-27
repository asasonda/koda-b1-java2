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

        // System.out.println();

        // employee.increaseSalary(1000000);
        // System.out.println("Salary Increase: 1000000");
        // System.out.println("Current Salary: "+ employee.getEmployeeSalary());
        
        // System.out.println();
        // employee.increaseSalary(-500000);
        // System.out.println("Current Salary: "+ employee.getEmployeeSalary());

    }
    public void giveRaise(int amount){
        employee.increaseSalary(amount);
    }

}
