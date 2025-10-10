class Solution {
    public String reverseStr(String s, int k) {
         char c[]=s.toCharArray();
    int n = s.length();
    for(int i = 0; i < n; i += 2*k){
        int left = i;
        int right = Math.min(i+k-1, n-1);

        while(left < right){
            char temp = c[left];
            c[left] = c[right];
            c[right] = temp;  
            left++;
            right--;
        }
    }
    return new String(c);
    }
}
