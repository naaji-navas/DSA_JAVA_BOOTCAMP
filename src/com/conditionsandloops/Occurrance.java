package com.conditionsandloops;

import javax.print.attribute.standard.MediaSize;
import java.util.Scanner;

public class Occurrance {
    public  static void main(String[] args){
        // find the occurrances of the maximum occurring number in given  input a big numbers :
        // thats our problem
        // we need the individual digits
        // n % 10 will give the large digit
        Scanner in = new Scanner(System.in);
        long number = in.nextLong();
        int[] digitCount = new int[10];

        while(number>0){
            int digit = (int) (number % 10);
            digitCount[digit]++;
            number /=10;

        }
        int maxCount = 0;
        int mostOccurringDigit=-1;
        for (int i = 0; i <10 ; i++) {
            if(digitCount[i] >maxCount){
                maxCount = digitCount[i];
                mostOccurringDigit=i;
            }
        }

        System.out.println("Most occurring digit is "+mostOccurringDigit);
        System.out.println("Number of occrrances is "+maxCount);




    }
}
