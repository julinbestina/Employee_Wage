package com.bridgelabz.empwage;

public interface CompanyEmpWage {

    public static void main(String[] args) {

        EmpWageCompute[] comp = {new EmpWageCompute(100, 20, 200, "Dell"),
                new EmpWageCompute(120, 25, 500, "IBM"),
                new EmpWageCompute(100, 22, 400, "HCL"),
                new EmpWageCompute(150, 24, 700, "TCS")};

        for (int i = 0; i < comp.length; i++) {
            comp[i].calculateWage();
        }

    }

}

