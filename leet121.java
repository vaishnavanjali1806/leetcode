class Solution {
    public String reverseVowels(String s) {
        int n= s.length();
        char[] c= s.toCharArray();
        int start = 0;
        int end = c.length-1;
        String vowels = "aeiouAEIOU";

        while(start < end){
             while (start < end && vowels.indexOf(c[start]) == -1) {
                start++;
            }
          
            while (start < end && vowels.indexOf(c[end]) == -1) {
                end--;
            }
            char temp = c[start];
            c[start] = c[end];
            c[end] = temp;
            start++;
            end--;
        }
         return new String(c);
           
        }
        
    }
