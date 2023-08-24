package common;

import java.util.LinkedHashMap;
import java.util.Map;

public class ReduceString {
    /**
     * Given a string lowercase letters , reduce it by removing the characters which appear more than n times in the string .
     * Examples:
     * Input: str = "avalara"
     * n = 4
     * Output: vlr
     */
    public static void solution() {
        String str = "aaabbcd";
        char [] charArray = str.toCharArray();
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char c : charArray) {
            int count = 1;
            if (!(map.containsKey(c))) {
                map.put(c, count);
            } else {
                map.put(c, map.get(c)+1);
            }
        }
        StringBuilder builder = new StringBuilder();
        for (var entry : map.entrySet()) {
            if (entry.getValue() != 3) {
                builder.append(entry.getKey());
            }
        }
        System.out.println(builder);
    }

    public static void main(String[] args) {
        solution();
    }
}
