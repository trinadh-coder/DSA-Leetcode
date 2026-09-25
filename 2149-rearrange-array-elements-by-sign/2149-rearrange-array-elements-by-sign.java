class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        int n=nums.length,pos=0,neg=1;
        int[] k=new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                k[pos]=nums[i];
                pos+=2;
            }
            else{
                k[neg]=nums[i];
                neg+=2;
            }
        }
       return k; 
    }
}