class Solution {
    public int numOfSubarrays(int[] arr) {
          final int MOD = (int) (1e9 + 7);
        int n = arr.length;
        int count = 0;

        
        for (int startIndex = 0; startIndex < n; startIndex++) {
            int currentSum = 0;
          
            for (int endIndex = startIndex; endIndex < n; endIndex++) {
                currentSum += arr[endIndex];
              
                if (currentSum % 2 != 0) {
                    count++;
                }
            }
        }

        return count % MOD;
    }
}
