package com.naaji.basics;
import java.util.Scanner;

public class Main {
    // in simple terms package is the folder in which the java program lies
    // in com. . means the subfolder
    public static void main(String[] args) {


        System.out.println("Hello world");
        // System.out is the default standard output stream
        System.out.println("My name is Naaji");
        // out is actually the standard output , here terminal for outing the value
        // for displaying that. System is the class for that
        //lang package contains several useful class and method

        // now for taking input in java
        // that is Scanner class
        System.out.println("Enter a number :");
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextLine());
        //sc.nextInt for inputting the Integer
        //sc.next for inputting the first word
        //sc.nextLine for inputting the sentence of the first line



        // scanner will read everything from the standard input, here it is the keyboard.
        // Scanner is the class which is used for taking the input
        //System.in is actually the constructor as in the object oriented concept
        // System.in is the default standard input
        // Scanner the class for taking input

    }
}