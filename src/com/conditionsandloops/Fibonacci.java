package com.conditionsandloops;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] main){
        // Find the Fibonacci series up to a given limit:
        // starts from 0 and 1. then sum of the previous two numbers
            //Q: Find the nth fibonacci serirs
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the position of the  fibonacci number you need to find :");
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count =2;
         while (count<n){
             int temp  = b;
             b=a+b;
             a=temp;
             count++;

         }
         System.out.println(b);


    }
}
