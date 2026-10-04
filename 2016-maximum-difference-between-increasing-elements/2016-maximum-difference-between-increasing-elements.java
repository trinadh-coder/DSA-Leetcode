class Solution {
    public int maximumDifference(int[] nums) {
       int n=nums.length,mini=nums[0],maxdiff=-1;
       if(n<2) return 0;
       for(int i=1;i<n;i++){
            if(nums[i]>mini){
                    int diff=nums[i]-mini;
                    maxdiff=Math.max(maxdiff,diff);
            }
            else{
                mini=nums[i];
            }
       }
       return maxdiff;

    }
}