package common;

import java.util.LinkedHashSet;
import java.util.Set;

public class ArrayDuplicates {

    static int[] array = {1,3,5,3,10,45,5,99,3};
    static void withoutSet(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[arr[i] % arr.length]
                    = arr[arr[i] % arr.length]
                    + arr.length;
        }
        System.out.println("The repeating elements are : ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= arr.length * 2) {
                System.out.println(i + " ");
            }
        }
    }

    static void removeDuplicatesWithSet(int[] arr) {
        Set<Integer> duplicates = new LinkedHashSet<>();

        /*for(int a: arr) {
            duplicates.add(a);
        }
        System.out.println(duplicates);*/

        for (int b :arr) {
            if(!(duplicates.add(b))){
                System.out.println("DUP: " + b);
            }
        }
    }

    public static void main(String[] args) {
        //withoutSet(array);
        removeDuplicatesWithSet(array);
    }
}
