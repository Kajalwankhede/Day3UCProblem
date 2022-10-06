package com.Day3UC;

import java.util.Scanner;

public class EmployeeMonthlySalary {
    public static void main(String[] args) {
        System.out.println("Enter Working Days per Month: ");
        Scanner sc=new Scanner(System.in);
        int working_day=sc.nextInt();
        System.out.print("Enter wages per hour: ");
        int wage_per_hour = sc.nextInt();
        System.out.print("\nEnter Full day hour: ");
        int full_day_hours = sc.nextInt();
        int salary = ( working_day * wage_per_hour * full_day_hours);

        System.out.println("\nEmployee Wages for a Month: "+salary);
    }
}
