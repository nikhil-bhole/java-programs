package leetcode;

class Solution {
    
  public String reverseWords(String s) {
        String[] arr = s.split("\\s+");
        String output = "";
        StringBuilder sb = new StringBuilder();

        for(int i=arr.length-1;i>=0;i--) {
            output = output + arr[i] + " ";
        }

        return output.trim();
    }
}
