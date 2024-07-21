package com.naaji.conditionsandloops;

import javax.print.attribute.standard.MediaSize;
import javax.swing.plaf.metal.DefaultMetalTheme;
import java.util.Scanner;

public class Occurrance {
    public  static void main(String[] args){
        // find the occurrances of the maximum occurring number in given  input a big numbers :
        // thats our problem
        // we need the individual digits
        // n % 10 will give the large digit will give the last value
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the number :");
//        int num = in.nextInt();
//        int count = 0;
//        int reverse =0;
//        while(num>0){
//            int rem = num %10;
//            reverse=reverse*10 +rem;
//
//            if(rem == 5){
//                count ++;
//            }
//            num/=10;
//
//
//        }
//        System.out.println(reverse);






        Scanner in = new Scanner(System.in);
        long number = in.nextLong();
        int[] digitCount = new int[10];

        while(number>0){
            int digit = (int) (number%10);
            digitCount[digit]++;
            number/=10;
        }
        int maxOccuringdigit=-1;
        int maxNumOccurrance = 0;
        for (int i = 0; i <10 ; i++) {
            if(digitCount[i]>maxNumOccurrance){
                maxOccuringdigit=i;
                maxNumOccurrance=digitCount[i];

            }
        }
        System.out.println("The maximum occurning digit is "+ maxOccuringdigit);
        System.out.println("The maximum number of occurrances is "+ maxNumOccurrance);

//
//        while(number>0){
//            int digit = (int) (number % 10);
//            digitCount[digit]++;
//            number /=10;
//
//        }
//        int maxCount = 0;
//        int mostOccurringDigit=-1;
//        for (int i = 0; i <10 ; i++) {
//            if(digitCount[i] >maxCount){
//                maxCount = digitCount[i];
//                mostOccurringDigit=i;
//            }
//        }
//
//        System.out.println("Most occurring digit is "+mostOccurringDigit);
//        System.out.println("Number of occrrances is "+maxCount);




    }
}
