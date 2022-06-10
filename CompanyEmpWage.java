package com.bridgelabz.empwage;

import java.util.ArrayList;
import java.util.Arrays;

public class CompanyEmpWage<E> {

    public static <E> void main(String[] args) {

        ArrayList<Integer> wage = new ArrayList<>();
        EmpWageCompute[] comp = {new EmpWageCompute(100, 20, 200, "Dell"),
                new EmpWageCompute(120, 25, 500, "IBM"),
                new EmpWageCompute(100, 22, 400, "HCL"),
                new EmpWageCompute(150, 24, 700, "TCS")};

        for (int i = 0; i < comp.length; i++) {
            wage.add(comp[i].calculateWage());
            System.out.println(comp[i].toString());
        }

    }
}



