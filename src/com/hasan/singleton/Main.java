package com.hasan.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton obj = Singleton.getInstance();
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        // All three Reference Varibale are pointing to just one subject
    }
}
