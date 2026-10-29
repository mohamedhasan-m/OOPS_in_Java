package com.hasan.properties.inheritence;

public class BoxPrice extends BoxWeight{
    double cost;

    BoxPrice (){
        super();
        this.cost = -1;
    }

    BoxPrice(BoxPrice other) {
        super(other);
        this.cost = other.cost;
    }

    BoxPrice(double length, double height, double width, double weight, double cost){
        super(length, width, height, weight);
        this.cost = cost;
    }

    BoxPrice(double side, double weight, double cost){
        super(side, weight);
        this.cost = cost;
    }
}