package com.hasan.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        list2.add(22);
        list2.add(24);
        list2.add(26);

        System.out.println(list2);

        List<Integer> vector = new Vector<>();
        vector.add(45);
        vector.add(56);
        vector.add(55);

        System.out.println(vector);
    }
}