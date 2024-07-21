package com.naaji.arrrys;

import java.lang.constant.ClassDesc;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        // 2d arrays
        int [][] flats = new int[3][3];
        Scanner in = new Scanner(System.in);
        for(int i = 0; i< flats.length; i++){
            for(int j = 0; j< flats[i].length; j++){
                flats[i][j] = in.nextInt();
            }
        }
    }
}
