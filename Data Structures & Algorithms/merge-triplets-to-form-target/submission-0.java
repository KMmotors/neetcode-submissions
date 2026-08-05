class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
       int max=0;
       int max1=0;
       int max2=0;
       for(int []trip:triplets){
        if(trip[0]>target[0] || trip[1]>target[1] || trip[2]>target[2]){
            continue;

        }
        max=Math.max(max,trip[0]);
        max1=Math.max(max1,trip[1]);
        max2=Math.max(max2,trip[2]);
    }
    int [] result=new int[]{max,max1,max2};

    return Arrays.equals(result,target);
    

}}
