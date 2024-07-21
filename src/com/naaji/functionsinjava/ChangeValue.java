package com.naaji.functionsinjava;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int [] arr={1,3,2,45,6};
        change(arr);
        System.out.println(Arrays.toString(arr));
        // here for objects the value will be changed.
    }

    private static void change(int[] nums) {
        nums[0]=99; // if you make a change to the object via this ref variable, the same object will be changed.
        // for primitive data types the value will be passed, and the original value will not be changed,
        // but in non-primitive data
        //types, the value is passing the value of the reference variable, so it will be changed.
    }
}
