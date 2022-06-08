package com.bridgelabz.empwage;

public class EmpWageCompute {
    public static int calculateWage(int totalWorkingHour, int totalWorkingDay, int empWagePerHour) {
        int empHour;
        while (totalWorkingHour <= 100 && totalWorkingDay < 20) {
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
            System.out.println("Day: " + totalWorkingDay + " Working Hour: " + totalWorkingHour);
        }

        int totalWage = (totalWorkingHour * empWagePerHour);
        return totalWage;
    }

    public static void main(String[] args) {
        int totalWorkingHour = 0, totalWorkingDay = 0;
        int empWagePerHour = 20, totalWage;
        totalWage = EmpWageCompute.calculateWage(totalWorkingHour, totalWorkingDay, empWagePerHour);
        System.out.println("Total Emoloyee Wage: " + totalWage);
    }
}

