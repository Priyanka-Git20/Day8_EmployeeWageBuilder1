package com.employee.wage.builders;

public class EmployeeWageBuilderUC2 {
   public static final int IS_FULL_TIME = 1;
    public static final int EMP_RATE_PER_HOUR = 20;

    public static int employeeWageCalculation(){
        //Variables
        int empHours = 0;
        int empWage = 0;
        //Computation
        double empCheck = Math.floor(Math.random () * 10)%2;

        if (empCheck == IS_FULL_TIME ) {
            empHours = 8;
        }
        else {
            empHours = 0;
        }
        empWage = empHours * EMP_RATE_PER_HOUR;
        System.out.println("Employee Wage is " +empWage);
        return empWage;
    }

    public static void main(String[] args) {

        employeeWageCalculation();
    }
}
