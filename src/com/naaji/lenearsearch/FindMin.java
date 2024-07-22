package com.naaji.lenearsearch;

public class FindMin {
    public static void main(String[] args) {
        int arr[] = {18, 12, -7, 3, 14, 28};
        System.out.println(findMin(arr));
    }

    static int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i : arr) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }
}
