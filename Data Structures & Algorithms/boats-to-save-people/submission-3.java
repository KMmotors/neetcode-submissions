class Solution {
    public int numRescueBoats(int[] people, int limit) {
       int count=0;
       int start=0;
       int end=people.length-1;
       int sum=0;
       Arrays.sort(people);
       while(start<=end){
        sum=people[start]+people[end];
        
        if(sum<=limit){
            start++;
          
        }
        
            end--;
            count++;
        

       } 
       return count;
    }
}