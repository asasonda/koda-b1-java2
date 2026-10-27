package com.koda;

public class App 
{
    public static void main( String[] args )
    {
        Employee karyawan1 = new PermanentEmployee("EMP001", "Andi Pratama", "Backend Developer", "IT", 5000000);
        Employee karyawan2 = new ContractEmployee("EMP002", "Budi Santoso", "Frontend Developer", "IT", 5000000);

        EmployeeService data1 = new EmployeeService(karyawan1);
        EmployeeService data2 = new EmployeeService(karyawan2);
        System.out.println("============================");
        System.out.println("    Koda Enterprise     ");
        System.out.println("============================");
        System.out.println("Permanent Employee");
        data1.showEmployee();
        System.out.println();
        data1.giveRaise(1000000);
        System.out.println("Current Salary: " +karyawan1.getEmployeeSalary());
        System.out.println("============================");

        System.out.println("Contract Employee");
        data2.showEmployee();
        data2.giveRaise(300000);
        System.out.println("Current Salary: " +karyawan2.getEmployeeSalary());
        System.out.println();
        data2.giveRaise(1000000);
        System.out.println("Current Salary: " +karyawan2.getEmployeeSalary());
        System.out.println();
        data2.giveRaise(-500000);
        System.out.println("Current Salary: " +karyawan2.getEmployeeSalary());
    }
}
