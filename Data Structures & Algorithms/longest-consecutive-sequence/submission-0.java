
class Solution {
    public int longestConsecutive(int[] nums) {
        // Base case: if array is empty, the longest sequence is 0
        if (nums.length == 0) return 0;

        // 1. Sort the array first
        Arrays.sort(nums);

        int longestStreak = 1;
        int currentStreak = 1;

        // 2. Loop through the array using index 'i'
        for (int i = 0; i < nums.length - 1; i++) {
            // Skip duplicate numbers so they don't reset or increase our streak
            if (nums[i] == nums[i + 1]) {
                continue; 
            }
            
            // If the next number is exactly 1 greater, extend the current streak
            if (nums[i] + 1 == nums[i + 1]) {
                currentStreak++;
            } else {
                // Otherwise, the streak broke! Save maximum and reset streak to 1
                longestStreak = Math.max(longestStreak, currentStreak);
                currentStreak = 1;
            }
        }

        // Return the highest streak found (handling the final loop check)
        return Math.max(longestStreak, currentStreak);
    }
}
