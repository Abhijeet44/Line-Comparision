package com.empwagechk;

public class EmpWageChkUC3 {
    public static void main(String args[]){

        int is_full_time = 1;
        int is_part_time = 2;
        int rateperHr = 20;
        int empwage ;
        int empHrs ;

        double empcheck = Math.floor(Math.random() * 10 % 3);

        if(empcheck == is_full_time){
            empHrs = 8;
        }
        else if(empcheck == is_part_time){
            empHrs = 4;
        }
        else{
            empHrs = 0;
        }
        empwage = empHrs * rateperHr ;
        System.out.println("The wage of the empolyee : " + empwage);

    }
}
