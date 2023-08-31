package com.swithchandnestedcase;

import java.util.Scanner;

public class switchh {
    public static  void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the name of the fruit :");
        String fruit = in.next();
        // this is a new switch statement
        String result = switch (fruit){
            case "mango" -> "King of fruits";
            case "apple" -> "Eat apple , be healthy";
            case "pineapple" ->"Pineapple is beautiful and great";
            default -> "invalid input";
        };
        System.out.println(result);
    }
}
