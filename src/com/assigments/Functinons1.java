package com.assigments;

import com.functionsinjava.Questions;

import javax.swing.plaf.metal.DefaultMetalTheme;
import java.util.Scanner;

public class Functinons1 {
    public  static  void main(String[] args){
        System.out.println("Please enter the three numbers");
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        System.out.println("The maximum among the three number is " + largest(num1,num2,num3));
    }
    private static int largest(int first, int second, int third){
//        int max = 0;
//        if(first>second){
//            max = Math.max(first, third);
//        }
//        else{
//            max = Math.max(second, third);
//        }
//        return max;
////        return Math.max(first,Math.max(second,third));
        return Math.max(first,Math.max(second,third));

    }
    private static int smallest(int first, int second, int third){
        return Math.min(first,Math.min(second,third));

    }

}
