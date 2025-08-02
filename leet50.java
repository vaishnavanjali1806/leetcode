class Solution {
    public int maxArea(int[] height) {
        int maxWater = 0;
        int n = height.length;
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int width = j - i;
                int h = Math.min(height[i], height[j]);
                int currentWater = width * h;
                maxWater = Math.max(maxWater, currentWater);
            }
        }
        
        return maxWater;
    }
}
