package com.hasan.enumExample;

public class Basic {
    enum Week{
        monday, tuesday, wednesday, thursday, friday, saturday, sunday;
        // these are enum constansts
        // public, static and final
        // since its final you can not create child enums
        // type is week

        Week(){
            System.out.println("Constructor called for " + this);
        }
        // this is not public or protected. only private or default
        // why ?

        // we dont want cratee new objects

        // internally: public static final week monday = new week();
    }

    public static void main(String[] args) {
        Week week;
        week = Week.monday;
//
//        for(Week day: Week.values()) {
//            System.out.println(day);
//        }
    }
}
// OOPS Completed
