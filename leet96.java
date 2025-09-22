import java.util.HashMap;

class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int maxFreq = 0;

       
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
            maxFreq = Math.max(maxFreq, freq.get(num));
        }

        
        int count = 0;
        for (int val : freq.values()) {
            if (val == maxFreq) {
                count += val;
            }
        }

        return count;
    }
}
