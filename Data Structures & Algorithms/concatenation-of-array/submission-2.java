class Solution {
    public int[] getConcatenation(int[] nums) {

        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            list.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            list.add(nums[i]);
        }

        int [] result = new int[2*nums.length];
        for(int i=0;i<result.length;i++){
            result[i]=list.get(i);
        }

        return result;
        
    }
}