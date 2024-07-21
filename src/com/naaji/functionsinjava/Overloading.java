package com.naaji.functionsinjava;

public class Overloading {
    public static void main(String[] args) {
        fun(67);
        fun("Naaaji");
        multiple(2,3);
        multiple(2,3,4);
    }

    private static void multiple(int i, int i1) {
        System.out.println(i*i1);
    }
    private static void multiple(int i, int i1, int i2) {
        System.out.println(i*i1*i2);
    }
    static void fun(int a) {
        System.out.println(a);
    }

    static  void fun(String name){
        System.out.println(name);
    }
    // so here we have two functions with the same name but different parameters
    // this is called as function overloading
    // this is also called as compile time polymorphism
    // this is because the compiler decides which function to call at compile time


}
