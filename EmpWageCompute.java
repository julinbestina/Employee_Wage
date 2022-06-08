package com.bridgelabz.empwage;

import java.util.ArrayList;

public class EmpWageCompute {
    private final int totalWorkingHourOfFirm;
    private final int totalWorkingDayOfFirm;
    private final int empWagePerHourOfFirm;
    private String firmName;

    public EmpWageCompute(int totalWorkingHourOfFirm, int totalWorkingDayOfFirm, int empWagePerHourOfFirm, String firmName) {
        this.totalWorkingHourOfFirm = totalWorkingHourOfFirm;
        this.totalWorkingDayOfFirm = totalWorkingDayOfFirm;
        this.empWagePerHourOfFirm = empWagePerHourOfFirm;
        this.firmName = firmName;
    }

    public int calculateWage() {
        int empHour, totalWorkingHour = 0, totalWorkingDay = 1;
        while (totalWorkingHour <= totalWorkingHourOfFirm && totalWorkingDay <= totalWorkingDayOfFirm) {
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
            totalWorkingDay++;
        }

        int totalWage = totalWorkingHour * empWagePerHourOfFirm;
        return totalWage;
    }

    public static void main(String[] args) {

        ArrayList<EmpWageCompute> firm = new ArrayList<EmpWageCompute>();
        EmpWageCompute Dell = new EmpWageCompute(100, 20, 200, "Dell");
        EmpWageCompute IBM = new EmpWageCompute(120, 25, 500, "IBM");
        EmpWageCompute HCL = new EmpWageCompute(100, 22, 400, "HCL");
        EmpWageCompute TCS = new EmpWageCompute(150, 24, 700, "TCS");

        firm.add(Dell);
        firm.add(IBM);
        firm.add(HCL);
        firm.add(TCS);

        for (EmpWageCompute l : firm) {
            System.out.println(l.firmName + ":" + l.totalWorkingHourOfFirm + "," + l.totalWorkingDayOfFirm + "," + l.empWagePerHourOfFirm + "," +
                    +l.calculateWage());
        }

    }
}

