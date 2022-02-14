package com.employee.wage.builders;

public class EmployeeWageBuilderUC1 {
    int IS_FULL_TIME = 1;

    public void employeePresenty() {
        //computation
        double empCheck = Math.floor(Math.random() * 10) % 2;

        if (empCheck == IS_FULL_TIME) {
            System.out.println("Employee is Present.");
        } else {
            System.out.println("Employee is Absent");
        }
    }

    public static void main(String[] args) {
        EmployeeWageBuilderUC1 employeeWageBuilderUC1 = new EmployeeWageBuilderUC1();
        employeeWageBuilderUC1.employeePresenty();
    }
}
