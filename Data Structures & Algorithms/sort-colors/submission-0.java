class Solution {
    public void sortColors(int[] nums) {
        int low=0;
        int high=nums.length-1;
        int start=0;
        while(start<=high){
            if(nums[start]==0){
                swap(nums,start++,low++);
            }
            else if(nums[start]==2){
                swap(nums,start,high--);
            }
            else{
                start++;
            }
        }
    }
    public void swap(int []nums,int a,int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}