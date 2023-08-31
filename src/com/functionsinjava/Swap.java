package com.functionsinjava;

public class Swap {

    public static void main(String[] args){

    }
    //In java there is no thing called as pass by reference
    // we only have pass by value, ie the copy is passed here


    private static void swap(int a, int b){
       int temp =a;
       a =b;
       b= temp;
    }
}
