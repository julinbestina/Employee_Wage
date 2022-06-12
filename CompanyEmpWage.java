package com.bridgelabz.empwage;


import java.util.Scanner;

public class CompanyEmpWage {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String userChoice;

        IEmpWage[] comp = {new EmpWageCompute(100, 20, 200, "Dell"),
                new EmpWageCompute(120, 25, 500, "IBM"),
                new EmpWageCompute(100, 22, 400, "HCL"),
                new EmpWageCompute(150, 24, 700, "TCS")};

        do {
            System.out.println("Select your choice:");
            System.out.println("1.Dell 2.IBM 3.HCL 4.TCS");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    comp[0].calculateWage();
                    System.out.println(comp[0].getTotalWage("TotalWage"));
                    break;
                case 2:
                    comp[1].calculateWage();
                    System.out.println(comp[1].getTotalWage("TotalWage"));
                    break;
                case 3:
                    comp[2].calculateWage();
                    System.out.println(comp[2].getTotalWage("TotalWage"));
                    break;
                case 4:
                    comp[3].calculateWage();
                    System.out.println(comp[3].getTotalWage("TotalWage"));
                    break;

            }

            System.out.println("Are you Wish to continue:Y?N");
            userChoice = sc.next();
        } while (userChoice.equalsIgnoreCase("Y"));

    }
}






