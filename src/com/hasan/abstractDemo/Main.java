package com.hasan.abstractDemo;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(20);
        son.career();

        Daughter daughter = new Daughter(17);
        daughter.career();

        //  Parent mom = new Parent(); You Can not create a abstract class
//
//        Parent mom = new Parent() {
//            @Override
//            void career() {
//
//            }
//
//            @Override
//            void partner() {
//
//            }
//        }

        Parent.hello();

        son.normal();
    }
}
