class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int a =1;
        while(set.contains(a)){
            a++;
        }
        return a;
    }
}