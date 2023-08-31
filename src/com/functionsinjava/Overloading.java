package com.functionsinjava;

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
    // this is also called as static polymorphism
    // this is because the compiler decides which function to call at compile time
    // this is also called as early binding
    // this is because the compiler decides which function to call at compile time
    // this is also called as method overloading
    // this is because the compiler decides which function to call at compile time
    // this is also called as static binding
    // this is because the compiler decides which function to call at compile time
    // here we can over load the function also by changing the return type
    // but this is not recommended
    // this is because the compiler decides which function to call at compile time
    // aslo we can do the function overloading by changing the number of parameters
    // this is because the compiler decides which function to call at compile time
    // the difference between arguments and parameters is that arguments are the actual values that are passed to the function
    // this is because the compiler decides which function to call at compile time

}
