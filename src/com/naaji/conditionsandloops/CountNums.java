package com.naaji.conditionsandloops;

import javax.security.auth.login.AccountException;
import java.security.PublicKey;

public class CountNums {
    public static void main(String[] args) {
        int n = 234;
        int count = 0;
        while (n>0){
            int rem = n % 10;
            if(rem==5)
                count++;
            n=n/10;
        }
        System.out.println(count);
    }
}
