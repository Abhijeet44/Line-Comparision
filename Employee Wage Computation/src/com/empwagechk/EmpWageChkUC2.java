package com.empwagechk;

public class EmpWageChkUC2 {
    public static void main(String args[]) {

        int is_full_time = 1;
        int rate_per_Hr = 20;
        int empWage;
        int empHrs;

        double empcheck = Math.floor(Math.random() * 10 % 2);

        if (empcheck == is_full_time) {
            empHrs = 8;
        } else {
            empHrs = 0;
        }
        empWage = empHrs * rate_per_Hr;
        System.out.println("The wage of the empolyee : " + empWage);
    }
}
