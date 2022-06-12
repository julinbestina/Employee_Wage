package com.bridgelabz.empwage;

import java.util.*;

public class EmpWageCompute implements IEmpWage {
    public int totalWorkingDayOfFirm;
    public int totalWorkingHourOfFirm;
    public int empWagePerHourOfFirm;
    public String firmName;


    public EmpWageCompute(int totalWorkingHourOfFirm, int totalWorkingDayOfFirm, int empWagePerHourOfFirm, String firmName) {

        this.totalWorkingHourOfFirm = totalWorkingHourOfFirm;
        this.totalWorkingDayOfFirm = totalWorkingDayOfFirm;
        this.empWagePerHourOfFirm = empWagePerHourOfFirm;
        this.firmName = firmName;
    }

    Map<String, Integer> map = new LinkedHashMap<String, Integer>();

    public void calculateWage() {

        int totalWage, totalWorkingHour = 0, totalWorkingDay = 0;
        int empHour, dailyWage;


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

    }

    public int getTotalWage(String key) {
        return map.get(key);
    }

}



