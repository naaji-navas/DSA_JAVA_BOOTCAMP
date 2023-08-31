package com.swithchandnestedcase;

import java.util.Scanner;

public class NestedSwitchh {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();
        switch (empID) {
            case 1 -> System.out.println("NAji");
            case 2 -> System.out.println("Naji pp");
            case 3 -> {
                switch (department) {
                    case "cs"-> System.out.println("It is the cs dpeartmetn");
                    case "it"-> System.out.println("It is the IT department");
                    default -> System.out.println("Invalid department");
                }
            }
            case 4-> System.out.println("naji pp");
            default -> System.out.println("Invalid emp id");
        }

    }
}
