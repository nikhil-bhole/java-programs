package leetcode;

class Solution {
    
  public String reverseWords(String s) {
        String[] arr = s.split("\\s+");
        String output = "";
        
        for(int i=arr.length-1;i>=0;i--) {
            output = output + arr[i] + " ";
        }

        return output.trim();
    }
}
