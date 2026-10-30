
package com.hasan.cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args)
            throws CloneNotSupportedException {

        Human hasan = new Human(34, "Mohamed Hasan M");

        // Create a deep copy
        Human twin = (Human) hasan.clone();

        System.out.println("Original Object:");
        System.out.println(hasan.age + " " + hasan.name);
        System.out.println(Arrays.toString(hasan.arr));

        System.out.println("\nCloned Object:");
        System.out.println(twin.age + " " + twin.name);
        System.out.println(Arrays.toString(twin.arr));

        // Modify the cloned object's array
        twin.arr[0] = 100;

        System.out.println("\nAfter modifying twin.arr:");

        System.out.println("Original array: "
                + Arrays.toString(hasan.arr));

        System.out.println("Cloned array: "
                + Arrays.toString(twin.arr));
    }
}
