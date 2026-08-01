class Solution {
    public int subarraySum(int[] nums, int k) {
       int current_Sum=0;
       int count=0;
       HashMap<Integer,Integer> map = new HashMap<>();
       map.put(0,1);
       for(int i=0;i<nums.length;i++){
        current_Sum+=nums[i];
        if(map.containsKey(current_Sum-k)){
            count+=map.get(current_Sum-k);
        }
        map.put(current_Sum,map.getOrDefault(current_Sum,0)+1);
       }

       return count;


       
       
    }
}