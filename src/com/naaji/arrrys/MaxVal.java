package com.naaji.arrrys;

public class MaxVal {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println(max(arr));
    }

    static int max(int[]arr){
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            if(i>max){
                max = i;
            }
        }
        return max;
    }
}
