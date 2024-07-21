//ArrayIntro.java

package com.naaji.arrrys;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayIntro {
    public static void main(String[] args){
        // syntax for creating an array
        int[] marks = new int[5];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < marks.length; i++){
            System.out.println("Enter the marks of the student " + i);
            marks[i] = sc.nextInt();
        }
        for(int element: marks){
            System.out.println(element);
        }


        System.out.println("THis is the printing of the array with array.string method");

        System.out.println(Arrays.toString(marks));
        // syntax for initializing an array
        // data_type[] variable_name = new data_type[size];
        marks[0] = 100;
        marks[1] = 90;
        marks[2] = 80;
        marks[3] = 70;
        marks[4] = 60;
        //array objects are in heap
        //heap objects may not be continues
        // Dynamic memory allocation
        // Array objects in java may not be continues internally
        // It depends on the jvm

        // syntax for printing an array
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);
//        System.out.println(marks[3]);
//        System.out.println(marks[4]);
        // all the types in the array are of the same type
        // syntax for printing an array using for loop
//        for (int i = 0; i < marks.length; i++) {
//            System.out.println(marks[i]);
//
//        }
        int[] age = new int[0]; // declaration
        String name[] = new String[5]; // declaration

        for(int i = 0; i < name.length; i++){
            System.out.println("Enter the name of the student " + i);
            name[i] = sc.next();
        }

//        print the type of age
        // heap memory is the memory that is allocated at the run time of the program
        // stack memory is the memory that is allocated at the compile time of the program
        // syntax for printing an array using for each loop
        // new is used to allocate memory in the heap memory
        // it is used to crate an object in the heap memory
        // internally initial value of the array is 0


        String arr[] = new String[5];
        // Internally initial value of the string array is null
        // null can only be assigned to a non-primitive data type
        // null is the default value of the string array
//        for (int element: marks) {
//            System.out.println(element);
//        }
    }
}
