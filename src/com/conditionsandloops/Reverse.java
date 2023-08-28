package com.conditionsandloops;

import java.util.Scanner;

public class Reverse {
    public  static void main(String[] args){
        //q : reverse the given number
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number to find the reverse : ");
        int number = in.nextInt();
        int ans = 0;
        while(number>0){
            int rem = number%10;
            number/=10;
            ans = ans*10 +rem;
        }

        System.out.println(ans);


    }
}
