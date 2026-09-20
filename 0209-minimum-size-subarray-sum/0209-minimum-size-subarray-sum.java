class Solution {
    public int minSubArrayLen(int target, int[] nums) {
     int l=0,currentsum=0;
        int minLength = Integer.MAX_VALUE;
        for (int r = 0; r < nums.length; r++){
            currentsum += nums[r];
            while (currentsum >= target) {
                minLength = Math.min(minLength, r- l + 1);
                currentsum-=nums[l];
                l++;}
        }
        return minLength==Integer.MAX_VALUE ? 0 : minLength;
    }
}