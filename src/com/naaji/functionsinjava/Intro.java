package com.naaji.functionsinjava;

import java.net.PortUnreachableException;
import java.util.Scanner;

public class Intro {
    public static void main(String[] args){
        // Q:Take the input of two numbers and print the sum
        Scanner in = new Scanner(System.in);
        System.out.println("Enter you name :");
        String name = in.nextLine();
        System.out.println("Please enter the two numbers :");
        int num1 =in.nextInt();
        int num2 =in.nextInt();
        System.out.println("The sum of the two numbers is " + sum(num1,num2));
        String personalised = myGreet(name);
        System.out.println(personalised);

    }

    private static   String myGreet(String name) {
        return "Hi " + name;
    }

    public static int sum(int a, int b){
        return a + b;
    }
}
