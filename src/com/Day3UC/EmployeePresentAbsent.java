package com.Day3UC;

public class EmployeePresentAbsent {
    public static void main(String[] args) {
        int full_time = 1;
        double check = Math.floor(Math.random()*10) % 2;

        if(check==full_time)
            System.out.printf("Employee Present.");
        else
            System.out.printf("Employee Absent.");
    }
}
