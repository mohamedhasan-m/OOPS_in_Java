
package com.hasan.cloning;

public class Human implements Cloneable {
    int age;
    String name;
    int[] arr;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{2, 3, 4, 5, 6, 7};
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        // Step 1: Create a shallow copy
        Human twin = (Human) super.clone();

        // Step 2: Create a new array for deep copying
        twin.arr = new int[this.arr.length];

        // Step 3: Copy the array elements
        for (int i = 0; i < this.arr.length; i++) {
            twin.arr[i] = this.arr[i];
        }

        // Step 4: Return the cloned object
        return twin;
    }
}
