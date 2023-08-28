package com.conditionsandloops;

import java.util.Scanner;

public class Largest {
    public static  void main(String[] args) {
        System.out.println("Enter the three numbers : ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        //Q : Find the largest of the three numbers :
//        int max = a;
//        if(b>max)
//            max=b;
//        if(c>max)
//            max=c;
        System.out.println("The max number among the given number is :" + Math.max(c, Math.max(a, b)));
    }
}
