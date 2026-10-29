package com.hasan.access;

public class A {
    // private int num;
    int num;
    String Name;
    int[] arr;

    // Getter
    public int getNum() {
        return num;
    }

    // setter
    public void setNum(int num){
        this.num = num;
    }

    public A(int num, String Name){
        this.num = num;
        this.Name =  Name;
        this.arr = new int[23];
    }
}
