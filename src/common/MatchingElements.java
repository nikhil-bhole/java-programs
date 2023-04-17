package common;

import java.util.HashSet;
import java.util.Set;

//Program to find out matching elements from 2 arrays
public class MatchingElements {

    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] b = {4,5,6,1,2};
        
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    set.add(a[i]);
                    break;
                }
            }
        }
        for (int i : set) {
            System.out.print(i + " ");
        }
    }
}
