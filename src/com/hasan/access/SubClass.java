package com.hasan.access;

public class SubClass extends A{
    public SubClass(int num, String Name) {
        super(num, Name);
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass(42,"Hasan");
        int n = obj.num;
    }
}