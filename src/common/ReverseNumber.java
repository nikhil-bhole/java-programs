package common;

public class ReverseNumber {

    public static void main(String[] args) {
        System.out.println(reverse(54321));
    }

    public static long  reverse(int input) {
        int reversed = 0;
        while (input!=0) {
            reversed = reversed * 10 + input % 10;
            input /=10;
         }
        return reversed;
    }
}
