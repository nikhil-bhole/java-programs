package common;

import java.util.Arrays;

public class MergeArrays {

    public static void main(String[] args) {
         int[] a = {1,2,3,4,5};
         int[] b = {6,7,8,9,0};
         int resultantLength = a.length + b.length;

         int[] resultant = new int[resultantLength];

         for(int i = 0; i<a.length; i++) {
             resultant[i] = a[i];
         }

         for(int j = 0; j<b.length; j++) {
             resultant[a.length+j] = b[j];
         }

        System.out.println(Arrays.toString(resultant));
    }
}
