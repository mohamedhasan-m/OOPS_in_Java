package com.hasan.access;

public class ObjectDemo {

    int num;
    float gpa;

    public ObjectDemo(int num, float gpa){
        this.num = num;
        this.gpa = gpa;
    }

    // we will go in details how to create it in hashmap
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    //
    @Override
    public boolean equals(Object obj){
        return this.num == ((ObjectDemo)obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

//    @Override
//    public String toString() {
//        return super.toString();
//    }
//
//    @Override
//    protected void finalize() throws Throwable {
//        super.finalize();
//    }

    public static void main(String[] args) {
        ObjectDemo obj1 = new ObjectDemo(15, 70.4f);
        ObjectDemo obj2 = new ObjectDemo(15, 58.8f);

        if(obj1.equals(obj2)){
            System.out.println("Obj1 is equal to Obj2");
        }
//        System.out.println(obj.hashCode());
//        System.out.println(obj2.hashCode());

        System.out.println(obj1.getClass()); // stored in heap area
    }
}

// Instanceof Operator

