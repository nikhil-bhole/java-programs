package common;

public class ReverseString {
    
    public static String reverse(String source) {
        int i, len = source.length();
        String reverse = "";

        for (i = (len - 1); i >= 0; i--){
            reverse = reverse + source.charAt(i);
        }

        return reverse;
    }

    public static void main(String[] args) {
        System.out.println(reverse("dumdum"));

        //single line solution:
        String reversed = new StringBuilder("dumdum").reverse().toString();

        System.out.println(reversed);
    }
}
