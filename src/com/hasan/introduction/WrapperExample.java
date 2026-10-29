package com.hasan.introduction;

public class WrapperExample {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//
//        Integer num = 45;

        Integer a = 10;
        Integer b = 20;

        swap(a,b);

        System.out.println(a + " " + b);

        final int bonus = 2;
        // bonus = 3;
        // You Can't Modified it

        final A hasan = new A("Kunal Kushwaha");
        hasan.name = "Other Name";

        // when a non primitive is final you can't reassogn it



        A obj = new A("Hasan");

        System.out.println(obj);
    }

    static void swap (Integer a , Integer b){
        Integer temp = a;
        a = b;
        b = temp;
    }
}

/*
   Final Keyword

   final INT Increase = 2;


*/

class A{
    // Always intialize final keyword while declaring

    // final guranntess imuutablity when primitive data types

    final int num = 10;
    String name;

    public A(String name){
//        System.out.println("Objet Created");
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is Destroyed");
    }
}