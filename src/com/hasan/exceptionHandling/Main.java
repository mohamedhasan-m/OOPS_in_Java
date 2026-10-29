package com.hasan.exceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
            divide(a,b);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("This will always execute");
        }
    }

    static int divide(int a, int b) throws ArithmeticException{
        if(b == 0){
            throw new ArithmeticException("Please do not delete by zero");
        }

        return a/b;
    }
}

// try catch finally throw thorows