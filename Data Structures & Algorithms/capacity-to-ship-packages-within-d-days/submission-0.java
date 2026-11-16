class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int start = 0;   
        int end = 0;     
        for (int w : weights) {
            start = Math.max(start, w);
            end += w;
        }

        while (start < end) {
            int mid = start + (end - start) / 2;

         
            int day = 1;
            int sum = 0;
            for (int w : weights) {
                if (sum + w > mid) {
                    day++;
                    sum = 0;
                }
                sum += w;
            }

            if (day > days) start = mid + 1; 
            else end = mid;                    
        }

        return start;
    }
}