package com.hasan.staticExample;

public class Main {
    public static void main(String[] args) {
//        Human hasan = new Human(23,"Mohamed Hasan M", 100000,true);
//        Human mohan = new Human(22,"MohanaPriyan M", 100000,false);
//
//        System.out.println(hasan.population);
//        System.out.println(mohan.population);
//
//        greeting();

        Main funn = new Main();
        funn.fun2();
    }

    // Inside a Static Method You can't use anything non static method
    static void greeting(){
        System.out.println("Hello World");
    }

    // we know that something which is not static, belongs to an object
    void greeting1(){
        fun();
        System.out.println("Hello World");
    }

    // this is not dependent on objects
    static void fun(){
        // greeting1(); // you cant use this becauase it requires an instance
        // but the function you are using it in does not depand on instances

        // You Cannot Acccess Non Static Stuff without referecing their instances in
        // a static reference

        // hence here i am referencing it
        Main obj = new Main();
        obj.greeting1();
    }

    void fun2(){
        greeting1();
    }
}