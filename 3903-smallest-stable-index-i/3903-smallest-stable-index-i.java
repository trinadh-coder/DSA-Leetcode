class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        for(int i=0;i<n;i++){
           int currentMax = nums[0];
            for (int j = 0; j <= i; j++) {
                currentMax = Math.max(currentMax, nums[j]);
            }
            int currentMin = nums[i];
            for (int j = i; j < n; j++) {
                currentMin = Math.min(currentMin, nums[j]);
            }
            if(currentMax-currentMin<=k){
               
            
            return i;
            }
            
        }
     return -1;   
        
    }
}