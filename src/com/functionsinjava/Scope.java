package com.functionsinjava;

public class Scope {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        random(a);
        {
//            int a = 20; already initialized outside the block
            a = 68; // we can reassign the value inside the block.
            int c = 99;
            // values initialized in this block , will remain in the block
        }
//        System.out.println(c);// cannot use outside the block
        // shadowing in java means that the variable inside the block will be given preference over the variable outside the block.
        System.out.println(a); // the value of a will be changed to 68, as it is inside the block.

    }
    static void random(int num){
        num=65;
        System.out.println();
    }

}
