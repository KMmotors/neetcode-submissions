class Solution {
    public int maxArea(int[] height) {
        int max_water = 0;
        int start = 0;
        int end = height.length - 1;

        while (start < end) {
            int width = end - start;
            int current_height = Math.min(height[start], height[end]);
            int current_water = width * current_height;
            max_water = Math.max(max_water, current_water);

            if (height[start] < height[end]) {
                start++;
            } else {
                end--;
            }
        }

        return max_water;
    }
}
