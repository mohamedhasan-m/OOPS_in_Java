package com.hasan.staticExample;


// Outside classes can not be static
public class InnerClasses {

    static class Test {
        String Name;

        public Test(String Name){
            this.Name = Name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Mohamed Hasan M");
        Test b = new Test("Rahul");

        System.out.println(a.Name);
        System.out.println(b.Name);
    }
}

//static class a{
//
//}