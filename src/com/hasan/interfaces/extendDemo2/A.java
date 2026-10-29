package com.hasan.interfaces.extendDemo2;

public interface A {
    // Static Interfaces Methods Should always have a body
    // call via interface name

    static void greeting(){
        System.out.println("Hey i am Static Method");
    }
    default void fun(){
        System.out.println("I am In");
    }
}
