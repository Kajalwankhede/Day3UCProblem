package com.Day3UC;

import java.util.Random;

public class EmployeeMonthySalary {
    public static void main(String[] args) {
        int empHrs;
        int maxHrs=100;
        int wagePerHr=20;
        int totalEmpHrs=0;
        int workingDays=20;
        int totalWorkingDays=0;


        while (totalEmpHrs < maxHrs && totalWorkingDays < workingDays) {
            totalWorkingDays++;
            Random r = new Random();
            int tmp = r.nextInt(3);

            switch (tmp) {
                case 1:
                    empHrs = 4;
                    break;
                case 2:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs = totalEmpHrs + empHrs;
        }

        int totalSalary = totalEmpHrs * wagePerHr;
        System.out.println("Total Salary is: "+totalSalary);
    }
}

