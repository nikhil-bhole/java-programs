package common;

public class MostRepeatingCharacter {
    
  static final int ASCII_SIZE = 256;
  
  public static String  getMostRepeatedCharacter(String str) {

        // Create array to keep the count of individual characters and initialize the array as 0
        int[] count = new int[ASCII_SIZE];
        int len = str.length();
        for (int i = 0; i < len; i++)
            count[str.charAt(i)]++;

        int max = Integer.MIN_VALUE; // Initialize max count
        String result = ""; // Initialize result

        // Traversing through the string and maintaining
        // the count of each character
        for (int i = 0; i < len; i++) {
            if (max < count[str.charAt(i)]) {
                max = count[str.charAt(i)];
                if(max > 1) {
                    result = String.valueOf(str.charAt(i));
                }
                else {
                    result = "No repeating character in String";
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "nikhil";
        System.out.println("Max occurring character is "
                + getMostRepeatedCharacter(str));
    }
}
