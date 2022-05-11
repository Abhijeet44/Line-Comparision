package com.empwagechk;

public class EmpWageChkUC6 {
    public static final int is_patr_time = 1;
    public static final int is_full_time = 2;
    public static final int emprateperHr = 20;
    public static final int num_of_working_days = 20;
    public static final int max_hrs_in_month = 10;

    public static void main(String args[]) {
        int empHrs = 0;
        int totalempHrs = 0;
        int totalWorkingDays = 0;

        while(totalempHrs <= max_hrs_in_month  && totalWorkingDays < num_of_working_days){
            totalWorkingDays++;
            int empcheck = (int) Math.floor(Math.random() * 10 ) % 3 ;

            switch (empcheck) {
                case 1 :
                    is_full_time:
                    empHrs = 8;
                    break;

                case 2 :
                    is_part_time:
                    empHrs = 4;
                    break;
                default :
                    empHrs = 0;
            }
                totalempHrs += empHrs ;
                System.out.println("Day : " + totalWorkingDays + "Emp Hr : " + empHrs);
        }
            int totalempwage = totalempHrs = totalempHrs * emprateperHr ;
            System.out.println("Total Emp Wage : " + totalempwage);
    }
}
