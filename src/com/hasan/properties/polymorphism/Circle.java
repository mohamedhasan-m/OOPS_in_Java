package com.hasan.properties.polymorphism;

public class Circle extends Shapes{
    //  This will Run When Obj of Circle is Created
    // Hence it is overriding the parent Method
    @Override // This is Called Annotation
    void area() {
        System.out.println("Area is pie * r * r");
    }
}
