package com.bridgelabz.empwage;

public class EmpWageCompute  implements IEmpWage  {
    public int totalWorkingDayOfFirm;
    public int totalWorkingHourOfFirm;
    public int empWagePerHourOfFirm;
    public String firmName;
    public int totalWage, totalWorkingHour = 0, totalWorkingDay = 0;


    public EmpWageCompute(int totalWorkingHourOfFirm, int totalWorkingDayOfFirm, int empWagePerHourOfFirm, String firmName) {

        this.totalWorkingHourOfFirm = totalWorkingHourOfFirm;
        this.totalWorkingDayOfFirm = totalWorkingDayOfFirm;
        this.empWagePerHourOfFirm = empWagePerHourOfFirm;
        this.firmName = firmName;
    }


    public int calculateWage() {

        int empHour;

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

        totalWage = totalWorkingHour * empWagePerHourOfFirm;
        return totalWage;

    }

    @Override
    public String toString() {
        return "EmpWageCompute{" +
                "firmName='" + firmName + '\'' +
                ", totalWage=" + totalWage +
                ", totalWorkingHour=" + totalWorkingHour +
                ", totalWorkingDay=" + totalWorkingDay +
                '}';
    }
}

