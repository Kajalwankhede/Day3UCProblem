package com.Day3UC;

import java.util.Scanner;

public class PartTimeEmployeeWage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Total_wage;

        System.out.print("Enter wages per hour: ");
        int wage_per_hour = input.nextInt();

        System.out.print("Enter Part time  hour: ");
        int part_time_hours= input.nextInt();
        Total_wage= part_time_hours * wage_per_hour ;
        System.out.println("Part Time Employee Daily Wage: " +Total_wage);

    }
}
