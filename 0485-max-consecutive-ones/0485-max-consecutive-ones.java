class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
       int maxans=0;
       int count=0;
       for(int i=0;i<n;i++){
        if(nums[i]==1){
            count++;
            
        }
        else{
            maxans=Math.max(maxans,count);
            count=0;
        }
       }
       return Math.max(maxans, count);
       
    }
}