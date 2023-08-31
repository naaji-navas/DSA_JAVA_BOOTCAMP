package com.functionsinjava;

import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = in.nextInt();
        boolean ans = isPrime(n);
        System.out.println(ans);

    }
    private static boolean isPrime(int n){
        for (int i = 2; i*i <= n; i++) {
            if (n%i == 0){
                return false;
            }
        }
        return true;
    }
    // Amstrong number is a number whose sum of the cube of the digits is equal to the number itself
    // 153 = 1*1*1 + 5*5*5 + 3*3*3
    // 153 = 1 + 125 + 27
    private static boolean isAmstrong(int n){
        int original = n;
        int sum = 0;
        while (n>0){
            int rem = n%10;
            n = n/10;
            sum = sum + rem*rem*rem; // here we are
        }
        return sum == original;
    }
    // Fibonacci series is a series of numbers in which each number is the sum of the two preceding numbers.
    // The simplest is the series 1, 1, 2, 3, 5, 8, etc.
    private static boolean isFibonacci(int n){
        int a = 0;
        int b = 1;
        if (n == a || n == b){
            return true;
        }
        int c = a + b;
        while (c <= n){
            if (c == n){
                return true;
            }
            a = b;
            b = c;
            c = a + b;
        }
        return false;
    }
    // Factorial of a number is the product of all the integers from 1 to that number.
    // For example, the factorial of 6 is 1*2*3*4*5*6 = 720.
    private static int factorial(int n){
        int product = 1;
        for (int i = 1; i <= n; i++) {
            product = product * i;
        }
        return product;
    }
    // A palindrome number is a number that is same after reverse.
    // For example 121, 34543, 343, 131, 48984 are the palindrome numbers.
    private static boolean isPalindrome(int n){
        int original = n;
        int reverse = 0;
        while (n>0){
            int rem = n%10;
            n = n/10;
            reverse = reverse*10 + rem;
        }
        return reverse == original;
    }
    // A perfect number is a positive integer that is equal to the sum of its proper positive divisors,
    // that is, the sum of its positive divisors excluding the number itself.
    // Equivalently, a perfect number is a number that is half the sum of all of its positive divisors.
    // The first perfect number is 6, because 1, 2 and 3 are its proper positive divisors, and 1 + 2 + 3 = 6.
    private static boolean isPerfectNumber(int n){
        int sum = 0;
        for (int i = 1; i <= n/2; i++) {
            if (n%i == 0){
                sum = sum + i;
            }
        }
        return sum == n;
    }
}
