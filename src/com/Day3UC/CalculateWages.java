package com.Day3UC;

import java.util.Random;
public class CalculateWages {
    public static void main(String[] args) {
            int EmployeeHours;
            int Hours = 100;
            int Wage_per_hour = 20;
            int Total_emp_hour = 0;
            int Working_day = 20;
            int totalWorkingDays = 0;


            while (Total_emp_hour < Hours && totalWorkingDays < Working_day) {
                totalWorkingDays++;
                Random r = new Random();
                int dem = r.nextInt(3);

                switch (dem) {
                    case 1:
                        EmployeeHours = 4;
                        break;
                    case 2:
                        EmployeeHours = 8;
                        break;
                    default:
                        EmployeeHours = 0;
                }
                Total_emp_hour = Total_emp_hour + EmployeeHours;
            }


            int totalSalary = Total_emp_hour * Wage_per_hour;
            System.out.println("Total Salary is: " + totalSalary);
        }
    }



