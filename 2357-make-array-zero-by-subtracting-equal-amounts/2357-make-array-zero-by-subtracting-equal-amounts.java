class Solution {
    public int minimumOperations(int[] nums) {
        int n=nums.length;
        int count=0;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(nums[i]>0 && (i==0 || nums[i] != nums[i-1])){
                count++;
            }


        }
        return count;
        
    }
}