package com.bridgelabz.empwage;

public class EmpWageCompute {
    public static void main(String[] args) {
        int empHour, empCheck, totalWorkingHour = 0, totalWorkingDay = 0;
        int empWagePerHour = 20, totalWage;


        while( totalWorkingHour <= 100 && totalWorkingDay < 20) {
            totalWorkingDay++;
                empCheck = (int) (Math.random() * 10) % 3;
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

            totalWage = (totalWorkingHour * empWagePerHour);
        

        System.out.println("Total Emoloyee Wage: " + totalWage);
    }
}

