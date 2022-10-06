package com.Day3UC;

public class UsingSwitchCase {
    public static void main(String[] args) {

        int Wage_per_hours = 20;
        int Employee_Hours;
        java.util.Random random = new java.util.Random();
        int tmp = random.nextInt(3) + 1;
        switch (tmp){
            case 1:
                Employee_Hours=4;
                System.out.println("Employee is Present for Half Day");
                break;
            case 2:
                Employee_Hours=8;
                System.out.println("Employee is Present for Full Day");
                break;
            default:
                Employee_Hours=0;
                System.out.println("Employee is Absent");
        }
        int Total= (Wage_per_hours*Employee_Hours);
        System.out.println("Employee Wage is: "+Total);

    }

}
