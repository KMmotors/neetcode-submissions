class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int a:nums){
            map.put(a,map.getOrDefault(a,0)+1);
        }

        for(int a:map.values()){
            if(a>1){
                return true;
            }
        }
        return false;
    }
}