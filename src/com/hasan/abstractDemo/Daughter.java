package com.hasan.abstractDemo;

public class Daughter extends Parent {

    public Daughter(int age){
        super(age);
    }
    @Override
    void career(){
        System.out.println("i am going to be a Coder");
    }

    @Override
    void partner(){
        System.out.println("i love hasan");
    }
}
