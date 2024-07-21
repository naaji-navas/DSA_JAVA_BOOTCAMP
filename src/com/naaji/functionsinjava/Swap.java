package com.naaji.functionsinjava;

public class Swap {

    public static void main(String[] args){

    }
    //In java there is nothing called as pass by reference
    // we only have pass by value, ie the copy is passed here
    // a copy of the value of the reference variable is passed here



    private static void swap(int a, int b){
       int temp =a;
       a =b;
       b= temp;
    }
}
