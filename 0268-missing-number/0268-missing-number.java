class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        if (nums[0] != 0) {
            return 0;
        }
        int l=0,r=1;
       while(r<nums.length){
        if(nums[l]+1==nums[r]){
            l++;
        r++;
        }
        
        else{
        return nums[l]+1;
        }

       }
       return nums[nums.length-1]+1;
    }
}