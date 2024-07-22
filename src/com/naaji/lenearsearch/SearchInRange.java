package com.naaji.lenearsearch;

public class SearchInRange {
    public static void main(String[] args) {
        int arr[]={18,12,-7,3,14,28};
        int start = 1;
        int end = 4;
        int element = 3;
        System.out.println(searchInRange(arr, start, end, element));

    }

    static int searchInRange(int arr[], int start, int end, int element) {
        for (int i = start; i <= end; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1;
    }
}
