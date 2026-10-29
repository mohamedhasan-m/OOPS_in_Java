package com.hasan.properties.inheritence;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(4.6,6.6,7.7);
//        Box box2 = new Box(box1);
//        System.out.println(box1.width + " " + box1.height);



//        BoxWeight box3 = new BoxWeight();
//        BoxWeight box4 = new BoxWeight(2,4,6,8);
//        System.out.println(box3.height + " " + box3.width);

//        Box box5 = new BoxWeight(2,3,4,5);
//        System.out.println(box5.width);

        // there are many variables in both parent and child class
        // you are given access to variable that are in reference type i.e. BoxWeight
        // hence you should have access to weight variable
        // this also means, that the ones you are trying to access should be intialised
        // but here, when the obj itself is of type parent class, how will you call the constructor of child class
        // this is why error
        // BoxWeight box6= new Box(2,3,5);
        // System.out.println(box6);


//        BoxPrice box = new BoxPrice(5, 8, 200);

        Box.Greeting(); // You can inherit but you cannot override
    }
}
