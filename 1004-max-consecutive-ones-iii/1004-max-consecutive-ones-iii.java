class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0;
        int r=0;
        int zerocount=0;
        
        for(r=0;r<nums.length;r++){
            if(nums[r]==0){
                zerocount++;
            }
            if(zerocount>k){
                if(nums[l]==0){
                    zerocount--;
                }
                l++;
            }

        }
        return r-l;
    }
}