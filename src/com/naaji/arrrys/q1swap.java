package com.naaji.arrrys;

public class q1swap {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        System.out.println("Before swapping: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        swap(arr, 1, 3);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static void swap(int arr[], int i1, int i2) {
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
        System.out.println("\nAfter swapping: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

}
