class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length-1;
        for(int i =nums.length-2;i>=0;i--){
            if(i+nums[i]>=n){
                n=i;
            }
        }
        if(n==0){
            return true;
        }
        return false;
        
    }
    
}
