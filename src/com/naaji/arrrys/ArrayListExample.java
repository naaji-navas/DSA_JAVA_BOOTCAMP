package com.naaji.arrrys;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(10);

        // you cannot add the primitive data types to the array list
        // only add the wrapper classes like Integer, Double, Float, Character, Boolean,String etc

        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);

        System.out.println(arr);
        System.out.println(arr.contains(3));
        arr.set(1, 5);
        System.out.println(arr.get(1));

    }
}
