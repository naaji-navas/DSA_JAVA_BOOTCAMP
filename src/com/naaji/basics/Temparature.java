package com.naaji.basics;
import java.util.Scanner;

public class Temparature {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the temperature in celsius :");
        float tempInC= in.nextFloat();
        double tempInF=tempInC*9/5 +32.0;
        System.out.println(tempInF);

    }
}
