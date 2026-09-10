class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) { 
        int count=0,l=0,p=1;
        if(k<=1) return 0;
        for(int r=0;r<nums.length;r++){
            p*=nums[r];
          while(p>=k){
            p /= nums[l];
            l++;
          }
          count+=r-l+1;
            
        }
        return count;
    }
}