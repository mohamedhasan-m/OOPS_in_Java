package com.hasan.abstractDemo;

import java.security.PublicKey;

public class Son extends Parent{

    public Son(int age){
        super(age);
    }

    @Override
    void normal(){
        super.normal();
    }

    @Override
    void career(){
        System.out.println("i am going to be a doctor");
    }

    @Override
    void partner(){
        System.out.println("i love Sadhiya");
    }
}
