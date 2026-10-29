package com.hasan.properties.inheritence;

public class Box {
    private  double length;
    double height;
    double width;
    // double weight;

    static void Greeting(){
        System.out.println("Hey i am in Box Class. Greetings");
    }

    Box(){
        this.height = -1;
        this.length = -1;
        this.width = -1;
    }

    // Cube

    Box(double side) {

        // super(); Object Class

        this.height = side;
        this.length = side;
        this.width  = side;
    }

    // three Argumenets

    Box(double length, double height, double width){
        System.out.println("Box Class Constructor");
        this.length = length;
        this.height = height;
        this.width = width;
    }

    Box(Box old){
        this.height = old.height;
        this.length = old.length;
        this.width = old.width;
    }

    public void information(){
        System.out.println("Running the Box");
    }
}