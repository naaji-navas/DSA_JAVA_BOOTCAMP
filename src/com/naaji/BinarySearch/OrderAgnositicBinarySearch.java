package com.naaji.BinarySearch;

public class OrderAgnositicBinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 12, 15, 18, 21, 24, 27, 30};
        int target = 18;
        int ans = orderAgnosticBinarySearch(arr, target);
        System.out.println(ans);
    }

    public static int orderAgnosticBinarySearch(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;

        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[s] < arr[e];

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }
            }
        }
        return -1;
    }
}
