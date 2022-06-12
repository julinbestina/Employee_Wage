package com.bridgelabz.empwage;

import java.util.*;

public class EmpWageCompute implements IEmpWage {
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

    public void calculateWage() {


        int empHour, dailyWage;
        Map<String, Integer> map = new LinkedHashMap<String, Integer>();

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
            dailyWage = empHour * empWagePerHourOfFirm;
            map.put("Day " + totalWorkingDay, dailyWage);

        }

        totalWage = totalWorkingHour * empWagePerHourOfFirm;
        map.put("TotalWage", totalWage);

        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

    }


    @Override
    public String toString() {
        return
                "firmName='" + firmName + '\'' +
                        ", totalWage=" + totalWage +
                        ", totalWorkingHour=" + totalWorkingHour +
                        ", totalWorkingDay=" + totalWorkingDay;
    }

}

