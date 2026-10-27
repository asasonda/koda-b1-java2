package com.koda;

public class ContractEmployee extends Employee {
    public ContractEmployee(String employeeId, String name, String posision, String department, int salary){
        super(employeeId, name, posision, department, salary);
    }

    @Override 
    public void increaseSalary(int amount){
        if(amount <= 0){
            throw new IllegalArgumentException("Kenaikan gaji harus lebih dari 0");
        }else if(amount > 500000){
            throw new IllegalArgumentException("Kenaikan gaji maksimal Rp500000");
        }
        else{
            addSalary(amount);
        }
    }
}
