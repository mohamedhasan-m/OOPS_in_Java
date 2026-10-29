package com.hasan.generics.comparing;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student hasan = new Student(52, 89.75f);
        Student mohan = new Student(51, 99.45f);
        Student saran = new Student(50, 95.45f);
        Student karan = new Student(49, 77.45f);
        Student sachin = new Student(48, 96.45f);

        Student[] list = {hasan, mohan, saran, karan, sachin};

        System.out.println(Arrays.toString(list));

        Arrays.sort(list, (o1,o2) -> -(int)(o1.marks - o2.marks) );

        System.out.println(Arrays.toString(list));

//        if(hasan.compareTo(mohan) < 0){
//            System.out.println(hasan.compareTo(mohan));
//            System.out.println("Mohan has More Marks");
//        }
    }
}
