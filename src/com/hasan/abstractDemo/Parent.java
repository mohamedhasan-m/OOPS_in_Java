package com.hasan.abstractDemo;

public abstract class Parent {

    int age;

    public Parent(int age){
        this.age = age;
    }

    static void hello(){
        System.out.println("Hey");
    }

    void normal(){
        System.out.println("This is a Normal Method");
    }

    abstract void career();
    abstract void partner();

    // abstract Parent(); Abstract Constructors are not allowed

    // you cannot create a object of abstrct classes
}
