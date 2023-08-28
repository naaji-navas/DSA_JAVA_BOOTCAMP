package com.basics;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        float n1 = sc.nextInt();
        System.out.println("Enter the second number : ");
        float n2 = sc.nextFloat();
        float sum = n1 + n2;
        System.out.println("The sum of the two numbers is : " + sum);

    }
}
