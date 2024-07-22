package com.naaji.arrrys.lcquestions;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix1 {
    class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        //NUmber of rows in the matrix
        int m=matrix.length;

        //Number of columns
        int n = matrix[0].length;

        // List to store the sprital order of the matrix

        List<Integer> result = new ArrayList<>();

        // edge case
        if(m==0){
            return result;
        }


        //2D array to keep the visited cells
        boolean seen[][]=new boolean[m][n];


        //Array to represent the four possible movement


        int[] dr = {0,1,0,-1};
        int[] dc = {1,0,-1,0};

        // initital postions of th ematrix
        int r=0;
        int c=0;

        // initial direction index

        int di=0;

        // iterating through all the matrix in the array
        for(int i=0; i<m*n ; i++){
            result.add(matrix[r][c]);

            seen[r][c]=true;
            // calculating the next cell cordinates based on the current direction

            int newR = r + dr[di];
            int newC = c + dc[di];

            if(newR>=0 && newR<m && newC>=0 && newC<n && !seen[newR][newC]){
                r=newR;
                c=newC;
            }else{
                // change the direction
                di =(di+1) % 4;

                r+=dr[di];
                c+=dc[di];
            }

        }
        return result;



    }
}
}
