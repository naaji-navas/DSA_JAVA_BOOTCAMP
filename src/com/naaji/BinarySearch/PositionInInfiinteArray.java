package com.naaji.BinarySearch;

public class PositionInInfiinteArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36, 39, 42, 45, 48, 51, 54, 57, 60};
        int target = 18;


        int ans = ans(arr, target);
        System.out.println(ans);
    }
    static  int ans(int[] arr,int target){
         // first start with a box of size 2
        int start = 0;
        int end = 1;

        //condition for the target to lie in the range
        while(target>arr[end]){
            int newStart = end + 1;
            // double the box value
            // end = previous end + sizeofbox*2
            end = end + (end - start + 1) * 2;
            start = newStart;

        }
        return binarySearch(arr,target,start,end);
    }
    static int binarySearch( ,int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

}
