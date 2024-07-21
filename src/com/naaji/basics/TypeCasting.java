package com.naaji.basics;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        float number = sc.nextFloat();
//        System.out.println(number);
        //type   casting
//        int num = (int) number;
//        System.out.println(num);

        //automatic type promotion in expressions
//        int a = 257;
//        byte b= (byte)a;
//        System.out.println(b);

        byte a =  40;
        byte b = 100;
        byte c = 100;
        int d = a*b/c;
        System.out.println(d);
        /*
         here automatic type conversion is taking place
         that is if the byte limit is exceeding, then it will automatically
         so java uses unicode system.
         java uses many type promotion rules
        float + int - double = double
         all the byte short and character values are converted to integer
        if any operands are float or
        */


    }
}
