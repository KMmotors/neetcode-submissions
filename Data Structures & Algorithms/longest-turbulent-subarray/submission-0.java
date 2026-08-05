class Solution {
    public int maxTurbulenceSize(int[] arr) {
        int max=1;
        int down=1;
        int flat=1;
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>arr[i+1]){
                max=down+1;
                down=1;
            }
            else if(arr[i]<arr[i+1]){
                down=max+1;
                max=1;
                
            }
            else if(arr[i]==arr[i+1]){
                max=1;
                down=1;
            }
            flat=Math.max(flat,Math.max(max,down));
        }
        return flat;
    }
}