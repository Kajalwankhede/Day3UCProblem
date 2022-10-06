package com.Day3UC;

public class PartTimeEmployeeWage {
    public static void main(String[] args) {
        int Wage_per_hour = 20;
        int EmployeeHours;
        java.util.Random random = new java.util.Random();
        int tmp = random.nextInt(3) + 1;
        switch (tmp){
            case 1:
                EmployeeHours=4;
                System.out.println("Employee is Present for Half Day");
                break;
            case 2:
                EmployeeHours=8;
                System.out.println("Employee is Present for Full Day");
                break;
            default:
                EmployeeHours=0;
                System.out.println("Employee is Absent");

        }  int Total = Wage_per_hour*EmployeeHours;
        System.out.println("Employee Wage is: " +Total);
    }
}
