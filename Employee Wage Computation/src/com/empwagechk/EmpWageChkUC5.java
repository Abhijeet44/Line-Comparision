package com.empwagechk;

public class EmpWageChkUC5 {
    public static void main(String args[]){

        int is_full_time = 1;
        int is_part_time = 2;
        int emphrs ;
        int empwage ;
        int totalempwage = 0;
        int rateperHr = 20;
        int totalDays = 20;

        for(int day=0; day < totalDays; day++) {
            int empchk =  (int) Math.floor(Math.random() * 10 % 3);

            switch(empchk) {
                case 1 :
                    is_full_time:
                    emphrs = 8;
                    break;

                case 2 :
                    is_part_time:
                    emphrs = 4;
                    break;

                default:
                    emphrs = 0;
            }
            empwage = empchk * rateperHr ;
            totalempwage += empwage;
            System.out.println(" Monthly Empolyee Wage is : " + empwage);
        }
        System.out.println("Toatl Emp Wage : " + totalempwage);
    }
}
