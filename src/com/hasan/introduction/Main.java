package com.hasan.introduction;

public class Main {
    public static void main(String[] args){
        // Store 5 Roll Numbers
        int[] numbers = new int[5];

        //store 5 names
        String[] names = new String[5];

        // data of 5 students:{roll no, names, marks}
        int[] rNo = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        Student[] students = new Student[5];

        Student hasan; // Declare an object

        // Dyanamic Memeory Alloaction - Dynamically Alloactaes memeory and return to reference to it

        Student Hasan = new Student(52,"Mohamed Hasan M",85.4f);

//        Hasan.rno = 1;
//        Hasan.name = "Mohamed Hasan M";
        // Hasan.marks = 88.5f;

//        System.out.println(Hasan);
//        System.out.println(Hasan.name);
//        System.out.println(Hasan.marks);
//        System.out.println(Hasan.rno);

//        Hasan.greeting();
//        Hasan.changeName("Mohamed Hasan M");
//        Hasan.greeting();

        Student random = new Student(Hasan);
        System.out.println(random.name);

        Student random2 = new Student();
        System.out.println(random2.name);

        Student one = new Student();
        Student two = one;

        one.name = "Something Something";

        System.out.println(two.name);
    }
}

// Create a Class
// Class - Named Group of Properties and Functions and methods
// for every single student
class Student{
    int rno;
    String name;
    float marks = 90;

    //  we need a waay to add the values of the above properties object by object
    // we need one word to access every object

    void greeting(){
        System.out.println("Hello ! My Name is " + this.name);
    }

    void changeName(String name){
        this.name = name;
    }

    Student() {
        // Call a Constructor from another constructor

        this (13, "default Person", 100.0f);
    }

    Student(int rno,String name,float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

    Student (Student other) {
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }
}



// Constructor is Simply Defined what happened when the object is created