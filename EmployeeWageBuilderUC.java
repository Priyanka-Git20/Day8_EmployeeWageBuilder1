package com.employee.wage.builders;

public class EmployeeWageBuilderUC {
    public void welcomeMessage() {
         System.out.println("Welcome to the employee wage computation program.");
    }

    public static void main(String[] args) {
        EmployeeWageBuilderUC employeeWageBuilderUC = new EmployeeWageBuilderUC();
        employeeWageBuilderUC.welcomeMessage();

    }
}
