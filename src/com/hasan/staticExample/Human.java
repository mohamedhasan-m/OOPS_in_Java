package com.hasan.staticExample;

public class Human {
    int age;
    String Name;
    int salary;
    boolean married;
    static long population;


    static void message(){
        System.out.println("Hello World");
        // System.out.println(this.age); // cant use this over here
    } // you cannot use this keyword inside static keyword

    public Human(int age, String Name, int salary, boolean married){
        this.age = age;
        this.Name = Name;
        this.salary = salary;
        this.married = married;
        Human.population += 1;

        Human.message();
    }
}
