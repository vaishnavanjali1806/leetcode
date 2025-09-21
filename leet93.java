class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            for(int j = i+1 ; j < n ; j++){
                int product = 1;
                for(int k = i; k < j; k++){
                    product= product * nums[k];
                }
                  max = Math.max(max, product);
            }
              
        }
         return max;
        
    }
}
