package com.Day3UC;
import java.util.Scanner;

public class EmployeeDailyWages {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
         int total_wage;
        System.out.print("Enter Full day hours:: ");
        int hours = input.nextInt();

        System.out.print("Enter wages per hour: ");
        int wage_per_hour = input.nextInt();

      total_wage= hours * wage_per_hour ;
        System.out.println("Employee Daily Wage: " +total_wage);

    }

}
