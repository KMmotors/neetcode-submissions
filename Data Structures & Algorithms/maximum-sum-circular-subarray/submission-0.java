class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int total =0;
        int maxSum=nums[0];
        int currmax=0;
        int minSum=nums[0];
        int currmin=0;
        for(int num:nums){
            total=total+num;
            currmax=Math.max(currmax+num,num);
            maxSum=Math.max(maxSum,currmax);
            currmin=Math.min(currmin+num,num);
            minSum=Math.min(minSum,currmin);

        }
        if(maxSum<0){
            return maxSum;
        }

        return Math.max(maxSum,total-minSum);
    }
}