class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gas_sum=0;
        int cost_sum=0;
        for(int i=0;i<gas.length;i++){
            gas_sum=gas_sum+gas[i];
        }

        for(int i=0;i<cost.length;i++){
            cost_sum=cost_sum+cost[i];
        }
        if(gas_sum<cost_sum){
            return -1;
        }
        int [] result = new int[gas.length];
        int total=0;
        int res=0;
     

        for(int i=0;i<gas.length;i++){
         
                total+=gas[i]-cost[i];

                if(total<0){
                    total=0;
                    res=i+1;
                }
                

            
            
        }
        return res;
        }
}
