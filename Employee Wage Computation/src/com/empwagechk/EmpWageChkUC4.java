package com.empwagechk;

public class EmpWageChkUC4 {
    public static void main(String args[]){
        int is_full_time = 1;
        int is_part_time = 2;
        int emphrs ;
        int empwage ;
        int rateperHr = 20;

        int empchk =(int) Math.floor(Math.random() * 10 % 3);

        switch(empchk) {

            case 1 :  is_full_time:
            emphrs = 8;
            break;

            case 2 : is_part_time:
            emphrs = 4;
            break;

            default:
                emphrs = 0;
        }

        empwage = empchk * rateperHr ;
        System.out.println("Empolyee Wage is : " + empwage);
    }
}


