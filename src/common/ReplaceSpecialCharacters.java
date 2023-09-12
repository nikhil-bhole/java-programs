package common;

public class ReplaceSpecialCharacters {

    public static void main(String[] args) {
        String str = "I am      *in th#ing poss))ible  wa*ys!";
        String output = str.replaceAll("[^a-zA-Z0-9\\s]", "").replaceAll("\\s+", " ");
        System.out.println(output);

        String[] even = output.split(" ");
        String evenPlace = "";

        for(int i=0;i<even.length;i++) {
            if((i+1)%2!=0) {
                evenPlace = evenPlace + even[i] + " ";
            }
        }
        System.out.println(evenPlace.trim());
    }
}
