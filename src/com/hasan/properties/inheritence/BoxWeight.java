package com.hasan.properties.inheritence;

public class BoxWeight extends Box{
    double weight;

    BoxWeight() {
        this.weight = -1;
    }

    BoxWeight(BoxWeight other){
        super(other);
        weight = other.weight;
    }

    BoxWeight(double side, double weight){
        super(side);
        this.weight = weight;
    }

    BoxWeight(double length, double width, double height, double weight){

        super(length, height, width); // What is this? Calls the Parent Class Constructor
        // Use to Initialize Values present in Parent Class

        // System.out.println(super.weight);

        this.weight = weight;
    }
}
