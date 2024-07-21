package com.naaji.functionsinjava;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(1,2,3,4,5,6,7,8,9,10); // so this function can be called with 0 or more arguments

    }
    static  void fun(int ...v){ // here internally v is an array
        System.out.println(Arrays.toString(v));

    }

}
