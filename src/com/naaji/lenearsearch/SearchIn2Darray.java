package com.naaji.lenearsearch;

import java.util.Arrays;

public class SearchIn2Darray {
    public static void main(String[] args) {
        int[][] arr ={
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };
        System.out.println("The element has been found in the indes  : "+ Arrays.toString(searchIn2Darray(arr, 34)));
    }

    static int[] searchIn2Darray(int[][] arr, int target){
        if(arr.length ==0){
            return new int[]{-1,-1};
        }
        for (int i =0;i< arr.length;i++){
            for (int j=0; j<arr[i].length;j++){
                if(arr[i][j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
