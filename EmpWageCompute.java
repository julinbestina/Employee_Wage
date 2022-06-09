package com.bridgelabz.empwage;

public class EmpWageCompute {
    public static void calculateWage(String firmName, int totalWorkingHourOfFirm, int totalWorkingDayOfFirm, int empWagePerHourOfFirm) {

        int empHour, totalWorkingHour = 0, totalWorkingDay = 0;

        while (totalWorkingHour <= totalWorkingHourOfFirm && totalWorkingDay < totalWorkingDayOfFirm) {
            totalWorkingDay++;
            int empCheck = (int) (Math.random() * 10) % 3;
            switch (empCheck) {
                case 1:
                    empHour = 8;
                    break;
                case 2:
                    empHour = 4;
                    break;
                default:
                    empHour = 0;
            }

            totalWorkingHour += empHour;
        }

        int totalWage = totalWorkingHour * empWagePerHourOfFirm;
        System.out.println("Company Name: " + firmName + ", " + "Total Wage: " + totalWage + ", " + ", " + "Working Days: " +
                +totalWorkingDay + ", " + "Working Hour: " + totalWorkingHour + ", " + "Employee Wage per Hour: " + empWagePerHourOfFirm);
    }

    public static void main(String[] args) {

        calculateWage("TCS", 150, 24, 700);
        calculateWage("HCL", 100, 22, 400);
        calculateWage("IBM", 120, 25, 500);
        calculateWage("Dell", 100, 20, 200);
    }
}