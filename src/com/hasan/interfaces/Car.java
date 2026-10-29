package com.hasan.interfaces;

public class Car implements Engine, Brake,Media {

    int a = 30;

    @Override
    public void breake() {
        System.out.println("I Brake like a Normal Car");
    }

    @Override
    public void start() {
        System.out.println("I Start Engine Like a Normal Car");
    }

    @Override
    public void stop() {
        System.out.println("I Stop Engine Like a Normal Car");
    }

    @Override
    public void acc() {
        System.out.println("I accelerate like a Normal Car");
    }
}
