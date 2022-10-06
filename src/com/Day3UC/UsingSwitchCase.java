package com.Day3UC;

public class UsingSwitchCase {
    public static void main(String[] args) {
            int Wage_per_hour = 20;
            int EmployeeHour;
            java.util.Random random = new java.util.Random();
            int tmp = random.nextInt(3) + 1;
            switch (tmp) {
                case 1:
                    EmployeeHour = 4;
                    System.out.println("Employee is Present for Half Day");
                    break;
                case 2:
                    EmployeeHour = 8;
                    System.out.println("Employee is Present for Full Day");
                    break;
                default:
                    EmployeeHour = 0;
                    System.out.println("Employee is Absent");
            }
            System.out.println("Employee Wage is: " + (Wage_per_hour * EmployeeHour));

        }
    }
