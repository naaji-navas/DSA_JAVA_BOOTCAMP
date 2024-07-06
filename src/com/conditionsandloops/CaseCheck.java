package com.conditionsandloops;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        // trim is used for removing the extra spaces.
        System.out.println("Please enter a character :");
        char ch = in.next().trim().charAt(0);
        Character c =in.next().trim().charAt(0);
        //Q:Find whether it is lower case or upper case
        if(ch >= 'a' && ch <='z'){
            System.out.println("The character is smaller case");
        }else{
            System.out.println("The given character is in Upper case");
        }



    }
}
