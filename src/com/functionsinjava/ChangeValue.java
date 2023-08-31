package com.functionsinjava;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int [] arr={1,3,2,45,6};
        change(arr);
        System.out.println(Arrays.toString(arr));
        // here for objects the value will be changed.
    }

    private static void change(int[] nums) {
        nums[0]=99; // if you make  a change to the object via this ref variable, same object will be changed.
    }
}
